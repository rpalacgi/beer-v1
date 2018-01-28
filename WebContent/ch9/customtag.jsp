<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>customtag.jsp</TITLE>
</HEAD>
<BODY>

<%  String username = "robbiwan";
	request.setAttribute("username", username); %>

<%@ taglib prefix="mine" uri="/WEB-INF/myFunctions.tld" %>

Advisor Page <br>

<mine:advice user="${username}" />


</BODY>
</HTML>
