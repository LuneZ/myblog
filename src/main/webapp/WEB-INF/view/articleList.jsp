<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>博客列表</title>
</head>
<body>
    <%--用EL表达式调用list对象的属性循环输出对象的各个属性值--%>
    <table width="500" border="1">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">type</th>
            <th scope="col">内容</th>
            <th scope="col">创建时间</th>
            <th scope="col">最近修改时间</th>
        </tr>
        <c:forEach var="article" items="${articleList}">
        <tr>
            <td>${article.id}</td>
            <td>${article.typeId}</td>
            <td>${article.content}</td>
            <td>${article.createTime}</td>
            <td>${article.lastModifyTime}</td>
        </tr>
        </c:forEach>
    </table>
    <p>一共${pageInfo.total}条记录，当前显示为第${pageInfo.pageNum}页/${pageInfo.pages}页。</p>
    <a href="?page=${pageInfo.firstPage}">首页</a>
    <a href="?page=${pageInfo.prePage}">上一页</a>
    <a href="?page=${pageInfo.nextPage}">下一页</a>
    <a href="?page=${pageInfo.lastPage}">最后一页</a>
</body>
</html>
