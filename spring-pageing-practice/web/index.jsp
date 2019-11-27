<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/vue/2.6.10/vue.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <title>插件分页</title>
</head>
<body>
<div id="app">
    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>gender</td>
            <td>salary</td>
            <td>deptid</td>
        </tr>
        </thead>
        <tbody>
        <tr v-for="item in pageInfo.list">
            <td>{{item.id}}</td>
            <td>{{item.username}}</td>
            <td>{{item.gender}}</td>
            <td>{{item.salary}}</td>
            <td>{{item.deptid}}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
    <script type="text/javascript">
        var vue = new Vue({
            // 接管id为app的区域
            el:"#app",
            data:{
                //定义变量接收数据
                pageInfo: [],
                page: 1,
            },
            mounted: function () {//初始化数据 第一次会执行的方法
                $.get('/pageList', {pageNum: 1}, function (data) {
                    vue.pageInfo = data;
                }, "json");
            } //method end
        })
    </script>
</html>