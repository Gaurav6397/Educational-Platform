<%@page import="com.gaurav.web.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "cyan">
<%
User u1 = (User)request.getAttribute("data");
out.println(u1);
%>
</body>
</html>