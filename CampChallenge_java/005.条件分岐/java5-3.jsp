<%-- 
    Document   : java5-3
    Created on : 2018/06/23, 13:57:12
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
            char word = 'あ';
            switch(word){
                case'A':
                    out.print("英語");
                    break;
                case'あ':
                    out.print("日本語");
                    break;
                default:
                    break;
             }
            %>
    </body>
</html>
