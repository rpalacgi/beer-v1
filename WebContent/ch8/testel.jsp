<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>testel.jsp</TITLE>
</HEAD>
<BODY>

<div id="main">

<p class="title"> Object example </p>
<p class="label"> Dog's name is: ${emp.dog.name} </p>


<p> Map example </p>
<p class="label" > Map is: ${map["one"]} </p>



<p> Array example </p>
<p class="label" > Map is: ${weeks[1]} </p>


<p> ArrayList example </p>
<p class="label" > ArrayList is: ${arraylist["1"]} </p>

</div>


Method is: ${ pageContext.request.method }

</BODY>
</HTML>
