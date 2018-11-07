<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>PokeMon Web Game</title>

</head>
<body>
	<form action="Login">
		<pre>
			UserName : <input type = "text" name = "user">
			PassWord : <input type = "text" name = "pass">
			<input id="login" type = "submit" value = "Login" onclick = "document.getElementById('loggedIn').click()">
			<input id="register" type="button" value = "Register" onclick="document.getElementById('register_sub').click()">
		</pre>
	</form>
	<form action="Register.jsp">
		<input id="register_sub" type = "submit" style="display:none">
	</form>
	<form action="Chaleenge.jsp">
		<input id="loggedIn" type = "submit" style = "display:none">
	</form>
</body>
</html>