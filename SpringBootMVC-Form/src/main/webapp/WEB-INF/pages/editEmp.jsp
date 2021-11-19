<%@page import="com.cov.beans.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.cov.service.DepartmentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Employee Page</title>
</head>
<body>

	<form:form action="updateEmp" modelAttribute="empToEdit">
		<center>
			<form:label path="id">Employee ID</form:label>
			<form:input path="id" readonly="true" />
		</center>
		<br>
		<br>
		<center>
			<form:label path="name">Employee Name</form:label>
			<form:input path="name" />
		</center>
		<br>
		<br>
		<center>
			<%
			DepartmentService departmentService = (DepartmentService) request.getAttribute("departmentService");
			List<Department> departments = departmentService.findAll();
			%>
			<form:label path="department">Department</form:label>
			<form:select path="department">
				<form:option value="0">--Select--</form:option>
				<%
				for (Department department : departments) {
				%>
				<form:option value="<%= department %>"><%=department.getName()%></form:option>
				<%
				}
				%>
			</form:select>
		</center>
		<center>
			<input type="submit" value="Update">
		</center>
	</form:form>
	<br>
	<br>
	<a href="/">Home</a>
	<br>
	<br>
</body>
</html>