<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.fasterxml.jackson.core.JsonParser"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Stock Live Rates</title>
</head>
<body>
<div class="w3-container">
	<h1>Stock Rates:</h1>
	
	<table class="w3-table-all w3-hoverable">
	<tr>
		<th>Ticker</th>
		<th>Exchange</th>
		<th>Last Price</th>
		<th>Last Trade Time</th>
		<th>Change</th>
		<th>Change Percentage</th>
	</tr>

		<% 
			JSONArray jobj=(JSONArray) request.getAttribute("res");
			for(int i=0; i<jobj.length(); i++) {
				JSONObject json= (JSONObject) jobj.get(i);
			
		%>
		<tr>
			<td><%= json.get("t") %></td>
			<td><%= json.get("e") %></td>
			<td><%= json.get("l") %></td>
			<td><%= json.get("lt") %></td>
			<td><%= json.get("c") %></td>
			<td><%= json.get("cp") %></td>
		</tr>
		<% } %>
		
</table>
</div>
</body>
</html>