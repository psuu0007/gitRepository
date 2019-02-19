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
		<!--    <button id='btn1'>버튼 </button><button id='btn2'>버튼2 </button> -->
	</div>
</body>
<script type="text/javascript">
	var newBtn1 = document.createElement('button');
	var newBtn1Text = document.createTextNode('버튼1');

	newBtn1.setAttribute('id', 'btn1');
	newBtn1.appendChild(newBtn1Text);

	var newBtn2 = document.createElement('button');
	var newBtn2Text = document.createTextNode('버튼2');

	newBtn2.setAttribute('id', 'btn2');
	newBtn2.appendChild(newBtn2Text);

	var newdiv = document.getElementsByTagName('div')[0];
	newdiv.appendChild(newBtn1);
	newdiv.appendChild(newBtn2);
</script>
</html>