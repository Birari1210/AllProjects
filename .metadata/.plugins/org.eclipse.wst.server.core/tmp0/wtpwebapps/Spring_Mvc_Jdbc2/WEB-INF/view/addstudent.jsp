<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>.error{background-color: cyan; color:red; font-size:18px;}</style>

</head>
<body>

<form:form action="addstudent" modelAttribute="objS">

<p>
  Enter Student Roll_No <br>
  <form:input path="roll_no" />
</p>
<p>
  Enter Student First Name <br>
  <form:input path="fristname" />
    <form:errors path="fristname" class="error" />
  
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
  <form:errors path="mothername" class="error" />
  
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
      <form:errors path="student_phoneno" class="error" />
  
</p>
<p>
  Enter Student parent phone number <br>
  <form:input path="parent_phoneno" />
        
</p>
<p>
  Enter Student parent email <br>
  <form:input path="email_parent" />
        <form:errors path="email_parent" class="error"/>
  
</p>

<p><input type="submit" value="Add"></p>
</form:form>

</body>
</html>