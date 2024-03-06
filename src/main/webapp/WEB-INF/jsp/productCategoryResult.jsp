
<%-- 商品分類の検索結果画面 --%> <%-- 作成中 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SearchBean" %>
<% SearchBean sb = (SearchBean)request.getAttribute("sb"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		foward成功　分類
		<%= sb.getP_categorys() %>
</body>
</html>