<%-- 
    Document   : welcome
    Created on : Dec 19, 2018, 2:22:53 PM
    Author     : Fohrul Islam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome!!!!${sessionScope["userinfo"]}</h1>
        <a href="index.jsp">LogOut
            <c:remove var="userinfo" scope="session"></c:remove>
        </a>
    </body>
</html>
