<%@page import="com.cov.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details</h2>
	
	<table border="1" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>DeptName</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		List<Employee> emps = (List<Employee>)request.getAttribute("emps");
		for (Employee emp : emps) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getDepartment().getName()%></td>
			<td><a href="editEmp?id=<%=emp.getId()%>">Edit</a></td>
			<td><a href="deleteEmp?id=<%=emp.getId()%>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="/">Home</a>
	<a href="getDepts">Show Department</a>
	<br>
	
	<center><a href="regemp">Register Employees</a></center>
	<br>
	<br>
	<center>
		<a href="/">Home</a>
	</center>
	<br>
	<br>
</body>
</html>