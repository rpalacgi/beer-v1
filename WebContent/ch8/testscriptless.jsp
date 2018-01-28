<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>testscriptless.jsp</TITLE>
</HEAD>
<BODY>

This is an example of using attributes. Attributes Fu!!!<br>

<jsp:useBean id="cat" class="ch8.Cat" scope="session"/>

	The name of the cat is: <jsp:getProperty name="cat" property="name"/> <br>

<jsp:useBean id="employee" class="ch8.Employee" scope="request" />

	The Serial of Employee is: <jsp:getProperty name="employee" property="ssn" /> <br>

<jsp:useBean id="robbi" type="ch8.Person" class="ch8.Employee" scope="application"/>

	The name of the Employee is: <jsp:getProperty name="robbi" property="name" />


</BODY>
</HTML>
