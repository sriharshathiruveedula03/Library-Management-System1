<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>KNOW YOU</h1>

<br>

<ul>
  <li><a href="facultymentorhome">Home</a></li>
  <li><a class="active" href="viewm">View Profile</a></li>
  <li><a href="mchangepwd">Change Password</a></li>
   <li><a href="facultymentorlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome&nbsp;<c:out value="${muname}"></c:out></h3>

<br>

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${m.id}</td></tr>



</table>



</body>
</html>