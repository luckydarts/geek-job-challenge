<%-- 
    Document   : QueryString
    Created on : 2018/09/05, 15:55:20
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
        <form action="./QueryString_output.jsp" method="get">
            <p>total</p>
                <input type="text" name="total"><br>
            <p>count</p>
                <input type="text" name="count"><br>
            <p>type</p>
            1<input type="radio" name="type" value="雑貨">
            2<input type="radio" name="type" value="生鮮">
            3<input type="radio" name="type" value="その他">
            
            <input type="submit" name="btn">
        </form>
    </body>
</html>
