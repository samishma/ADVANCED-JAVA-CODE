<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*,com.model.Product" %>

<h2>Report Result</h2>

<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Category</th>
<th>Price</th>
<th>Quantity</th>
</tr>

<%
List<Product> list = (List<Product>)request.getAttribute("list");

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

<br>
<a href="reports.jsp">&#8592; Back</a>