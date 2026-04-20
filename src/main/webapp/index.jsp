<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Marks Form</title>
<style>
.form-box {
    width: 350px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
</style>
</head>
<body>

<div class="form-box">
<h2>Enter Student Details</h2>

<form action="ResultServlet" method="post">

Roll No: <input type="text" name="rollno" required><br><br>
Name: <input type="text" name="name" required><br><br>

Sub1: <input type="number" name="sub1" min="0" max="100" required><br><br>
Sub2: <input type="number" name="sub2" min="0" max="100" required><br><br>
Sub3: <input type="number" name="sub3" min="0" max="100" required><br><br>
Sub4: <input type="number" name="sub4" min="0" max="100" required><br><br>
Sub5: <input type="number" name="sub5" min="0" max="100" required><br><br>

<input type="submit" value="Calculate Result">

</form>
</div>

</body>
</html>