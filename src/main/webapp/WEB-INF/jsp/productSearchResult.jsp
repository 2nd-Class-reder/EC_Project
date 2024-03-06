
<%-- 商品ページ --%> <%-- 作成中 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SearchBean" %>
<% SearchBean sb = (SearchBean)request.getAttribute("sb"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あ</title>
</head>
<body>
	foward成功　商品
	<%= sb.getP_name() %>
</body>
</html>