<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
	<!-- <form action="ControllerServlet" method="post"> -->
	<form action="/JSP/ControllerServlet" method="post">
	이름 : <input type="text" name="name"><br>
	비밀번호 : <input type="password" name="password"><br>
	<input type="submit" value="로그인">
	</form>
</body>
</body>
</html>