<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ServletTest/servlet/contact" method="post">

氏名:<input type="text" name="name" required="required"><br>
会社:<input type="text" name="company"><br>
メールアドレス:<input type="text" name="address" required="required"><br>
お問合せ内容:<br>
<textarea rows="5" cols="50" value="msg" name= "msg"required="required"></textarea>
<br>
メルマガ種類:
<input type="checkbox" name="mail" value="総合案内">
「総合案」
<input type="checkbox" name="mail" value="セミナー案内">
「セミナー案内」
<input type="checkbox" name="mail" value="求人採用情報">
「求人採用情報」
<br>
資料請求希望:
<input type="radio" name="info" value="Yes">
「Yes」
<input type="radio" name="info" value="No">
「No」
<br>
<input type="submit" value="送信">

</form>

</body>
</html>