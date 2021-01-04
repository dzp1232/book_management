<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<% pageContext.setAttribute("path", request.getContextPath()); %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        h1 {
            margin: 20%;
            text-align: center;
            background: black;
            border-radius: 4px;
        }

        a {
            color: chartreuse;
            text-decoration: none;
        }

        .header {
            width: 700px;
            margin: 0px auto;
            border: solid 1px red;
            position: relative;
        }

        .written {
            display: block;
            width: 100%;
            margin: 0;
        }

        .img {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="header">
    <img class="img" src="zp.jpg">
    <h1 class="written">
        <a href="${path }/user/homePage">大家好！我只是一只绿色Hello World...请对我温柔点,轻轻点击我！</a>
    </h1>
</div>
</body>
</html>