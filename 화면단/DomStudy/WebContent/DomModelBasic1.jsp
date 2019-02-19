<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UFT-8">
	<title>웹 문서구조</title>
<script type="text/javascript">
	var test = '아니? 스크립트를 2개 따로 선언해서 써되나요?';
	
</script>
</head>
<body>
	<div>
		<h1 id='title'>DOM</h1>
		<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
	</div>
</body>

<script type="text/javascript">
	var myObj = document.getElementById('title');
	
	myObj.style.color = '#f00';
	myObj.style.border = '1px solid black';
	
</script>
	
</html>
