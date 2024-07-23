<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Registration Form</title>
  </head>
  <body>
   <div class="container mt-3">
        <h1>Registration Form</h1>
        <form:errors path="form.*" >
            <div class="alert alert-danger" role="alert">
           There are errors in the form. Please review the highlighted fields and make corrections.
        </div>
           </form:errors>
       
      <form method="post" action="handleForm" modelAttribute="form" class="needs-validation" novalidate>
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="name" class="form-label"> Name</label>
                    <input type="text" class="form-control" id="name" name="name" required>
                </div>
            </div>
             <div class=" mb-3">
                    <label for="id" class="form-label"> ID</label>
                    <input type="text" class="form-control" id="id" name="id" required>
                </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" required>
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
             <div class="mb-3">
                <label for="date" class="form-label">Date</label>
                <input type="date" class="form-control" id="date" name="date" aria-describedby="date" placeholder="dd/mm/yy"  required>
               
            </div>
            <div class="mb-3">
                <label for="phoneNumber" class="form-label">Phone Number (Optional)</label>
                <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber">
            </div>
            <div class="mb-3 ">
            <label for="gender" class="form-label">Gender</label>
              <div class="form-check">
             <input class="form-check-input" type="radio" name="gender" id="male" value="male">
           <label class="form-check-label" for="male">Male</label>
           </div>
           <div class="form-check">
             <input class="form-check-input" type="radio" name="gender" id="female" value="female">
             <label class="form-check-label" for="female">Female</label>
           </div>
           <div class="form-check">
            <input class="form-check-input" type="radio" name="gender" id="other" value="other">
            <label class="check-label" for="other">Other</label>
           </div>
            </div>
           <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="name" class="form-label"> Address</label>
                    <input type="text" class="form-control" id="address.street" name="address.street" placeholder="Enter street" required>
                     <input type="text" class="form-control" id="address.city" name="address.city" placeholder="Enter city" required>
                </div>
            </div>
            
         <ul class="list-group"  >
            <li class="list-group-item">
              <input class="form-check-input me-1" type="checkbox" value="Java"  name="course" aria-label="...">
                  Java
           </li>
           <li class="list-group-item">
             <input class="form-check-input me-1" type="checkbox" value="python" name="course" aria-label="...">
               Python
           </li>
           <li class="list-group-item">
             <input class="form-check-input me-1" type="checkbox" value="c/c++" name="course" aria-label="...">
               C/C++
           </li>
           <li class="list-group-item">
             <input class="form-check-input me-1" type="checkbox" value="javaScipt" name="course" aria-label="...">
                JavaScript
           </li>
           <li class="list-group-item">
            <input class="form-check-input me-1" type="checkbox" value="C#" name="course" aria-label="...">
              C#
          </li>
      </ul>
             
            <div class="mb-3">
                <label for="country" class="form-label">Country</label>
                <select class="form-select" id="country" name="country" aria-label="Default select example">
                    <option value="">Select Country</option>
                    <option value="US">United States</option>
                    <option value="CANADA">Canada</option>
                    <option value="UK">United Kingdom</option>
                    <option value="...">...</option>
                </select>
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="terms" name="terms" required>
                <label class="form-check-label" for="terms">I agree to the terms and conditions</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>