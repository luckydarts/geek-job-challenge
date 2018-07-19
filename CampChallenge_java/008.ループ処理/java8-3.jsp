<%-- 
    Document   : java8-3
    Created on : 2018/06/28, 11:27:33
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
            int x=0;
            for(int i=0;i<=100;i++){
                x=x+i;
                out.print(x);
            }
        
%>
    </body>
</html>
