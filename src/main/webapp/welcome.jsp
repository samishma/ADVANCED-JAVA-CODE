<%--9.c Build a Session Management using JSP program for getting  session expiry time and your name through text box and press submit to display the message by greeting Hello your name!.
press the following link to check it within  the set session time  or wait there for the minutes set  to see the session expiry.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    String timeStr = request.getParameter("time");

    int time = Integer.parseInt(timeStr); // minutes
    int seconds = time * 60;

    // Store session
    session.setAttribute("user", name);

    // Set expiry time
    session.setMaxInactiveInterval(seconds);
%>

<h2>Hello <%= name %>!</h2>
<p>Session has started...</p>
<p>Your name is stored in session.</p>
<p>Session expiry time is set to <%= time %> minute(s).</p>

<p>
Check the below link within the session time or wait to see expiry:
</p>

<a href="second.jsp">Check Session</a>

</body>
</html>