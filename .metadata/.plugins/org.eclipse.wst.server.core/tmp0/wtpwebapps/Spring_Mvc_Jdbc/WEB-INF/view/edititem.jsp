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
Edit Item Details
<div style="margin:0 auto; width:500px;">
<form:form action="edititemsbt" modelAttribute="itemobj">
<p> 
<form:hidden path="id"/>
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

</div>
</body>
</html>