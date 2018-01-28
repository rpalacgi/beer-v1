<HTML>
<HEAD>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>cimport.jsp</TITLE>
</HEAD>
<BODY>
	<jsp:include page="header.jsp">
		<jsp:param name="subTitle" value="We take the string out of SOAP." />
	</jsp:include>

	<br>
	<em> Welcome to our Web Service Support Group.</em> <br><br>
		 Contact us at: ${initParam.mainEmail}
</BODY>
</HTML>
