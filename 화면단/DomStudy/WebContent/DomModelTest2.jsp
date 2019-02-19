<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul>
			<li>
				getElementById
			</li>
			<li>
				getElementsByTagName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list">
			<li>
				parentNode
			</li>
			<li>
				childNodes3432423
			</li>
			<li>
				children
			</li>
			<li>
				firstChild
			</li>
			<li>
				previousSibling
			</li>
			<li>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	var ulObjArr = document.getElementsByTagName('ul');	
	var liObj = ulObjArr[0].getElementsByTagName('li')[0];
	
	liObj.style.backgroundColor = '#fff286';
	
	var ulObj = document.getElementById('list');
	var liObj2 = ulObj.getElementsByTagName('li')[1];
	
	liObj2.style.backgroundColor = liObj.style.backgroundColor;
	
// 	liObj.textContent = '와 수정은 대입 연사자 맞지 ';
	
// 	alert(liObj.textContent);
	
	
	
	
</script>


</html>