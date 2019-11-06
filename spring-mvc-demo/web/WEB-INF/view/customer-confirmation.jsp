<%--
  Created by IntelliJ IDEA.
  User: asadn
  Date: 04/11/2019
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>

Customer has been confirmed
Name: ${customer.firstName} ${customer.lastName}<br><br>
Freepasses: ${customer.freePasses}<br><br>
Postal Code: ${customer.postalCode}

</body>
</html>
