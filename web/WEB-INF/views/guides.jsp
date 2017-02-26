<%--
  Created by IntelliJ IDEA.
  User: Lelental
  Date: 13.02.2017
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Builds</title>
</head>
<body>
<c:forEach items="${guideList}" var="guide">
    <li id="build_<c:out value="guide.name"/>">
        <div class="championName">
            <c:out value="${guide.champion.name}"/>
        </div>
    </li>
</c:forEach>
</body>
</html>
