<%--
  Created by IntelliJ IDEA.
  User: Yu
  Date: 2019/11/21
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>username</th>
        <th>gender</th>
        <th>salary</th>
        <th>deptid</th>
        <th>datetime</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list.list}" var="user">
        <tr>
            <th>${user.id}</th>
            <th>${user.username}</th>
            <th>${user.gender}</th>
            <th>${user.salary}</th>
            <th>${user.deptid}</th>
            <th>${user.datetime}</th>
            <th><a href="/userinfo/delete?deptid=${user.deptid}">删除</a></th>
            <th><a href="/userinfo/update?id=${user.id}">修改</a></th>

        </tr>
    </c:forEach>
    </tbody>
</table>
<ul>
    <li><a href="/userinfo/list?pageNum=1">首页</a></li>
    <li><a href="/userinfo/list?pageNum=${list.prePage}">上一页</a></li>
    <li><a href="/userinfo/list?pageNum=${list.nextPage}">下一页</a></li>
    <li><a href="/userinfo/list?pageNum=${list.pages}">尾页</a></li>

    <c:forEach items="${list.navigatepageNums}" var="p">
        <li><a href="/userinfo/list?pageNum=${p}">${p}</a></li>
    </c:forEach>
</ul>
</body>
</html>
