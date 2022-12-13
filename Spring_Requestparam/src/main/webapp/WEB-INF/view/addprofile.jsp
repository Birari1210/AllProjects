<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Insert user details</h4>
<form:form action="saveprofile" modelAttribute="objU">
<p>
  Enter User ID <br>
  <form:input path="uid" />
</p>

<p>
  Enter User Name <br>
  <form:input path="name" />  
</p>
<p>
  Enter User Address <br>
  <form:input path="address" />
</p>
<p>
  Enter User Phone no <br>
  <form:input path="mobileno" />
   
</p>
<p><input type="submit" value="save"></p>
</form:form>
</body>
</html>