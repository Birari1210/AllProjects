<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin:0 auto; width:500px;">
<div><a href="additem">Add Item</a></div>
<table border="1" cellpadding="5">

<tr>
   <th>Item id</th>
   <th>Item Name</th>
   <th>Price</th>
   <th>Quantity</th>
   <th>Discount</th>
   <th>Total Price</th>
   <th>Edit </th>
   <th>Delete</th>
  </tr>
  <c:forEach var="i" items="${itemlist}">
   <tr>
   <td>${i.id} </td>
   <td>${i.iname }</td>
   <td>${i.price }</td>
   <td>${i.quantity}</td>
   <td>${i.discount}</td>
   <td>${i.total}</td>
   <td><a href="${pageContext.request.contextPath}/edititem/${i.id}">Edit</a></td>
   <td><a href="${pageContext.request.contextPath}/deleteitem/${i.id}">Delete</a></td>
   </tr>
  </c:forEach>
</table>
</div>
</body>
</html>