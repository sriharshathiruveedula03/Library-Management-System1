<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<style>
body {
    background-image:     linear-gradient(to bottom, rgba(245, 246, 252, 0.52), rgba(117, 19, 93, 0.73)),url("images/2.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    font-family: 'Arimo', sans-serif;
    margin: 0;
    padding: 0;
    height: 100%;
    box-sizing: border-box;
}
h1 {
  color: white;
  text-shadow: 2px 2px 4px #000000;
}

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
  <li><a class="active" href="facultymentorhome">Home</a></li>
  <li><a href="viewmentor">View Profile</a></li>
  <li><a href="mchangepwd">Change Password</a></li>
  <li><a href="mentorlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome&nbsp;<c:out value="${euname}"></c:out></h3>

</body>
</html>