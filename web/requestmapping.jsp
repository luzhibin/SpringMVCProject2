<%--
  Created by IntelliJ IDEA.
  User: 12558
  Date: 03/08/2019
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestMapping.jsp</title>
</head>
<body>
    <h1>RequestMapping.jsp</h1>
    <a href="${pageContext.request.contextPath}/testRequestMapping_value1.action">请求方式1-测试SpringMVC-@RequestMapping之value属性</a><br>
    <a href="${pageContext.request.contextPath}/testRequestMapping_value2.action">请求方式2-测试SpringMVC-@RequestMapping之value属性</a><br>
    <hr>
    <form action="${pageContext.request.contextPath}/testMethod.action" method="post">
        <input type="submit" value="测试SpringMVC-@RequestMapping之Method属性">
    </form>
    <hr>
    <a href="${pageContext.request.contextPath}/testparams.action?name=luzhibin&age=10">测试SpringMVC-@RequestMapping之params属性</a><br>
    <hr>
    <a href="${pageContext.request.contextPath}/testheaders.action?name=luzhibin&age=10">测试SpringMVC-@RequestMapping之headers属性</a><br>
    <hr>
    <a href="${pageContext.request.contextPath}/testant.action/lz">测试SpringMVC-@RequestMapping之Ant风格</a><br>
    <hr>
    <a href="${pageContext.request.contextPath}/restful/1">测试SpringMVC-@PathVariable接收rest参数</a><br>
    <hr>
    <form action="${pageContext.request.contextPath}/testRestForm/100" method="post">
        <%--定义一个隐藏的表单 name值必须是：_method value为请求方式--%>
        <input type="hidden" name="_method" value="put">
        <input type="submit" value="测试method">
    </form><br>
    <hr>
    <a href="${pageContext.request.contextPath}/testHeader">测试SpringMVC-@RequestHeader</a>
</body>
</html>
