<%@page import="com.company.Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<h4>Welcome, ${user.name}</h4>
<h4>Your email is ${user.email}</h4>
<h4>Your password is ${user.password} which is secure</h4>


</body>
</html>
