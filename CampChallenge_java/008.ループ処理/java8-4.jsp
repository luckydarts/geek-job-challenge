<%-- 
    Document   : java8-4
    Created on : 2018/06/28, 13:50:08
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
            int x=1000;
            while(x>100){
            x=x/2;            
        }
            out.print(x);
            %>
    </body>
</html>
