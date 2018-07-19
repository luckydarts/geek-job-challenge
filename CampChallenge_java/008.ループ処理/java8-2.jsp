<%-- 
    Document   : java8-2
    Created on : 2018/06/28, 11:00:39
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
        <% String word="A";
            for(int i=0;i<30;i++){
                out.print(word);
            }
            %>
    </body>
</html>
