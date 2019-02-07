<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	#spanInfoContainer{
/* 		border: 1px solid black; */
		width: 400px;
		position:fixed;
		left: 500px; 
		top: 75px;
	}
</style>
<title>Insert title here</title>
</head>

<body>
	<h1>그룹핑</h1>
	
	<div id="footer" style="border: 1px solid black; width: 400px;">
		<h2>div 요소</h2>
		<ul>
			<li><a href="#">홈</a></li>
			<li><a href="#">회사소개</a></li>
		</ul>
		<address>COPYRIGHT &copy; iCox. All Rights Reserved</address>
	</div>
	
	<div id='spanInfoContainer'>
		<h2>span 요소</h2>
		<ul>
			<li>
				<span>
					<strong><a href="#">오늘의 book</a></strong><br />
					<em><a href="#">HTML5와 CSS3</a></em>
				</span>
			</li>
		</ul>
	</div>
</body>
</html>