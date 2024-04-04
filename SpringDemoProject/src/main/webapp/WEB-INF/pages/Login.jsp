<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body bgcolor="cyan">
	<form action="doValidate" method="POST">
			<pre>
				Enter Username: <input type="text" name="user_name" style="background-color:yellow;">
				Enter Password: <input type="password" name="user_pwd" style="background-color:yellow;">
				<input type="submit" value="Sing IN">
			</pre>
	</form>

</body>
</html>