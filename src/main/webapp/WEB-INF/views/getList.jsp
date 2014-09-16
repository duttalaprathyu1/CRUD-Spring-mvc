<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">  
   <tr>  
    <td class="heading">stdno</td>  
    <td class="heading">firstname</td>  
    <td class="heading">lastname</td>  
    <td class="heading">joindate</td>  
    <td class="heading">streetname</td>  
    <td class="heading">city</td>
    <td class="heading">state</td>
    <td class="heading">country</td>
      
   </tr>  
   <c:forEach var="studentlist" items='${s1}'>
   <tr>
   <td>${studentlist.stdno}</td>
   <td>${studentlist.firstname}</td>
   <td>${studentlist.lastname}</td>
   <td>${studentlist.joindate}</td>
   <td>${studentlist.streetname}</td>
   <td>${studentlist.city}</td>
   <td>${studentlist.state}</td>
   <td>${studentlist.country}</td>
   <td><a href="edit?id=${studentlist.stdno}">edit</a></td>
   <td><a href="delete?id=${studentlist.stdno}">delete</a></td>
   
   </tr>
   </c:forEach>
</table>
<a href="registerStudent">register</a>
</body>
</html>