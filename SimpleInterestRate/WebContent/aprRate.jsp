<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest APR</title>
</head>
<body>
<h1>Calculate Simple Interest: Enter Principal, APR, and Years Count.</h1>
<form action="getAPR" method="post">
What is the annual interest rate (APR) as a numeric percentage (example: 3.75)?
<input type="text" name="aprAmt" size="10">
<input type="submit" value="Enter"/>
</form>
</body>
</html>