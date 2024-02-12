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
  <li><a class="active"  href="viewallmentors">View All FacultyMentors</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All FacultyMentors</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>

<th>Username</th>

</tr>

<c:forEach items="${mlist}" var="emp">

<tr>

<td> <c:out value="${mentor.id}"></c:out>   </td>

<td> <c:out value="${mentor.username}"></c:out>   </td>
<td> 

<a href='<c:url value='deletementor?id=${mentor.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewmentorbyid?id=${mentor.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
