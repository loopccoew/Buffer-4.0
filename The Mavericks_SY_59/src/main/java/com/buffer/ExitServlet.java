package com.buffer;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExitServlet
 */
@WebServlet("/ExitServlet")
public class ExitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
//	DataImport dm = new DataImport();
//	Method vozilopark=new Method();
//	Heap h=new Heap(48);
	long amount = 0;
	String vehicleNo = request.getParameter("exitvehicle");
	System.out.println(vehicleNo);
//	try {
//		MainServlet.dm.insertdata(MainServlet.dm.con,MainServlet.vozilopark,MainServlet.h);
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	try {
		amount = MainServlet.dm.delete(MainServlet.dm.con,MainServlet.vozilopark ,MainServlet.h,vehicleNo);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	request.setAttribute("amount", amount);
			RequestDispatcher rd = request.getRequestDispatcher("/bill.jsp");
			rd.forward(request, response);
			
		}
}
