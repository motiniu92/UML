<%-- 
    Document   : index
    Created on : Dec 19, 2018, 1:25:34 PM
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
        <h1>Hello JSP Page!</h1>
        <form action="process.jsp">
            <table>
                <tr>
                    <td>User name</td>
                    <td>:</td>
                    <td><input type="text" name="user"></td>
                </tr>
                <tr>
                    <td>User Password</td>
                    <td>:</td>
                    <td><input type="password" name="pass"></td>
                </tr>
            </table>
            <input type="submit" value="send"/>
        </form>
        <c:if test="${ not empty param.errM}">
            <c:out value="${param.errM}"></c:out>
        </c:if>
    </body>
</html>
