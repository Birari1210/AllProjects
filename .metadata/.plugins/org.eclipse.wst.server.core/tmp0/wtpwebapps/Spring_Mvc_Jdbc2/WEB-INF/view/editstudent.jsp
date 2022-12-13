<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details Assingment</title>
</head>
<body>
Edit Student Details
<div style="margin:0 auto; width:500px;">
<form:form action="editstudent" modelAttribute="studentobj">
<p> 
<form:hidden path="id"/>
  Enter Student Roll_No <br>
  <form:input path="roll_no" />
</p>
<p>
  Enter Student First Name <br>
  <form:input path="fristname" />
</p>
<p>
  Enter Student Last name <br>
  <form:input path="lastname" />
</p>
<p>
  Enter Student Father name <br>
  <form:input path="fathername" />
</p>
<p>
  Enter Student Mother Name <br>
  <form:input path="mothername" />
</p>
<p>
  Enter Student Class Name <br>
  <form:input path="classname" />
</p>
<p>
  Enter Student Section <br>
  <form:input path="section" />
</p>

<p>
  Enter Student Date of Birth <br>
  <form:input path="dob" />
</p>
<p>
  Enter Student Date of admission <br>
  <form:input path="date_of_admission" />
</p>
<p>
  Enter Student gender <br>
  <form:input path="gender" />
</p>

<p>
  Enter Student Address line 1 <br>
  <form:input path="add1" />
</p>
<p>
  Enter Student address line2 or temporary address<br>
  <form:input path="add2" />
</p>
<p>
  Enter Student city <br>
  <form:input path="city" />
</p>

<p>
  Enter Student phone number <br>
  <form:input path="student_phoneno" />
</p>
<p>
  Enter Student parent phone number <br>
  <form:input path="parent_phoneno" />
</p>
<p>
  Enter Student parent email <br>
  <form:input path="email_parent" />
</p>

<p><input type="submit" value="Add"></p>
</form:form>
</div>
</body>
</html>