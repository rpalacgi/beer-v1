<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>choose</TITLE>
</HEAD>
<BODY>

<%! String userPref = new String();%>
<% 
   userPref = "member";
   request.setAttribute("userPref", userPref);
%>

<c:choose>

	<c:when test="${userPref == 'performance' }">
		How you can stop even if you <em> do </em> dirve insanely fast.
	</c:when>

	<c:when test="${userPref == 'member' }">
		Our brakes will never lock up, no matter how bad a driver you are
	</c:when>

	<c:when test ="${userPref == 'maintenance'}">
		Lost your tech job? No problem you won't have to service these brakes
		for atleast three years.
	</c:when>

	<c:otherwise>
		Our brakes are the best.
	</c:otherwise>
</c:choose>

</BODY>
</HTML>
