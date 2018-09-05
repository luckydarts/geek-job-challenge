<%-- 
    Document   : QueryString_output
    Created on : 2018/09/05, 16:48:01
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
        request.setCharacterEncoding("UTF-8");
        out.println("TOTAL :"+request.getParameter("total")+"yen");
        out.println("COUNT :"+request.getParameter("count"));
        out.println("TYPE :"+request.getParameter("type"));
        
        int a=Integer.parseInt(request.getParameter("count"));
        int b=Integer.parseInt(request.getParameter("total"));
        out.print("unit price :"+b/a);
            %>
        <%
        if(b>5000){
            out.println("POINT :"+b*0.05);
        }else if(b>3000){
            out.println("POINT :"+b*0.04);
        }else if(b<3000){
            out.println("POINT :"+0);
        }
            %>
    </body>
</html>
