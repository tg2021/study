<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 정보 보기</h2>
	<%
		// post방식으로 데이터가 넘어올때 한글이 깨질 수 있기에
		request.setCharacterEncoding("UTF-8");
	
		// RequestJoinProc.jsp에서 값 받아오기
		String id = request.getParameter("id");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		// []배열타입으로 리턴
		// 취미는 중복이 가능해서 배열을 사용한다
		String [] hobby = request.getParameterValues("hobby");
		
		String job = request.getParameter("job");
		String age = request.getParameter("age");
		String info = request.getParameter("info");
		
		if(!pass1.equals(pass2)) {
			
		
	%>
		<script type="text/javascript">
			alert("비밀번호가 틀립니다"); // 경고창
			history.go(-1); // 이전페이지로 이동
		</script>
	<%
		}
	%>
	
	<table width="500" border="1">
		<tr height="50">
				<td width="150" align="center">아이디</td>
				<td width="350">
					<%= id %>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">이메일</td>
				<td width="350">
					<%= email  %>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">전화번호</td>
				<td width="350">
					<%= tel %>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">당신의 관심분야</td>
				<td width="350">
					<%
						for(int i = 0; i < hobby.length; i++) {
							out.write(hobby[i] + " ");
						}
					%>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">당신의 직업은</td>
				<td width="350">
					<%= job  %>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">당신의 연령은</td>
				<td width="350">
					<%= age %>
				</td>
			</tr>
			<tr height="50">
				<td width="150" align="center">하고싶은말</td>
				<td width="350">
					<%= info %>
				</td>
			</tr>
	</table>
</body>
</html>