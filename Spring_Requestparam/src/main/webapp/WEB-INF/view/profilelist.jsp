<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Assingment</title>
</head>
<body>
<h5>User list Of data</h5>
<table border="1" cellpadding="5">
 <tr>
   <th>User id</th>
   <th>User Name</th>
   <th>User Address</th>
   <th>User Mobile</th>   
   <th>Edit Operation</th>
   <th>Delete Operation</th>
  </tr>
  <c:forEach var="p" items="${profilelist}">
   <tr>
   <td>${p.uid} </td>
   <td>${p.name }</td>
   <td>${p.address }</td>
   <td>${p.mobileno }</td> 
   <td><a href="${pageContext.request.contextPath}/edititem/${p.uid}">Edit</a></td>
   <td><a href="${pageContext.request.contextPath}/deleteitem/${p.uid}">Delete</a></td>
   </tr>
  </c:forEach>
</table></body>
</html>