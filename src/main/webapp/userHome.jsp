<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2016.09.06.
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%
    String userId = null;
    String sessionId = null;
//    if (session.getAttribute("user") == null) {
//        response.sendRedirect("index.jsp");
//    }
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("user")) {
                userId = cookie.getValue();
            }
            if (cookie.getName().equals("JSESSIONID")) {
                sessionId = cookie.getValue();
            }
        }
    }

%>

<a href="Tests.jsp">Tests</a>
<h3> Hi, <%=userId %></h3>
<h3>Name is <%= session.getAttribute("user")%></h3>
<h4>Your Session Id is: <%=sessionId %> </h4>

<a href="Logout">Logout</a>
</body>
</html>
