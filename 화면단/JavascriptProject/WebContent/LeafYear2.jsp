<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	var year = 2400;

	if (year % 4 == 0) {
		if (year % 100 == 0) {
			document.write(year + '년도는 평년입니다.');
		} else if (year % 400 == 0) {
			document.write(year + '년도는 윤년입니다.');
		} else {
			document.write(year + '년도는 윤년입니다.');
		}
	} else {
		document.write(year + '년도는 평년입니다.');
	}
</script>

</head>
<body>

</body>
</html>