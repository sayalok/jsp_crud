<%-- 
    Document   : home
    Created on : May 11, 2020, 10:27:49 PM
    Author     : me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= session.getAttribute("uname") %>
    </body>
</html>
