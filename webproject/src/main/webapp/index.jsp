<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
int a=10;//
String name="abhishek";
public int square()
{
	return a * a;
}

%>

<%
out.println(a);
out.println(name);
int b=20;
if(b<100)
{
	out.println("b is smaller than 100");
}
else 
{
	out.println("b is greater than 100");
}

for(int i=1;i<=5;i++)
{
	out.println(i);
}
%>

<form action="output.jsp" method="post" >
<input type="text" name="name1" placeholder="enter your name"/>
<input type="submit" value="click here"/>

</form>
</body>
</html>