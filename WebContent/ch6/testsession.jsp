<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>testsession.jsp</TITLE>
</HEAD>
<BODY>
<P>

	<% 
	   String name = (String) session.getAttribute("name"); // session == session
	   String dogname =  application.getInitParameter("name"); // application == ServletContext
    %>
	
	The name is: <%= name %>	<br>
    The name of our dog is: <%= dogname%>

</P>
</BODY>
</HTML>
