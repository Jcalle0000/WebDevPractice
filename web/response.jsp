<%-- 
    Document   : response
    Created on : Jul 20, 2020, 2:21:04 PM
    Author     : jasoncalle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>response1</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="com.NameHandler" />
<!--        You can use  this bean from any JSP page
        in the  same session whether processes the same request or not-->
        
        <jsp:setProperty name="mybean" property="name"  />
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
    
    </body>
</html>


<!--Hello-->