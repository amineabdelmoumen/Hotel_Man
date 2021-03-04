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
     <div class="panel-heading">Hotels</div>
     <div class="panel-body">
     <form action="chercher.org" method="get">
       <label>ville:</label>
       <input type="text" name="ville" value="${model.ville}" />
       <button type="submit" class="btn btn-primary">Chercher</button>
     </form>
     <table class="table">
     <tr>
     <th>ID</th><th>Le nom</th><th>Adresse</th><th>ServiceQuality</th><th>Price</th>
     </tr>
     <c:forEach items="${model.hotels}" var="h">
      <tr>
      <td>${h.id}</td>
      <td>${h.name}</td>
      <td>${h.adresse}</td>
      <td>${h.serviceQuality}</td>
       <td>${h.price}</td>
       <td> <a href="reserver.org?id=${h.id}" class="btn btn-danger">Reserver</a></td>
      
      </tr>
     </c:forEach>
     </table>
        </div></div></div>
     
  
  
</body>
</html>