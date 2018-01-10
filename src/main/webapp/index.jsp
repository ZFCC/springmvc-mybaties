<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<h1>Welcome</h1>
	<h1>访问此页面,请先登录</h1>
	<form action="login.do" method="post">
		用户名：<input type="text" id="userName" name="userName" /><p/>
		密码：<input type="text" id="password" name="password" /><p/>
		<input type="submit" value="登录"></input>
	</form>
</body>
</html>
