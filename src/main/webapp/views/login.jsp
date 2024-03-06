<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.MRTS.com</title>
  

<form:form action="bus" modelAttribute="bus" method="GET">
<style>
       
  
       
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
		<table>
			<tr>
				<th><h1>Book Bus Ticket :</h1></th>
				<td><input type="submit" value="Click here"
					style="width: 100px; height: 50px;" /></td>
			</tr>
		</table>
	</form:form>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
	background-image:
		url('https://st2.depositphotos.com/3725083/5485/i/450/depositphotos_54856347-stock-photo-travel-the-world-monument-concept.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body bgcolor="white">


	<marquee>

		<h1>MRTS Login</h1>
	</marquee>


	<div>
		<table align="center">
			<tr>
				<th><h1>1) you have a transient card :</h1></th>
				<td><input type="submit" value="No"
					style="width: 100px; height: 50px;" /></td>

			</tr>
		</table>
	</div>
	<br>

	<div>
		<table align="center">
			<tr>
				<th><h1>2) you are Axis Bank Customer :</h1></th>
				<td><input type="submit" value="No"
					style="width: 100px; height: 50px;" /></td>
			</tr>
		</table>
	</div>
	<br>

	<form:form action="customer" modelAttribute="customer" method="GET">

		<table align="center">
			<tr>
				<th><h1>3) you don't have a transient card :</h1></th>
				<td><input type="submit" value="Register User"
					style="width: 100px; height: 50px;" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>