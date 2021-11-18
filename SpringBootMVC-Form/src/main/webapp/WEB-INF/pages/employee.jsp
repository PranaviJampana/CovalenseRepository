<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REgistration Page</title>
</head>
<body>
	<form:form action="regemp" method="post" modelAttribute="employee">
		<!-- <form:label path="id">ID</form:label>
<form:input path="id" />
<br>
<br> -->
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<br>
		<br>
		<form:label path="department">Department</form:label>
		<label for="Departments">Choose a Department</label>
		<select name="departments" id="departments">
			<option value="1">java</option>
			<option value="2">c</option>




		</select>
		<br>
		<br>




		<input type="submit" value="Register">
	</form:form>
</body>
</html>