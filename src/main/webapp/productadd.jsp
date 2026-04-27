<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="container mt-5">

<h2>Add Product</h2>

<form action="AddProductServlet" method="post">

<input class="form-control mb-2" type="number" name="id" placeholder="Product ID" required>

<input class="form-control mb-2" type="text" name="name" placeholder="Product Name" required>

<input class="form-control mb-2" type="text" name="category" placeholder="Category" required>

<input class="form-control mb-2" type="number" name="price" placeholder="Price" required>

<input class="form-control mb-2" type="number" name="quantity" placeholder="Quantity" required>

<button class="btn btn-primary">Add</button>

</form>

<br><br>
<a href="index.jsp">⬅ Back</a>

</body>
</html>