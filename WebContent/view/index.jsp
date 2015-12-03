<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function login(){
			if(document.getElementById("name").value=="asd"){
				return true;
			}
			return
			document.getElementById("password").value="zq";
		}
	</script>
</head>
<body>hello springMVC
	<form action="login_success.jsp">
		用户名：<input type="text" id="name">
		密码：<input type="password" id="password">
		<input type="submit" value="登陆" >
	</form>
</body>
</html>