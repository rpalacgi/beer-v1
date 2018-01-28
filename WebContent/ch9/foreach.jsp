<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>foreach.jsp</TITLE>
</HEAD>
<BODY>

<%! java.util.ArrayList movieList  = new java.util.ArrayList();%>

<% 
   movieList.add("Star Wars");
   movieList.add("Matrix");
   movieList.add("Kung Fu Panda"); 
   movieList.add("Ghandi"); 
   movieList.add("Pirates of Silicon V.");
   movieList.add("Social Network");
 
   //This is necessary if any output would be retried  by c Foreach it calls attributes
   request.setAttribute("movieList", movieList);
%>

<table>
	<c:forEach var="i" items="${movieList}">
		<tr>
			<td> ${i} </td>
		</tr>
	</c:forEach>
</table>
	


</BODY>
</HTML>
