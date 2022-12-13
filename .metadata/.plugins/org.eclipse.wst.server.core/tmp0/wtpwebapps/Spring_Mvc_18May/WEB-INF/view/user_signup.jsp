<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Signup</title>
<style>.error{background-color: yellow; color:red; font-size:16px;}</style>
</head>
<body>

<form:form action="user_reg_submit" modelAttribute="obju">
<p>Enter First Name<br>
  <form:input path="fname" />
  <form:errors path="fname" class="error" />
</p>
<p>Enter last Name<br>
  <form:input path="lname" />
  <form:errors path="lname" class="error" />
</p>
<p>Enter Address Line 1<br>
  <form:input path="add1" /> 
  <form:errors path="add1" class="error" />
</p>
<p>Enter Address Line2<br>
  <form:input path="add2" />
  <form:errors path="add2" class="error" />
</p>
<p>Enter City<br>
  <form:input path="city" /> 
  <form:errors path="city" class="error" />
</p>
<p>Enter Pincode<br>
  <form:input path="pincode" />
  <form:errors path="pincode" class="error" />
</p>
<p>Enter PhoneNo<br>
  <form:input path="phoneno" />
  <form:errors path="phoneno" class="error" />
</p>
<p>
 <input type="submit" value="Signup"/>
</p>
</form:form>
</body>
</html>