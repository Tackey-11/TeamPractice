<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.newAccountDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規アカウント作成</title>
</head>
<body>
     <%
        request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
	    newAccountDTO ac = (newAccountDTO)session.getAttribute("input_data");
   %>
		<form action="NewAccountRegisterServlet" method="post">
     <h1>新規会員登録</h1>
     <input placeholder="Email" type="email" name="email" value="<%=ac.getMail()%>"><br>
     <input  placeholder="Password"  type="password" name="pw" minlength="6" placeholder="最低6文字以上"><br>
     <input type="password" placeholder="Re Password" name="pw2"><br>
     <input type="text" placeholder="名前" name="name" value="<%=ac.getName()%>"><br>
     <input  placeholder="フリガナ" type="text" name="furigana" value="<%=ac.getFurigana()%>"><br>
     <input type="submit" value="登録" >
     </form>
		<p style="color:red">登録に失敗しました。</p>
	<%
		} else if(errorCode != null && errorCode.equals("2")){
		newAccountDTO ac = (newAccountDTO)session.getAttribute("input_data");
	%>
		<form action="NewAccountRegisterServlet" method="post">
     <h1>新規会員登録</h1>
     <input placeholder="Email" type="email" name="email" value="<%=ac.getMail()%>"><br>
     <input  placeholder="Password"  type="password" name="pw" minlength="6" placeholder="最低6文字以上"><br>
     <input type="password" placeholder="Re Password" name="pw2"><br>
     <input type="text" placeholder="名前" name="name" value="<%=ac.getName()%>"><br>
     <input  placeholder="フリガナ" type="text" name="furigana" value="<%=ac.getFurigana()%>"><br>
     <input type="submit" value="登録" >
     </form>
	 <% 
	   } else {
	 %>
	 
	 <form action="NewAccountRegisterServlet" method="post">
     <h1>新規会員登録</h1>
     <input placeholder="Email" type="email" name="email" ><br>
     <input  placeholder="Password"  type="password" name="pw" minlength="6" placeholder="最低6文字以上"><br>
     <input type="password" name="pw2" placeholder="Re Password"><br>
     <input type="text" name="name" placeholder="名前"><br>
     <input  placeholder="フリガナ" type="text" name="furigana"><br>
     <input type="submit" value="登録" >
     </form>
	<%
		}
	%>
</body>
</html>