<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.MRTS.com</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
 
	background-image:
		url('http://msrtc.maharashtra.gov.in/MSRTCDOCS/BannerDocs//Banner326645c0-bda1-4efb-998f-f12c7393db45_1772023.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body bgcolor="white">

 
	<marquee>

		<h1>MRTS Login</h1>
	</marquee>
	
	 
	<font color="green" size="30px">${SUCCESS} </font>
	<font color="red">${FAIL} </font>

	<form:form action="bookbus" modelAttribute="bus" method="POST">

		<table align="center">
			<tr>
				<td><h2>Leaving_From :</h2></td>
				<td><form:input path="leavingFrom" /></td>
			</tr>
			<tr>
				<td><h2>Going_To :</h2></td>
				<td><form:input path="goingTo" /></td>
			</tr>
			<tr>
				<td><h2>Date_Of_Departure :</h2></td>
				<td><form:input path="dateOfDeparture" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>