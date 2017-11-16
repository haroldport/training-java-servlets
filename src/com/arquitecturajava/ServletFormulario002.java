package com.arquitecturajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFormulario002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tope = Integer.parseInt(request.getParameter("numero"));
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		for (int i = 0; i < tope; i++) {
			pw.println("<p>Hola desde un Servlet</p>");
		}
		pw.println("</html>");
		pw.println("</body>");
		pw.close();
	}

}
