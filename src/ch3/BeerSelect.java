package ch3;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public BeerSelect() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Servlet Implementation
		 * response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice <br>");
		String c = request.getParameter("color");
		out.println("<br>Got beer color " +c );
		
		BeerExpert be = new BeerExpert();
		List result  = be.getBrands(c);
		Iterator it = result.iterator();
		while(it.hasNext()) {
			out.println("<br> try: " + it.next());
		}*/
		
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("/ch3/result.jsp");
		view.forward(request,response);
	}

}