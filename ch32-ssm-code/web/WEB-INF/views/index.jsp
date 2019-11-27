<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>

<h1>index</h1>

<script>
    $(function(){
        $.ajax({
            url:"/list",
            type:"GET",
            success:function(result){
                console.log(result.username);
            }
        });
    });
</script>
</body>
</html>
