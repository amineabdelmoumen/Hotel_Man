<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
<title>Hotels</title>
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
     <div class="panel-heading">Reserver un hotel</div>
     <div class="panel-body">
       <form action="saveReservation.org" method="post">
          <div class="form-group">
            <label class="control-label">Le Nom de l'hotel</label>
             <input class="form-control" name="hotelname" type="text" value="${h1.name}" />
             
          </div>
          <div class="form-group">
            <label class="control-label">le nom du client:</label>
             <input class="form-control" name="clientname" type="text" />
            
          </div>
          <div class="form-group">
            <label class="control-label">Date de reservation</label>
             <input class="form-control" name="date" type="text" />
             
          </div>
          <div class="form-group">
            <label class="control-label">le nombre de jours:</label>
             <input class="form-control" name="nbrjour" type="text" />
             
          </div>
          
         <button type="submit" class="btn btn-danger">Reserver</button>
       </form>
     </div>
     </div>
     </div>
</body>
</html>