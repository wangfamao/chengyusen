<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登录页面</title>
    </head>
    <body>
    	<form action="login" method="post">
    		<input type="text" name="username" /><br />
    		<input type="password" name="password" /><br />
    		<input type="submit" value="登录"/>     	没有账户？<a href="addForm.jsp">点击注册</a>
    	</form>
 	</body>
</html>