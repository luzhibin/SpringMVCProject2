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
    <h3>第一种方式:使用传统的request对象来接收参数</h3><br>
    <a href="${pageContext.request.contextPath}/first01.action?id=1&name=luzhibin">第一种方式发送请求1</a><br>
    <a href="${pageContext.request.contextPath}/first02.action?id=1&name=luzhibin">第一种方式发送请求2</a><br>

    <hr>
    <h3>第二种方式:不使用request，使用@RequestParam进行匹配</h3><br>
    <a href="${pageContext.request.contextPath}/second.action?id=22222&name=luzhibin22222">第二种方式发送请求</a><br>

    <hr>
    <h3>使用JavaBean接收参数：要求对象当中的属性要和表单当中的名称一致</h3>
    <form action="${pageContext.request.contextPath}/myform">
      user:<input type="text" name="user_name"><br>
      age:<input type="text" name="user_age"><br>
      <input type="submit" value="提交">
    </form>

    <hr>
    <h3>数组接收参数</h3>
    <form action="${pageContext.request.contextPath}/myform2">
      user:<input type="text" name="user_name"><br>
      age:<input type="text" name="user_age"><br>
      hobby:<input type="checkbox" name="hobby" value="唱">唱
            <input type="checkbox" name="hobby" value="跳">跳
            <input type="checkbox" name="hobby" value="Rap">Rap
            <input type="checkbox" name="hobby" value="篮球">篮球<br>
      <hr>
      <h3>使用包装类接收参数</h3><br>
      宠物名称：<input type="text" name="dog.name"><br>
      宠物颜色：<input type="text" name="dog.color"><br>
      <hr>
      <h3>使用List集合接收参数</h3><br>
      -------------宠物1------------<br>
      宠物名称：<input type="text" name="dogs[0].name"><br>
      宠物颜色：<input type="text" name="dogs[0].color"><br>
      -------------宠物2------------<br>
      宠物名称：<input type="text" name="dogs[1].name"><br>
      宠物颜色：<input type="text" name="dogs[1].color"><br>
      -------------宠物3------------<br>
      宠物名称：<input type="text" name="dogs[2].name"><br>
      宠物颜色：<input type="text" name="dogs[2].color"><br>
      <input type="submit" value="提交"><br>
  </body>
</html>
