<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.newAccountDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <div style="text-align:center">
    <h1>下記の内容で登録します。よろしいですか？</h1>
	<%
		newAccountDTO account = (newAccountDTO)session.getAttribute("input_data");
	%>
	メール：<%=account.getMail() %><br>
	パスワード：********<br>
	名前：<%=account.getName() %><br>
	フリガナ:<%=account.getFurigana() %><br>
	<a href="RegisterNewAccountServlet">OK</a><br>
	<a href="NewAccountServlet?error=2">戻る</a>
  </div>
</body>
</html>