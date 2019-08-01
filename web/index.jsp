<%--
  Created by IntelliJ IDEA.
  User: 12558
  Date: 01/08/2019
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index.jsp</title>
  </head>
  <body>
    <h1>index.jsp</h1><br>
    <a href="${pageContext.request.contextPath}/first.action?id=1&name=luzhibin">发送请求1</a><br>
    <a href="${pageContext.request.contextPath}/second.action?id=1&name=luzhibin">发送请求2</a><br>
  </body>
</html>
