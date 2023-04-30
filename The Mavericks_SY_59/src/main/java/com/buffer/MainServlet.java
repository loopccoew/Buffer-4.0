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
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static DataImport dm = new DataImport();
	public static Heap h = new Heap(48);
	public static Method vozilopark = new Method();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DataImport dm = new DataImport();
		//Method vozilopark=new Method();
		//Heap h=new Heap(48);
		try {
			dm.insertdata(dm.con,vozilopark,h);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}

}
