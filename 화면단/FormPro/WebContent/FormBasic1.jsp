<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>

<body>
	<h1>input 요소</h1>
	<form action="./CSSTest1.jsp" method="get">
		<fieldset>
			<legend>회원가입</legend>
			<p>
<!-- 				아이디 : <input type="text" size="12" maxlength="8" /> -->
				아이디 : <input type="text" name='id' size="22" maxlength="8" />
			</p>
			<p>
				비밀번호 : <input type="password" 
					size="12" maxlength="8" name='pwd' />
			</p>
			<p>
				메일 수신 여부 : 
				<input type="radio" value="y" name="receive" />예 
				<input type="radio" value="n" name="receive" />아니요
				<input type="radio" value="n" name="rec" />모르겠다
				<input type="radio" value="n" name="rec" />rmwi?
			</p>
			<p>
				관심 분야: 
				<input type="checkbox" value="HTML" name="chk1" />HTML 
				<input type="checkbox" value="CSS" name="chk2" />CSS 
				<input type="checkbox" value="Javascript" 
					name="chk3" />Javascript
			</p>
			<p>
				<input type="submit" value="전송" /> 
				<input type="reset" value="취소" />
				<input type="button" value="확인" /> 
				<input type="image"
					src="images/search.gif" alt="검색" />
			</p>
			<p>
				파일 올리기 : <input type="file" />
			</p>
			<p>
				<input type="hidden" />
			</p>
		</fieldset>
	</form>
</body>
</html>