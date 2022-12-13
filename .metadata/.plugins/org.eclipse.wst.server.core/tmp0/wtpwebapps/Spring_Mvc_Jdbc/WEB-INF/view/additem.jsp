<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Assingment</title>
</head>
<body>
<h3>Insert the following details</h3>
<form:form action="additem" modelAttribute="objI">
<p>
  Enter item name <br>
  <form:input path="iname" />
</p>
<p>
  Enter item price <br>
  <form:input path="price" />
</p>
<p>
  Enter item quantity <br>
  <form:input path="quantity" />
</p>
<p>
  Enter item discount <br>
  <form:input path="discount" />
</p>

<p><input type="submit" value="Add"></p>
</form:form>

</body>
</html>