<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改</title>
    <style type="text/css">
        .header {
            margin: 10% 0 0 20%;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>修改用户</h1>
    <form action="" name="userForm">
        <input type="hidden" name="id" value="${user.id}"/>
        名字：<input type="text" name="name" value="${user.name}"/>
        性别：<input type="text" name="gender" value="${user.gender}"/>
        称号：<input type="text" name="position" value="${user.position }"/>
        <input type="button" value="提交" onclick="updateUser()"/>
    </form>
    <script type="text/javascript">
        function updateUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/updateUser";
            form.method = "post";
            form.submit();
        }
    </script>
</div>