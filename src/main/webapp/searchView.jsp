
<%-- 商品検索画面 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TOP画面</title>
</head>

<%-- 「商品」はプロダクトのpと_で→p_ --%>
<body>

	<%-- post1 --%>
	<h3><strong>商品名で検索</strong></h3>
	<form action="/EC_Project/search" method="Post">
		
		<input type="text" name="p_name">
		<input type="submit" value="検索">
	</form>
	
	<%-- post2 --%><%-- ※作成中 --%>
	<h3><strong>商品分類で検索</strong></h3>
	<form action="/EC_Project/main" method="Post">
		<input type="checkbox" name="p_category" value="">
		<input type="checkbox" name="p_category" value="">
		<input type="checkbox" name="p_category" value="">
		<input type="checkbox" name="p_category" value="">
		<input type="checkbox" name="p_category" value="">
		<input type="checkbox" name="p_category" value="">
		<input type="submit" value="検索">
	</form>
	
</body>
</html>