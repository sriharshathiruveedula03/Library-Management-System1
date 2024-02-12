<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    

<!DOCTYPE html>
<html>
<head>
<style>
body {
    background-image:   url("images/13.jpg");
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
  background-color: gold;
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
background-color: MediumVioletRed;
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
    <li><a href="adminhome">Admin</a></li>
  
  <li><a class="active"  href="viewallstudents">View All Students</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Students</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>

<th>Username</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Department</th>
<th>City</th>
<th>Email ID</th>
<th>Contact No</th>


</tr>

<c:forEach items="${stulist}" var="stu">

<tr>

<td> <c:out value="${stu.id}"></c:out>   </td>

<td> <c:out value="${stu.username}"></c:out>   </td>
<td> <c:out value="${stu.name}"></c:out>   </td>
<td> <c:out value="${stu.gender}"></c:out>   </td>
<td> <c:out value="${stu.dateofbirth}"></c:out>   </td>
<td> <c:out value="${stu.department}"></c:out>   </td>
<td> <c:out value="${stu.city}"></c:out>   </td>
<td> <c:out value="${stu.emailid}"></c:out>   </td>
<td> <c:out value="${stu.contactno}"></c:out>   </td>

<td> 

<a href='<c:url value='deletestudent?id=${student.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewstudentbyid?id=${student.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
