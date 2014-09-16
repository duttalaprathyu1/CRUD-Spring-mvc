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
<div>
<form:form action="insert" method="POST" commandName="student">
<table>
<tr>
<td>
StudentID:
</td>
<td>
<form:input path="stdno"></form:input>
</td>
</tr>
<tr>
<td>
FirstName:
</td>
<td>
<form:input path="firstname"></form:input>
</td>
</tr>
<tr>
<td>
LastName:
</td>
<td>
<form:input path="lastname"></form:input>
</td>
</tr>
<tr>
<td>
JoinDate:
</td>
<td>
<form:input path="joindate"></form:input>
</td>
</tr>
<tr>
<td>
StreetName:
</td>
<td>
<form:input path="streetname"></form:input>
</td>
</tr>
<tr>
<td>
City:
</td>
<td>
<form:input path="city"></form:input>
</td>
</tr>
<tr>
<td>
State:
</td>
<td>
<form:input path="state"></form:input>
</td>
</tr>
<tr>
<td>
Country:
</td>
<td>
<form:input path="country"></form:input>
</td>
</tr>
<tr>
 <td><input type="submit" value="Save" /></td>
 </tr>
</table>
</form:form>
</div>
</body>
</html>