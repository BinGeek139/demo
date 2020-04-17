<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>Student Manager</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Họ và tên</th>
			<th>Ngày Sinh</th>
			<th>Trường</th>
			<th>Địa chỉ</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="stu" items="${list}">
			<tr>
				<td>${stu.id}</td>
				<td>${stu.fullName}</td>
				<td>${stu.dateOfBirth}</td>
				<td>${stu.address}</td>
				<td>${stu.school}</td>
				<td><a href="/update/${stu.id}">Edit</a></td>
				<td><a href="delete/${stu.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>