<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>列表</title>
    <style type="text/css">
        .header {
            margin: 10% 0 0 20%;
        }
        table{
            border: black solid 1px;
            width: 50%;
            height: 40%;
        }
        .add{
            color: blue;
            text-decoration: none;
            font-size: 20px;
        }
    </style>
</head>
<body>
<div class="header">
    <h1><small>用户列表</small></h1>
    <a class="add" href="${path}/user/addPage">新增</a>
    <table class="table">
        <thead>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>性别</th>
            <th>称号</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${requestScope.get('list')}" varStatus="status">
            <tr class="content">
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.gender}</td>
                <td>${user.position}</td>
                <td>
                    <a href="${path}/user/updatePage?id=${user.id}">编辑</a> |
                    <a href="<%=path%>/user/delUser/${user.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</div>
</body>