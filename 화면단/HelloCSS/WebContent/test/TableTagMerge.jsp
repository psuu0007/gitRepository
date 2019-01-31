<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css">
		table, tr, td{
			border: 1px solid black;
  			border-collapse: collapse;
  		}
  		
  		.title{
  			color: 20px;
  			font-weight: bold;
  			color: red;
  		}
  		
  		.performanceCnt{
  			text-align: center;
  			color: gray;
  		}
  		
  		.numFormat{
  			text-align: right;
  			color: blue;
  		}
	</style>
	<title>Insert title here</title>
</head>

<body>
	<h1>표 만들기</h1>		
	<h2>셀 합치기</h2>
		
	<table>
		<tr>
			<td colspan="3" align="center">공연요금</td>
		</tr>
		<tr>
			<td class='title'>구분</td>
			<td class='title'>S석</td>
			<td class='title'>VIP</td>
		</tr>
		<tr>
			<td class='title'>성인</td>
			<td class='numFormat'>30000</td>
			<td class='numFormat'>50,000</td>
		</tr>
		<tr>
			<td class='title'>청소년</td>
			<td class='numFormat'>40,000원</td>
			<td class='numFormat'>60,000원</td>
		</tr>
		<tr>
			<td class='title'>소인</td>
			<td colspan='2'>미취학 아동 일반 요금의 50%</td>
		</tr>
		<tr>
			<td rowspan='3' class='title'>공연시간</td>
			<td class='performanceCnt'>1회</td>
			<td>13:00시 - 15:00시</td>
		</tr>
		<tr>
			<td class='performanceCnt'>2회</td>
			<td>17:00시 - 19:00시</td>
		</tr>
		<tr>
			<td class='performanceCnt'>3회</td>
			<td>17:00시 - 19:00시</td>
		</tr>
	</table>	
		
		
		
		
</body>
</html>