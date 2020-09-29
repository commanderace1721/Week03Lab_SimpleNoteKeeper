<%-- 
    Document   : editnote
    Created on : Sep 28, 2020, 11:22:08 AM
    Author     : 826847
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Edit Note</h2>
        <form action="viewnote.jsp" method="get">
          <table>
              <tr><td><p>Title:</p></td><td><input type="text" value="${note.title}" name="editTitle" ></td></tr>
              <tr><td><p>Content:</p></td><td><textarea rows="4" cols="20" value="" name="editContent">${note.content}</textarea></td></tr>
        </table>
            <input type="submit" value="save"/>
            
        </form>
        
        
       
    </body>
</html>
