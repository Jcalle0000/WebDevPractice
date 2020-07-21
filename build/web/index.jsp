<%-- 
    Document   : index
    Created on : Jul 19, 2020, 9:29:25 PM
    Author     : jasoncalle
--%>

<%@page import="java.util.Date"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="StyleSheet1.css" type="text/css" rel="StyleSheet" />
    </head>
    <% 
        Date date = new Date();
    %>
    <body>
        <h1>Today's Date is <%= date %>  </h1>
    </body>
</html>
