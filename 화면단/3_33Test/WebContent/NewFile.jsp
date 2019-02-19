<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

img {
	vertical-align: top;
	border: 0px;
}

#galleryWrap {
	width: 510px;
	margin: 0px auto;
	text-align: center;
}

#galleryWrap img {
	vertical-align: middle;
}
</style>
<title>Insert title here</title>

<script type="text/javascript">
	//<![CDATA[
	var num = 1;
	
	function nextGallery() {
		num++;
		if (num > 7){
			num = 1;
		}
		document.getElementById("gallery").src = "images/img" + num + ".jpg";
		return false;
	}

	function prevGallery() {
		num--;
		if (num < 1){
			num = 7;
		}
		document.getElementById("gallery").src = "images/img" + num + ".jpg";
		return false;
	}
	//]]>
</script>
</head>
<body>
	<div id="galleryWrap">
		<h1>이미지 넘기기</h1>
		<p>
			<a href="#prev" onclick="prevGallery();">
				<img src="images/left_btn.png" alt="이전 그림"/></a> 
			<img src="images/img1.jpg" style="width: 300px;" alt="갤러리 그림" id="gallery"/> 
			<a href="#next" onclick="nextGallery();">
				<img src="images/right_btn.png" alt="다음 그림"/>
			</a>
		</p>
	</div>
</body>
</html>