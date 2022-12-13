<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" cellpadding="5">
 <tr>
   <th>User id</th>
   <th>User Name</th>
   <th>User Address</th>
   <th>User Mobile</th>   
   <th>Edit Operation</th>
   <th>Delete Operation</th>
  </tr>
  <c:forEach var="i" items="${userlist}">
   <tr>
   <td>${i.uid} </td>
   <td>${i.name }</td>
   <td>${i.address }</td>
   <td>${i.mobileno }</td> 
   <td><a href="${pageContext.request.contextPath}/edititem/${i.uid}">Edit</a></td>
   <td><a href="${pageContext.request.contextPath}/deleteitem/${i.uid}">Delete</a></td>
   </tr>
  </c:forEach>
</table></body>
</html>