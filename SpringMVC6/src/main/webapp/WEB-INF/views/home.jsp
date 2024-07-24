<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!doctype html>
<html lang="en">
  <head>
  <style type="text/css">
  /* body {
  background-color: lightblue;
}
img.photo {
    width: 200px; /* Set the width of the image */
    height: auto; /* Maintain aspect ratio */
    border-radius: 10px; /* Add rounded corners */
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Add shadow */
    margin: 20px; /* Add margin around the image */
    display: block; /* Make the image a block element */
    transition: transform 0.3s; /* Add a transition for hover effect */
}

img.photo:hover {
    transform: scale(1.1); /* Scale up the image on hover */
} */
  </style>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
     <link  href= "<c:url value='/resources/css/style.css'/>"   type="text/css" >
    <script src= "<c:url value='/resources/js/script.js' />"></script>
    <title>Home</title>
  </head>
  <body style="" >
   <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Ashum</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/SpringMVC/">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="http://localhost:8080/SpringMVC/form">Form</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
  <img alt="Luffy" class="photo" src="<c:url value="/resources/images/luffy.jpg" />">
   <p> ID:  ${id}</p>
   <input type="text" name="name12" placeholder="Enter name"  >
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>