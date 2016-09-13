<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2016.08.24.
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form action="Register" method="post">
<table>
    <tr>
        <th>Login:</th>
        <td><input type="text" name="user_login" />
    </tr>
    <tr>
        <th>Password:</th>
        <td><input type="password" name="user_password" />
    </tr>
    <tr>
        <th>Confirm Password:</th>
        <td><input type="password" name="user_password2" />
    </tr>
    <tr>
        <th>First Name:</th>
        <td><input type="text" name="user_firstname" />
    </tr>
    <tr>
        <th>Last Name:</th>
        <td><input type="text" name="user_lastname" />
    </tr>
    <tr>
        <th>E-mail:</th>
        <td><input type="email" name="user_email" />
    </tr>
    <tr>
        <th></th>
        <td><input type="submit" value="Register" />
    </tr>
</table>
</form>

</body>
</html>
