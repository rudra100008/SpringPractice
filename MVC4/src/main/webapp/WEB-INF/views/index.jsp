<%@ page import="java.util.List" %>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Hello page</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Spring</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="http://localhost:8080/MVC2/contact">Form <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/MVC2/hello">Hello</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/MVC2/help">Help</a>
      </li>
    </ul>
  </div>
</nav>
<%
    String name=(String)request.getAttribute("name");
    Integer age=(Integer)request.getAttribute("age"); 
    List<String> friends = (List<String>) request.getAttribute("f");
%>
<Label>Name</Label>
<p><%= name %></p>
<label>Age: </label><p><%= age %></p>

<h3>List of friends</h3>
<%
if(friends !=null){
for(String s: friends){
out.println("<li>"+s+"</li>");

}
}else{
	out.println("<li>No friends available</li> ");
}
%>
<a href="http://localhost:8080/MVC2/help">Help</a>
<a href="http://localhost:8080/MVC2/hello">Hello</a>
<a href="http://localhost:8080/MVC2/contact">Form</a>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
