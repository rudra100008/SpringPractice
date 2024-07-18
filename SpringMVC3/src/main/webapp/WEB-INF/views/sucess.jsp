<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Registration Success</title>
<style>
table, th, td
 {
  
border
: 2px solid green;
}
</style>
</head>
<body>
<h1 class="text-center" >Your Registration is SucessFull.</h1>
<div style="overflow-x:auto">
  <table class="table  " style="width:50%;margin: 0 auto;">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Date of Birth</th>
      <th scope="col">PhoneNumber</th>
      <th scope="col">Gender</th>
      <th scope="col">Courses</th>
      <th scope="col">Country</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">${form.id}</th>
      <td>${form.name}</td>
      <td>${form.email}</td>
      <td>${form.date}</td>
      <td>${form.phoneNumber}</td>
      <td>${form.gender}</td>
      <td>${form.course}</td>
      <td>${form.country}</td>
    </tr>
    
  </tbody>
</table>
  


</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>