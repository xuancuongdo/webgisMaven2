<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
           <a href="login/login.jsp">aaaa</a>
           <form action="thuadat" method="post">
               <input name="test" type="text">
               <input type="submit" value="ok">
               
           </form>
           <%
               out.print("aaa");
               int i=0;
               ArrayList list= new ArrayList();
               
           %>
           <%=i%>
           <jsp:text >dgdsaga</jsp:text>
    </body>
</html>
