<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expected Simple Interest Amount</title>
</head>
<body>
<h1>Result</h1>
	<p>Estimated Simple Interest Amount (In addition to the principal): ${ResultsDisplay.returnAmountEarned()}
	<br />
	</p>
	<a href="index.jsp">Complete another simple interest calculation?</a>
</body>
</html>