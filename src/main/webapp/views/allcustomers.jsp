
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Customers</title>
</head>
 <style>
        table {
            width: 80%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>emailId</th>
			<th>birthDate</th>
			<th>mobNumber</th>
		</tr>
		<tbody>
		<tbody>
			<c:forEach items="${allcustomer}" var="all">
				<tr>
					<td>${all.id}</td>
					<td>${all.firstName}</td>
					<td>${all.lastName}</td>
					<td>${all.emailId}</td>
					<td>${all.birthDate}</td>
					<td>${all.mobNumber}</td>
				</tr>
			</c:forEach>
			</tbody>
		</tbody>
	</table>
</body>
</html>