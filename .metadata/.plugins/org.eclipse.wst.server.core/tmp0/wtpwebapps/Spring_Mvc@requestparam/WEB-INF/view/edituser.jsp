<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Item here</title>
</head>
<body>
Edit User Details
<div style="margin:0 auto; width:500px;">
<form:form action="edititemsbt" modelAttribute="userobj">
<p> 
<form:hidden path="uid"/>
  Enter User name <br>
  <form:input path="name" />
</p>
<p>
  Enter user address <br>
  <form:input path="address" />
</p>
<p>
  Enter user Mobile <br>
  <form:input path="mobileNo" />
</p>
<p><input type="submit" value="Add"></p>
</form:form>

</div>
</body>
</html>