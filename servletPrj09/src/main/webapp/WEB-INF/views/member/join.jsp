<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
		<form action="http://127.0.0.1:8080/app/member/join" method ="POST">
		<input type="text" name="userId" placeholder="아이디를 입력해주세요">
		<br>
		<input type="password" name="userPwd" placeholder="비밀번호를 입력해주세요">
		<br>
		<input type="text" name="userNick" placeholder="닉네임을 입력해주세요">
		<br>
		<input type="submit" value = "회원가입">
	</form>
</body>
</html>