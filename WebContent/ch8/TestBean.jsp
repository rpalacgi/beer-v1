<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>TestBean.jsp</TITLE>
</HEAD>
<BODY>

<p> <jsp:useBean id="person" type="ch8.Person" class="ch8.Employee" />
<% //person.setName(request.getParameter("name")); %>

	<jsp:setProperty name="person" property="*" />

<p> <label class="label" >Setting Value for Person: </label> </p>

<p class="label"> Person is <jsp:getProperty name="person" property="name" /> </p>
<p class="label"> ID is <jsp:getProperty  name="person" property="empID" /> </p>
<p class="label"> SSN is <jsp:getProperty name="person" property="ssn" /> </p>
</BODY>
</HTML>
