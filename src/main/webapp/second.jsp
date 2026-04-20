+<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>

<html>
<head>
    <title>Session Status</title>
</head>
<body>

<h2>Session Status</h2>

<%
    String name = (String) session.getAttribute("user");

    if (name == null) {
%>
        <h3>Sorry! Session has expired.</h3>
<%
    } else {
%>
        <h3>Hello <%= name %>! Your session is still active.</h3>
<%
    }
%>

</body>
</html>