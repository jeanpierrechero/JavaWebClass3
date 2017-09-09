/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.servlet;

/**
 *
 * @author educacionit
 */



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="cs", urlPatterns="/add")
public class ComboServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String nombre = request.getParameter("nom");
        HttpSession session = request.getSession();
        List<String>nombres=(List<String>)session.getAttribute("noms");
            if(nombres==null){
                nombres = new ArrayList<>();
                session.setAttribute("noms",nombres);
            }
            nombres.add(nombre);
            response.sendRedirect("index.jsp");
        
    }
    
}
