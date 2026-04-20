<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Result</title>
<style>
.box {
    width: 350px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
</style>
</head>
<body>

<div class="box">

<h2>Student Marks Result</h2>

<% if(request.getAttribute("roll") != null) { %>

<p>Roll No: <%= request.getAttribute("roll") %></p>
<p>Name: <%= request.getAttribute("name") %></p>

<p>Subject 1: <%= request.getAttribute("s1") %></p>
<p>Subject 2: <%= request.getAttribute("s2") %></p>
<p>Subject 3: <%= request.getAttribute("s3") %></p>
<p>Subject 4: <%= request.getAttribute("s4") %></p>
<p>Subject 5: <%= request.getAttribute("s5") %></p>

<hr>

<p><b>Average Marks:</b> <%= request.getAttribute("avg") %></p>
<p><b>Result:</b> <%= request.getAttribute("result") %></p>

<% } else { %>
<p style="color:red;">Error in input!</p>
<% } %>

<br>
<a href="index.jsp">Go Back</a>

</div>

</body>
</html>