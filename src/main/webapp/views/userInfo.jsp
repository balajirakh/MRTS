<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.MRTS.com</title>
</head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
	background-image:
		url('https://static8.depositphotos.com/1030463/1072/i/450/depositphotos_10721036-stock-photo-world-map.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
<body bgcolor="lightpink">


	<marquee>

		<h1>MRTS Registrations</h1>
	</marquee>


	<font color="green" size="30px">${SUCCESS} </font>
	<font color="red">${FAIL} </font>


	<form:form action="savecustomer" modelAttribute="customer"
		method="POST">

		<table align="center">
			<tr>
				<td><h2>FirstName :</h2></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><h2>LastName :</h2></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><h2>EmailId :</h2></td>
				<td><form:input path="emailId" /></td>
			</tr>
			<tr>
				<td><h2>BirthDate :</h2></td>
				<td><form:input path="birthDate" /></td>
			</tr>
			<tr>
				<td><h2>MobileNumber :</h2></td>
				<td><form:input path="mobNumber" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>



		</table>
		<div align="center">
			<a href=getallcustomers><h2>View All customers</h2></a>
		</div>
	</form:form>

</body>
</html>