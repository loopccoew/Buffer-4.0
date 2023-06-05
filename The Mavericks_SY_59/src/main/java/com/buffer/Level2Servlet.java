package com.buffer;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Level2Servlet
 */
@WebServlet("/Level2Servlet")
public class Level2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
Hashtable hash = MainServlet.vozilopark.node;
		
		String s = "";
		
		for(int i = 0; i<16; i++) {
			if(hash.Floor2[i].fill) {
				s += "1";
			}
			else {
				s += "0";
			}
		}
		
		int name = 3;
		//String s = "1110010110110101";
		
			request.setAttribute("label", name);
			request.setAttribute("ele", s);
			RequestDispatcher rd = request.getRequestDispatcher("/level2.jsp");
			rd.forward(request, response);
			
		}
}
