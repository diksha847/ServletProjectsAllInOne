<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to registration form</h1>
<form action="registration" method="post">
Name:<input type="text" name="name1" placeholder="enter your name"/><br><br>
Email:<input type="text" name="email1" placeholder="enter your Email"/><br><br>
Password:<input type="password" name="pwd1" placeholder="enter password"/><br><br>
Gender:<input type="radio" name="gender1" value="male">Male
<input type="radio" name="gender1" value="female">female
<br>
<br>
City:<select name="city1">
<option>select country</option>
<option>bangalore</option>
<option>pune</option>
<option>hyderabad</option>
<option>chennai</option>
<option>delhi</option>

</select>
<br>
<br>
<input type="submit" value="register"></input>

</form>

</body>
</html>