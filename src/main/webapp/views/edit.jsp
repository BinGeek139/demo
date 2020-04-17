<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form method="post" action="/test/updates">
		<table>
			<tr>
				<td>Tên 				 :
				</td>
				<td><form:input path="fullName" /></td>
			</tr>
			<tr>
				<td>Ngày sinh :</td>
				<td><form:input path="dateOfBirth" /></td>
			</tr>
			<tr>
				<td>Địa chỉ 				  :</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Tên trường 			   :</td>
				<td><form:input path="school" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<button><a href="/test" style="text-decoration: none;">Go Home</a></button>
	
</body>
</html>