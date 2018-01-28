<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page import="java.util.*, java.io.*"  language="java"  contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>result.jsp</TITLE>
</HEAD>
<BODY>
<P>

<% 
	List styles = (List) request.getAttribute("styles");
    Iterator it = styles.iterator();
	while(it.hasNext()) {
 		try {
            out.print("JSP Writer Page");
			out.print("<br>try: " + it.next() );
		} catch( IOException e) {
			e.printStackTrace();
        }
	}
%>


</P>
</BODY>
</HTML>
