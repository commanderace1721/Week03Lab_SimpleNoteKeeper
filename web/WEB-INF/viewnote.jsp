<%-- 
    Document   : viewnote
    Created on : Sep 28, 2020, 11:21:51 AM
    Author     : 826847
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <header>
        <h1>Simple Note Keeper</h1>
    </header>
    </head>
    <body onload="document.getElementById('form2').style.display='none'; return false;">
        <div>
            
            
        </div>
           
        <form id="form">
            
           
        <h2>View Note</h2>
        <table>
            <tr><td><h3>Title:</h3></td><td>${note.title}<td></tr>
            <tr><td><h3>Content:</h3></td><td>${note.content}<td></tr>
        </table>
        <a href="javascript{}" onclick="document.getElementById('form').style.display='none' ; document.getElementById('form2').style.display='inline';return false; ">Edit</a>
        
        <br>
        </form>
        <form action="note" method="post" id="form2">
            <jsp:include page="editnote.jsp"/>
            
        </form>
            <p>
                ${test1} ${test2}
            </p>
    </body>
</html>
