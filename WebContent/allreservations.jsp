<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Hotels</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
<title>Test Bootstrap</title>

</head>
<body>

<div class="navbar navbar-danger bg-danger">
  <ul class="nav navbar-nav">
    <li><a href="index.org">Home</a></li>
    <li><a href="add.org">add Hotel</a></li>
    <li><a href="reservations.org">Reservations</a></li>
</ul>

</div>
<p></p>
<div class="container col-md-10 col-md-offset-3">
  <div class="panel panel-primary">
     <div class="panel-heading">Les reservations</div>
     <div class="panel-body">
     <table class="table">
     <tr>
     <th>ID</th><th>Le nom de l'hotel</th><th>client</th><th>nombre de jours</th><th>la date de reservation</th>
     </tr>
     <c:forEach items="${model.reservations}" var="r">
      <tr>
      <td>${r.id}</td>
      <td>${r.hotelname}</td>
      <td>${r.clientname}</td>
      <td>${r.nbrjour}</td>
       <td>${r.reservationdate}</td>
       <td> <a href="delete.org?id=${r.id}" class="btn btn-danger">Suprimer</a></td>  
      </tr>
     </c:forEach>
     </table>
        </div></div></div>
     
  
  
</body>
</html>