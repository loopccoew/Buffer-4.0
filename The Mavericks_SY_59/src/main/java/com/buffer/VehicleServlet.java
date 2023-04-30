package com.buffer;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleServlet
 */
@WebServlet("/VehicleServlet")
public class VehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String vehicleNo = request.getParameter("vehicle");
		String phoneNo = request.getParameter("phone");
		
//		System.out.println(vehicleNo);
//		System.out.println(phoneNo);
		
		request.setAttribute("vehicleNo", vehicleNo);
		request.setAttribute("phoneNo", phoneNo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ParkingServlet");
		rd.forward(request, response);
	}

}
