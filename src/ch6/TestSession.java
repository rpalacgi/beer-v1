package ch6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestSession extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestSession() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test Sessions <br>");
		HttpSession session = request.getSession(false);
		
		
		if(session == null ) {
			out.println("No session was available <br>");
			out.println("making one...");
			session = request.getSession();
			session.setAttribute("name", "robbi");
			
		} else {
			session.setAttribute("name", "robbi");
			//if()
			out.println("Session Get Creation Time: " + session.getCreationTime() + "<br>");
			out.println("Session Max Interval: " + session.getMaxInactiveInterval() + "<br>");
			out.println("Session Last Accessed: " + session.getLastAccessedTime() + "<br>");
			
			out.println("There was a session! <br>");
			String name = (String) session.getAttribute("name");
			out.println("Welcome Back: " + name );
			
			String strURL = response.encodeURL("/ListenerTester");
			
			out.println("<a href=\"" + response.encodeURL("/ListenerTester") + "\"> click me </a>");
			
			response.encodeRedirectURL("/ListenerTester");
			
		}
		
	}

	

}