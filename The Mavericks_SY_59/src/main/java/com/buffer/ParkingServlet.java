package com.buffer;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.catalina.Globals;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ParkingServlet")
public class ParkingServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		DataImport dm = new DataImport();
//		Method vozilopark=new Method();
//		Heap h=new Heap(48);
//		try {
//			MainServlet.dm.insertdata(MainServlet.dm.con,MainServlet.vozilopark,MainServlet.h);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String vehicleNo = (String) request.getAttribute("vehicleNo");
		String phoneNo = (String) request.getAttribute("phoneNo");
		
		String s1 = null;
		
		try {
			s1 = MainServlet.dm.getnearest(MainServlet.dm.con,MainServlet.vozilopark,MainServlet.h, vehicleNo, phoneNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1);
		
		int floor = Integer.parseInt(s1.substring(0,1));
		String s = s1.substring(1);
		if(s.charAt(0) != 'B') {
			int width = 100 - (6 - Integer.parseInt(s.substring(1))) * 15;
			String road = "<div style = 'width : "+Integer.toString(width)+"% ;float : right; height : 100%; background : yellow;'></div>";
			request.setAttribute("road", road);
			String empBox = "<script>myFunction2('white');</script>";
			request.setAttribute("emp-park", empBox);
			String bottom_road = "<div style = 'width : "+Integer.toString(width)+"% ;float : left; height : 100%; background : white;'></div>";
			request.setAttribute("bottom-road", bottom_road);
		}
		else {
			int width = 15 * (Integer.parseInt(s.substring(1)) + 1);
			String road = "<div style = 'width : 100% ;float : right; height : 100%; background : yellow;'></div>";
			request.setAttribute("road", road);
			String empBox = "<script>myFunction2('yellow');</script>";
			request.setAttribute("emp-park", empBox);
			String bottom_road = "<div style = 'width : "+Integer.toString(width)+"% ;float : left; height : 100%; background : yellow;'></div>";
			request.setAttribute("bottom-road", bottom_road);
		}
		
		
		request.setAttribute("label", floor);
		request.setAttribute("ele", s);
		RequestDispatcher rd = request.getRequestDispatcher("parking.jsp");
		rd.forward(request, response);
		
	}

}
