<%@ taglib prefix="tagsKo" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<HTML>
<HEAD>

<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>includex.jsp</TITLE>
</HEAD>
<BODY>
	<tagsKo:header subTitle="We take the string out of SOAP."/>
	<br>
	<em> Welcome to our Web Service Support Group.</em> <br><br>
		 Contact us at: ${initParam.mainEmail}
</BODY>
</HTML>
