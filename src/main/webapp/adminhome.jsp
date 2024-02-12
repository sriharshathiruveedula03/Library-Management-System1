<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
body {
    background-image:     url("images/20.jpg");
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
h3{
 color: white;
  text-shadow: 2px 2px 4px #000000;
}
.topnav {
  background-color: gold;
  overflow: hidden;
}
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.active {
  background-color:MediumVioletRed;
  color: white;
}
.topnav .icon {
  display: none;
}
.dropdown {
  float: left;
  overflow: hidden;
}
.dropdown .dropbtn {
  font-size: 17px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: gold;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}
.topnav a:hover, .dropdown:hover .dropbtn {
  background-color: orange;
  color: white;
}
.dropdown-content a:hover {
  background-color: orange;
  color: black;
}
.dropdown:hover .dropdown-content {
  display: block;
}

</style>
</head>
<body>

<h1 align=center>KNOW YOU</h1>

<br>

<body>

<div class="topnav" id="myTopnav">
  <a href="index.jsp">Home</a>
  <a href="adminhome.jsp" class="active">Admin</a>
  <div class="dropdown">
    <button class="dropbtn">ViewALL
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="viewallstudents">Students</a>
      <a href="viewalltrainers">Trainers</a>
      <a href="viewallmentors">FacultyMentors</a>
    </div>
  </div>
  
<div class="dropdown">
    <button class="dropbtn">Add
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="studentreg">Students</a>
      <a href="trainerreg">Trainers</a>
      <a href="facultymentorreg">FacultyMentors</a>
    </div>
  </div>  
  
  <div class="dropdown">
    <button class="dropbtn">Delete
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="viewallstudents">Students</a>
      <a href="viewalltrainers">Trainers</a>
      <a href="viewallmentors">FacultyMentors</a>
    </div>
  </div>
  
  <li><a href="adminlogin">Logout</a></li>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">&#9776;</a>
</div>

<br>

<h3 align=center>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

</body>
</html>