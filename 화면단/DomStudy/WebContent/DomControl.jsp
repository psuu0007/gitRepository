<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id='theBox'>
		<h1>요소 생성 연습</h1>
	</div>

</body>

<script type="text/javascript">
	// 새로운 태그 생성
	var newDivTag = document.createElement('div');
	var newH1Tag = document.createElement('h1');
	
	var h1TextTag = document.createTextNode('요소 생성 연습');
	
	// 속성 설정
	newDivTag.setAttribute('id', 'theBox');
	newH1Tag.setAttribute('style', 'color: red');
	
	// 문서 객체 구조화 (관계 설정)
	newH1Tag.appendChild(h1TextTag);
	newDivTag.appendChild(newH1Tag);
	
	var bodyObj = document.getElementsByTagName('body')[0];
	
	bodyObj.appendChild(newDivTag);
	
	
	
</script>




</html>