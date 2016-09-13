<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2016.08.18.
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Project Santa</title>
</head>
<body>

<h3>Merry Christmas + <%= new java.util.Date()%>></h3>
<a href="SignInPage.jsp">Sign In</a>
<a href="Register.jsp">Register</a>

<form action="hello" method="post">
    <input type="submit" VALUE="Go">
</form>

</body>
</html>
