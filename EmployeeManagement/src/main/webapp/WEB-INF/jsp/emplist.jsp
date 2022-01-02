<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Employee Managaement</title>


</head>

<body>
<a href="/emp/add">Add</a>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Age</th>
		<th>Salary</th>
		<th>Aadhar</th>
		<th>Department</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${empList}" var="emp">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.empName}</td>
			<td>${emp.age}</td>
			<td>${emp.salary}</td>
			<td>${emp.aadharNumber}</td>
			<td>${emp.department}</td>
			<td><a href="/emp/update/${emp.id}">Update</a></td>
			<td><a href="/emp/delete/${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>