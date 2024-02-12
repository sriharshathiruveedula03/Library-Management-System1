<!DOCTYPE html>
<html>
<head>
<style>

* {
   box-sizing: border-box;
}

.imageColumn {
   float: left;
   width: 25%;
   padding: 10px;
}
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
  background-color:gold;
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

<h1 align=center>KNOW YOU</h1>

<br>

<ul>
  <li><a class="active" href="/">Home</a></li>
  <li><a href="adminlogin">Admin</a></li>
  <li><a href="studentlogin">Student</a></li>
    <li><a href="trainerlogin">Trainer</a></li>
    <li><a href="facultymentorlogin">FacultyMentor</a></li>
  
</ul>

<br><br><br>



</body>
</html>