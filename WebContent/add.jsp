<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
<title>Hotel</title>
</head>
<body>
<div class="navbar navbar-danger bg-danger">
  <ul class="nav navbar-nav">
    <li><a href="index.org">Home</a></li>
    <li><a href="add.org">add Hotel</a></li>
</ul>
</div>
<div class="container col-md-8 col-md-offset-2">
  <div class="panel panel-primary">
     <div class="panel-heading">Hotels</div>
     <div class="panel-body">
       <form action="save.org" method="post">
          <div class="form-group">
            <label class="control-label">Le Nom:</label>
             <input class="form-control" name="nom" type="text" />
             
          </div>
          <div class="form-group">
            <label class="control-label">L'adresse:</label>
             <input class="form-control" name="adresse" type="text" />
            
          </div>
          <div class="form-group">
            <label class="control-label">ServiceQuality:</label>
             <input class="form-control" name="servicequality" type="text" />
             
          </div>
          <div class="form-group">
            <label class="control-label">Price:</label>
             <input class="form-control" name="price" type="text" />
             
          </div>
          
         <button type="submit" class="btn btn-success">Add</button>
       </form>
     </div>
     </div>
     </div>
</body>
</html>