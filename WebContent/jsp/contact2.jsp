<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

氏名:<%= request.getParameter("name") %><br>
会社:<%= request.getParameter("company") %><br>
メールアドレス:<%= request.getParameter("address") %><br>
お問合せ内容:<%= request.getParameter("msg") %><br>
メルマガ種類:<%= request.getAttribute("mails") %><br>
資料請求希望:<%=request.getParameter("info") %>
</body>
</html>