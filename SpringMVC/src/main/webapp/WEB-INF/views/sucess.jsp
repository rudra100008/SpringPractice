<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Registration Success</title>
    <style>
        table, th, td {
            border: 2px solid green;
        }
    </style>
</head>
<body>
    <h1 class="text-center">Your Registration is Successful.</h1>
    <div style="overflow-x:auto">
        <table class="table" style="width:90%; margin: 0 auto;">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Date of Birth</th>
                    <th scope="col">Phone Number</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Courses</th>
                    <th scope="col">Street</th>
                    <th scope="col">City</th>
                    <th scope="col">Country</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="form" items="${forms}">
                    <tr>
                        <th scope="row">${form.id}</th>
                        <td>${form.name}</td>
                        <td>${form.email}</td>
                        <td>${form.date}</td>
                        <td>${form.phoneNumber}</td>
                        <td>${form.gender}</td>
                        <td>
                            <c:forEach var="course" items="${form.course}">
                                ${course}<br/>
                            </c:forEach>
                        </td>
                        <td>${form.address.street}</td>
                        <td>${form.address.city}</td>
                        <td>${form.country}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <h1>${message}</h1>
    <img alt="profileImage" src="<c:url value="/resources/images/${fileName} " />" />
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
