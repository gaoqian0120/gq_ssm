<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gaoqian
  Date: 2022/04/19
  Time: 15:52:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table href="/user/showData.do" border="1">
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>密码</th>
        <th>email</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${all}" var="user">
        <tr>
            <td>${user.uid}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.email}</td>
            <td>${user.birthday}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
