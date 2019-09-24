<%-- 
    Document   : viewnote
    Created on : Sep 20, 2019, 4:27:43 PM
    Author     : 759841
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="viewnote" method="post">
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2> 
            <h3>Title</h3>${print.title} 
            <h3>Content</h3>${print.content}
            <br>
            <a href=viewnote?edit>Edit</a> ${text}
        </form>
    </body>
</html>
