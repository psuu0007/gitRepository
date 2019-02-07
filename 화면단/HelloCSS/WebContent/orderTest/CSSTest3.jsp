<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div {
	color: blue;
}

div ol {
	color: red;
}

div ol .cl_first, .cl_second {
	color: green;
}

div ol .cl_first {
	color: darkgray;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div>
		<ol>
			<li id='id_first' class='cl_first'>first</li>
			<li id='id_second' class='cl_second'>second</li>
			<li id='id_third' class='cl_third'>third</li>
		</ol>
	</div>
</body>
</html>