/*
 * Created on Jul 20, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package ch5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInitParams extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestInitParams() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<br> ---------Servlet Connfig-------------- <br>");
		
		Enumeration e =  getServletConfig().getInitParameterNames();
		
		while(e.hasMoreElements()) {
			out.println("param name = " + e.nextElement() + "<br>");
		}
		
		out.println("Main email is: " + getServletConfig().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("Admin Email is " + getServletConfig().getInitParameter("adminEmail"));
		
		out.println("<br> ---------Servlet Context-------------- <br>");
		out.println("param name =  " + getServletContext().getInitParameter("foo"));
		
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}