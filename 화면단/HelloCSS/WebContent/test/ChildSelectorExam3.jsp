<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	div > ul > li {
		background-color: blue;
		color: orange;
	}
	
	div > #list > li {
		background-color: green;
		color: red;
	}
	
	ul > #list {
		background-color: green;
		color: red;
	}
</style>

<title>Insert title here</title>
</head>

<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul>
			<li>getElementById</li>
			<li>getElementsByTagnName</li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li>parentNode</li>
			<li>childNodes</li>
			<li>children</li>
			<li>firstChild</li>
			<li>previousSibling</li>
			<li>nextSibling</li>
		</ul>
	</div>
	
	<h1>여긴 div랑 관련없는 ul</h1>
	<ul>
		<li>1</li>
		<li>2</li>
	</ul>
	
</body>
</html>