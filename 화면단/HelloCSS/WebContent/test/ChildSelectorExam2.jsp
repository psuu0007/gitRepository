<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <style type="text/css">
   ul > li{
      color: red;
      background-color: blue;
   }
   #list > li{
      color: orange;
      background-color: green;
   }
   
   </style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
      <ul id="list">
         <li>parentNode</li>
         <li>childNodes</li>
         <li>children</li>
         <li>firstChild</li>
         <li>previousSibling</li>
         <li>nextSibling</li>
      </ul>
   </div>
</body>
</html>