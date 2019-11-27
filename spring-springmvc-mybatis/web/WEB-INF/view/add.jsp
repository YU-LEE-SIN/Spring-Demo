<%--
  Created by IntelliJ IDEA.
  User: Yu
  Date: 2019/11/21
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee list</title>
</head>
<body>
    <form method="post" action="/userinfo/insert">
        <input type="text" name="username"/>
        <input type="text" name="gender"/>
        <input type="text" name="salary"/>
        <input type="text" name="deptid"/>
        <input type="date" name="datetime"/>
        <input type="submit" value="insert"/>
    </form>
</body>
</html>
