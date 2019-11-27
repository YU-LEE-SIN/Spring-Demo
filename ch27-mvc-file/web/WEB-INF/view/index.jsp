<%--
  Created by IntelliJ IDEA.
  User: Yu
  Date: 2019/11/20
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传下载</title>
</head>
<body>
<form method="post"
      enctype="multipart/form-data" action="file/upload">
    <input type="file" name="myfile">
    <input type="submit" value="上传">
</form>

<h4>==============<h4>
<a href="file/download?filename=1.jpg">下载</a>

<div>
    <img height="20px" width="20px" src="file/download?filename=1.jpg">
</div>
</body>
</html>
