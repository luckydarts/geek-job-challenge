<%-- 
    Document   : java8-1
    Created on : 2018/06/27, 15:37:51
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
        <%long result =1;
        for(long i=0;i<20;i++){
            result=result*8;
        }
        out.print(result);
            %>
            
    </body>
</html>
