<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2 style="color:green">welcome user </h2>

<%

String name =request.getParameter("name1");
out.println( "Welcome "+ name);
String session_val=(String)session.getAttribute("session_name");
%>
</body>
</html>