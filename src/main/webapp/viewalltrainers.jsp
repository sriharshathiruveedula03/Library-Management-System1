<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    

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

<h1 align=center>Know You</h1>

<br>

<ul>
  <li><a href="adminhome">Home</a></li>
  <li><a class="active"  href="viewalltrainers">View All Trainers</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Trainers</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>

<th>Username</th>

</tr>

<c:forEach items="${tlist}" var="emp">

<tr>

<td> <c:out value="${t.id}"></c:out>   </td>

<td> <c:out value="${t.username}"></c:out>   </td>
<td> 

<a href='<c:url value='deletetrainer?id=${t.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewtrainerbyid?id=${t.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
