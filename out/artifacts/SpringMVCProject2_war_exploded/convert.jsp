<%--
  Created by IntelliJ IDEA.
  User: 12558
  Date: 02/08/2019
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
    <h1>Convert.jsp</h1><br>
    <form action="${pageContext.request.contextPath}/convert.action" method="post">
        年龄：<input type="text" name="age">
        生日：<input type="text" name="date">
        姓名：<input type="text" name="name">
        <input type="submit" value="提交">
    </form>
</body>
</html>
