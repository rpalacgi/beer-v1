package ch8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch5.Dog;

public class TestEL extends HttpServlet implements Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public TestEL() {
		super();
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Object
		Employee employee = new Employee();
		employee.setName("Robbiwan");
		Dog princess = new Dog("Golden Retriever", "Princess");
		employee.setDog(princess);
		request.setAttribute("emp", employee);
		
		//Map
		HashMap mymap = new HashMap();
		mymap.put("one", "robbi");
		mymap.put("two", "roselle");
		request.setAttribute("map", mymap);
		
		//Array
		String[] arrWeek = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
		request.setAttribute("weeks", arrWeek);
		
		//ArrayList
		ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(arrWeek));
        request.setAttribute("arraylist", arrayList);
				
		RequestDispatcher view = request.getRequestDispatcher("/ch8/testel.jsp");
		view.forward(request,response);
		
	}

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}