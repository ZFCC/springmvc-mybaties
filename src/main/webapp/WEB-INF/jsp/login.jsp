<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome </title>
</head>
<body>
	<h1>Welcome</h1>
	<h1>访问此页面,请先登录</h1>
	<form action="login.do" method="post">
		用户名：<input type="text" id="userName" name="userName" />
		密码：<input type="text" id="password" name="password" />
		<input type="submit" value="登录"></input>
	</form>
	
</body>
</html>