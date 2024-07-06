<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ taglib prefix="c" uri="http://jakarta.servlet.jsp.jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Help Page</title>
</head>
<body>
<%
/* LocalDateTime dateTime =(LocalDateTime) request.getAttribute("date");
DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-mm-yy");
DateTimeFormatter time=DateTimeFormatter.ofPattern("hh-mm-ss"); */
%>
<h1>Welcome to Help Page</h1>
<h2>${help}</h2>
<p> Date and Time  ${date}

<%-- <%=dateTime.format(time) --%> 

<hr>
<h3>Marks</h3>
<%--  <c:forEach var="items" items="${marks}">
    <p>${items}</p>
</c:forEach> --%>
</body>
</html>