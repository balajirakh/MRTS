<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.MRTS.com</title>
<div class="slideshow">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
  body, html {
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
  }

  .slideshow {
    width: 100%;
    height: 100%;
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
    animation: slide 30s infinite;
  }
  
  @keyframes slide {
    0% { background-image: url('https://www.shutterstock.com/shutterstock/photos/1022856202/display_1500/stock-photo-pune-maharashtra-india-june-city-bus-arriving-at-a-bus-stop-1022856202.jpg'); }
    33.33% { background-image: url('https://gumlet.assettype.com/saamtv%2F2022-11%2F8153bd03-970c-4001-abe4-6273b39aca0c%2Fphoto__36_.jpg?format=auto'); }
    66.66% { background-image: url('https://static.toiimg.com/thumb/msid-103770567,imgsize-73118,width-400,height-225,resizemode-72/103770567.jpg'); }
    100% { background-image: url('https://kanpursmartcity.org/frontend/kscl/assets/img/news/1Kvu3.jpeg'); }
  }
</style>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<body>


<form:form action="/api/bus" modelAttribute="bus" method="GET">
    <style>
    th, td {
        padding: 10px;
        text-align: left;
    }
    </style>
    <table>
        <tr>
            <th><h1 style="color: green;">Book Bus Ticket :</h1></th>
            <td><input type="submit" value="Click here"
                style="width: 100px; height: 50px;" /></td>
        </tr>
    </table>
</form:form>

<marquee>
        <h1 style="color:red;">MRTS Login</h1>
</marquee>

<form:form action="/api/transistcard" modelAttribute="customer" method="Get">
    <table align="center">
        <tr>
            <th><h1 style="color: red;">3) you have a transist
                        card :</h1></th>
            <td><input type="submit" value=" yes"
                style="width: 100px; height: 50px;" /></td>
                 
        </tr>
    </table>
</form:form>
<br>

<div>
    <table align="center">
        <tr>
            <th><h1 style="color: red;">2) are you Axis Bank Customer:</h1></th>
            <td><input type="submit" value="Yes"
                style="width: 100px; height: 50px;" /></td>
            <td><input type="submit" value="No"
                style="width: 100px; height: 50px;" /></td>
        </tr>
    </table>
</div>
<br>
<div>
<form:form action="customer" modelAttribute="customer" method="GET">
    <table align="center">
        <tr>
            <th><h1 style="color: red;">3) you don't have a transist
                        card :</h1></th>
            <td><input type="submit" value="Register User"
                style="width: 100px; height: 50px;" /></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
