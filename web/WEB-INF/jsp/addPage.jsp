<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增</title>
    <style type="text/css">
        .header {
            margin: 10% 0 0 20%;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>新增用户</h1>
    <form action="" name="userForm">
        名字：<input type="text" name="name">
        性别：<input type="text" name="gender">
        称号：<input type="text" name="position">
        <input type="button" value="添加" onclick="addUser()">
    </form>
    <script type="text/javascript">
        function addUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/addUser";
            form.method = "post";
            form.submit();
        }
    </script>
</div>