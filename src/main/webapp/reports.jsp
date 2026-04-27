<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Reports</title>
</head>

<body>

<h2>Reports</h2>

<form action="ReportServlet" method="get">

Price greater than:
<input type="text" name="price"><br><br>

Category:
<input type="text" name="category"><br><br>

Top N Products:
<input type="text" name="limit"><br><br>

<input type="submit" value="Generate Report">

</form>

<br>
<a href="index.jsp">⬅ Back</a>

</body>
</html>
<br><br>
