package ch6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCookie extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestCookie() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//String name = request.getParameter("username");
		String name = "robbiwan";
		
		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("/ch6/cookieresult.jsp");
		view.forward(request,response);
	}


}