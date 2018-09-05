<%-- 
    Document   : HTML2
    Created on : 2018/09/05, 15:20:49
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("txtName")+"<br>");
            out.print(request.getParameter("rdoSample")+"<br>");
            out.print(request.getParameter("nultext")+"<br>");
        %>
    </body>
</html>
