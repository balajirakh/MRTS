<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MRTS Registrations</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
    body {
        background-image: url('https://static8.depositphotos.com/1030463/1072/i/450/depositphotos_10721036-stock-photo-world-map.jpg');
        background-size: cover;
        background-repeat: no-repeat;
        background-color: lightpink;
    }
</style>
</head>
<body>

    <marquee>
        <h1>MRTS Registrations</h1>
    </marquee>

<font color="green" size="30px">${SUCCESS} </font>
	<font color="red">${FAIL} </font>
   

    <form:form action="savetransistcarddetails" modelAttribute="trCardCustomer" method="POST">

        <table align="center">
            <tr>
                <td><h2>Enter Last 4 Digits of Transist Card:</h2></td>
                <td><form:input path="trasnsistCardNumber" />
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Submit" /></td> 
            </tr>
        </table>
    </form:form>
    

</body>
</html>
