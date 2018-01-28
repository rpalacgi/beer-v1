package ch8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestScriptless extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestScriptless() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Session
		Cat cat = new Cat();
		cat.setName("Love");
		cat.setBreed("Persian");
		HttpSession session = request.getSession();
		session.setAttribute("cat", cat);
 
		//Request 
		Employee employee= new Employee();
		employee.setSsn("M100006");
		request.setAttribute("employee", employee);
		
		
		//ServletContext
		Employee rob = new Employee();
		rob.setName("Robbi");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("robbi", rob);
		
		RequestDispatcher view = request.getRequestDispatcher("/ch8/testscriptless.jsp");
		view.forward(request,response);
		
	}

	

}