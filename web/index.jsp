<%-- 
    Document   : index
    Created on : 09-sep-2017, 10:46:15
    Author     : educacionit
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<%=session.getId()%>--es para que nos devuelva el cookie del cliente--%>
        <br>
        <form method="POST" action="add">
            nombre:<input type="text" name="nom"/>
            <input type="submit" value="agregar"/>
            </<form>
                <%List<String> nombres = (List<String>) session.getAttribute("noms");%>
                <select>
                    <%if (nombres != null) {%>
                    <%for (String nom : nombres) {%>
                    <option><%=nom%></option>
                    <%}%>
                    <%}%>
                </select>
                </body>
                </html>
