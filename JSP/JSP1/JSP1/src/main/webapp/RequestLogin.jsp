<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	내장객체 : 자주 사용되는 객체, 별도의 선언 없이 사용 가능
		
	request : 웹 브라우저의 요청 정보를 저장하고 있는 객체
	response : 웹 브라우저의 요청에 대한 응답 정보를 저장하고 있는 객체
	out : jsp 페이지에 출력할 내용을 가지고 있는 출력 스트림 객체
	session : 하나의 웹 브라우저의 정보를 유지하기 위한 세션 정보를 저장하고 있는 객체
	application : 웹 어플리케이션 Context의 정보를 저장하고 있는 객체
	pageContext : jsp 페이지에 대한 정보를 저장하고 있는 객체
	page : jsp 페이지를 구현한 자바 클래스 객체
	config : jsp 페이지에 대한 설정 정보를 저장하고 있는 객체
	exception : jsp 페이지서 예외가 발생한 경우에 사용되는 객체
	--> 
	<h2>로그인 페이지</h2>
		<form action="RequestLoginProc.jsp" method="get">
		<!-- 
		method : 전송방식
		
		get방식 : url에 내가쓴 정보가 보인다
		post방식 : url에 내가쓴 정보가 안보인다
		 -->
			 <table width="400" border="1">
			 	<tr height="60">
			 		<td align="center" width="150">아이디</td>
			 		<td align="left" width="250">
			 			<input type="text" name="id">
			 		</td>
			 	</tr>
			 	<tr height="60">
			 		<td align="center" width="150">패스워드</td>
			 		<td align="left" width="250">
			 			<input type="password" name="pass">
			 		</td>
			 	</tr>
			 	<tr height="60">
			 		<td colspan="2" align="center">
			 			<input type="submit" value="전송">
			 		</td>
			 	</tr>
			 </table>
		</form>
		
</body>
</html>