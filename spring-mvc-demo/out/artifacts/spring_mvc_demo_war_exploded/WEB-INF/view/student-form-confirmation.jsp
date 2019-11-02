<%--
  Created by IntelliJ IDEA.
  User: asadn
  Date: 25/10/2019
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

Student Registration Confirmed: ${student.firstName} ${student.lastName}
<br><br>
Student Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating System:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>

</ul>

</body>
</html>
