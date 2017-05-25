<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Get Stocks</title>
</head>
<body>
	<div class="w3-container">
		<h1>Know Your Stocks :</h1>
		<form:form action="getStocks" method="get" class="w3-container">


			<p>
				<label>Companies :</label> <input class="w3-input w3-border"
					type="text" name="company" id="company"
					placeholder="Multiple Ticker svalues seprated with ','" />
			</p>
			<p>
				<input type="submit" value="Press." class="w3-btn w3-blue">
			</p>
			

		</form:form>
	</div>
</body>
</html>