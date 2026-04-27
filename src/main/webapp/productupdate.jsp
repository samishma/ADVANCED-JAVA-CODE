<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Update Product</title>

<style>
body {
    font-family: Arial;
    text-align: center;
    margin-top: 80px;
}

form {
    display: inline-block;
    text-align: left;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 10px;
}

input {
    width: 250px;
    padding: 8px;
    margin: 8px 0;
}

button {
    padding: 10px 20px;
    background-color: blue;
    color: white;
    border: none;
    cursor: pointer;
}

button:hover {
    background-color: darkblue;
}
</style>

</head>

<body>

<h2>Update Product</h2>

<form action="UpdateProductServlet" method="post">

<label>ID:</label><br>
<input type="number" name="id" required><br>

<label>Name:</label><br>
<input type="text" name="name" required><br>

<label>Category:</label><br>
<input type="text" name="category" required><br>

<label>Price:</label><br>
<input type="number" name="price" required><br>

<label>Quantity:</label><br>
<input type="number" name="quantity" required><br>

<br>
<button type="submit">Update Product</button>

</form>

<br><br>
<a href="index.jsp">⬅ Back</a>

</body>
</html>