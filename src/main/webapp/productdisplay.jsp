<%@ page contentType="text/html;charset=UTF-8" %>   <!-- ✅ ADD THIS -->
<%@ page import="java.util.*,com.dao.ProductDAO,com.model.Product"%>

<html>
<head>
<title>Product List</title>

<meta charset="UTF-8">   <!-- ✅ ADD THIS -->

<style>
body {
    font-family: Arial;
    text-align: center;
}

table {
    margin: auto;
    border-collapse: collapse;
    width: 80%;
}

th, td {
    padding: 10px;
    border: 1px solid black;
}

th {
    background-color: #f2f2f2;
}
</style>

</head>

<body>

<h2>Product List</h2>

<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Category</th>
<th>Price</th>
<th>Quantity</th>
</tr>

<%
List<Product> list = ProductDAO.getAllProducts();
for(Product p : list){
%>

<tr>
<td><%=p.getId()%></td>
<td><%=p.getName()%></td>
<td><%=p.getCategory()%></td>
<td><%=p.getPrice()%></td>
<td><%=p.getQuantity()%></td>
</tr>

<% } %>

</table>

<br><br>

<a href="index.jsp">⬅ Back</a>

</body>
</html>