<%-- 
    Document   : java3-1
    Created on : 2018/06/20, 14:32:31
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
int num = 1;
final int num2 =2;
out.print(num+num2 + "<br>");
out.print(num-num2 + "<br>");
out.print(num*num2 + "<br>");
out.print(num/num2 + "<br>");
%> 
    </body>
</html>
