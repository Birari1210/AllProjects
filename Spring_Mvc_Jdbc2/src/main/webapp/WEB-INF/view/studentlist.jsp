<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details Assingment</title>
</head>
<body>
<div style="margin:0 auto; width:500px;">
<div><a href="addstudent">Add Students</a></div>
<table border="2" cellpadding="3">
  
  <tr>
   <th>Student ID</th>
   <th>Student roll no</th>
   <th>FirstName</th>
   <th>Last name</th>
   <th>Father name</th>
   <th>Mother name</th>
   <th>class name </th>
   <th>Section</th>
   <th>Date of Birth</th>
   <th>Date of admission</th>
   <th>gender</th>
   <th>address line1</th>
   <th>address line2</th>
   <th>City</th>
   <th>Student phone Number</th>
   <th>parent phone Number</th>
   <th>parent Email</th>
   
   <th>Edit Student record</th>
   <th>delete student</th>
  
  </tr>
  <c:forEach var="s" items="${studentlist}">
    <tr>
   <td>${s.id} </td>
   <td>${s.roll_no} </td>
   <td>${s.fristname}</td>
   <td>${s.lastname}</td>
   <td>${s.fathername}</td>
   <td>${s.mothername}</td>
   <td>${s.classname}</td>
   <td>${s.section} </td>
   <td>${s.dob}</td>
   <td>${s.date_of_admission}</td>
   <td>${s.gender}</td>
   <td>${s.add1}</td>
   <td>${s.add2}</td>
   <td>${s.city} </td>
   <td>${s.student_phoneno}</td>
   <td>${s.parent_phoneno}</td>
   <td>${s.email_parent}</td>
  
   <td><a href="${pageContext.request.contextPath}/editstudent/${s.id}">Edit</a></td>
   <td><a href="${pageContext.request.contextPath}/deletestudent/${s.id}">Delete</a></td>
   </tr>
 </c:forEach>
</table>
</div>
</body>
</html>