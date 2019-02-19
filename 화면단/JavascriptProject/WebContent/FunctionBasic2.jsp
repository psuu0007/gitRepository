<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function greet(theText, str){
		alert(theText + str);
	}
	
</script>
</head>
<body>
	<button onclick="greet('반갑습니다!', '홍길동님');">버튼1</button>
	<button onclick="greet('안녕히 가세요!');">버튼2</button>
	<button onclick="greet(3);">버튼3</button>
	
</body>
</html>



