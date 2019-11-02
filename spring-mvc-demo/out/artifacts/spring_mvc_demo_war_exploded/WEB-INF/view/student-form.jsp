<%--
  Created by IntelliJ IDEA.
  User: asadn
  Date: 25/10/2019
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName"/>
        <br><br>
        Last Name: <form:input path="lastName"/>
        <br><br>

        Country:

        <form:select path="country">
            <form:options items="${student.countryOptions}"/>

        </form:select>

        <br><br>

        Favorite Languages:

        <form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>

        <br><br>

<%--        <form:checkbox path="operatingSystems" items="${student.operatingSystemOptions}"/>--%>
        Windows<form:checkbox path="operatingSystems" value="Windows"/>
        Linux<form:checkbox path="operatingSystems" value="Linux"/>
        MacOS<form:checkbox path="operatingSystems" value="MacOS"/>

        <br><br>
        
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
