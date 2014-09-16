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
<form:form method="post" action="update" commandName="student">
<table>
<tr>
<td>
<form:input path="stdno" value="${student.stdno}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="firstname" value="${student.firstname}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="lastname" value="${student.lastname}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="joindate" value="${student.joindate}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="streetname" value="${student.streetname}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="city" value="${student.city}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="state" value="${student.state}"></form:input>
</td>
</tr>
<tr>
<td>
<form:input path="country" value="${student.country}"></form:input>
</td>
</tr>
<tr>
<td><input type="submit" value="update" /></td>
</tr>
</table>
</form:form>
</div>
</body>
</html>