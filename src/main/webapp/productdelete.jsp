<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Delete Product</title>

<meta charset="UTF-8">  <!-- ✅ ADD THIS LINE -->

<style>
body {
    font-family: Arial;
    text-align: center;
    margin-top: 100px;
}

input {
    padding: 8px;
    margin: 10px;
}
</style>

</head>

<body>

<h2>Delete Product</h2>

<form action="DeleteProductServlet" method="post">

Enter Product ID:
<input type="number" name="id" required>

<br>

<input type="submit" value="Delete">

</form>

<br>
<a href="index.jsp">⬅ Back</a>

</body>
</html>