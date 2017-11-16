package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet004 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//variable compartida por todas las peticiones
	private int peticiones;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println(peticiones);
		peticiones++;
		pw.close();
	} 	

}
