<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
      .backgroundColor {
        background-color: #60a5fa;  /* Adjust this to your desired blue shade */
        color: white;
      }
    </style>
    <title>Search Application</title>
    
  </head>
  <body>
    <div class="container ">
      <div class="card backgroundColor  mx-auto mt-5  " style="width:400px" >
        <div class="card-body py-5">
          <h5 class="card-title text-center text-white">Search Box</h5>
          <form action="search" class="mt-3">
             <div class="form-group">
                <input type="text" name="querybox" placeholder="Search here" class="form-control " />
             </div>
             
             
             <div class="container text-center mt-2">
                <button class="btn btn-outline-light">Submit</button>
             </div>
          </form>
             
       </div>
     </div>
   </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>