<%-- 
    Document   : editnote
    Created on : Sep 20, 2019, 4:27:56 PM
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
            <h3>Title</h3>  <input type="text" size="30" name="Title" value="${title}">
            <h3>Content</h3><input type="text" size="30" name="Content" value="${content}" ><br>
            <input type="submit" value="save">
        </form>
    </body>
</html>
