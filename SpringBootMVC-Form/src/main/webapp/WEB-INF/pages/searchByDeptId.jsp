<%@page import="com.cov.beans.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.cov.service.DepartmentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searching by Department name</title>
</head>
<body>
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
		<form:option value="<%=department%>"><%=department.getName()%></form:option>
		<%
		}
		%>
	</form:select>

</body>
</html>