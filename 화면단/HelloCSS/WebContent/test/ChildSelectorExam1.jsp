<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	 body div p{
         border: 1px solid blue;
         padding-left: 100px;
         padding-top: 50px;
     }
      
     body > div> div > ul > li > p{
         border: 1px solid blue;
         padding-left: 100px;
         padding-top: 50px;
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
		<div title='select연습'>
			<ul id="list">
				<li>parentNode</li>
				<li><p>childNodes</p></li>
				<li><p>children</p></li>
				<li><p>firstChild</p></li>
				<li>previousSibling</li>
				<li>nextSibling</li>
			</ul>
		</div>
	</div>
	
	<p>이 친구는 실행되면 안되</p>
</body>
</html>