/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 826847
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
         String path = getServletContext().getRealPath("/WEB-INF");
         String notePath = path + "\\note.txt";
         BufferedReader br = new BufferedReader(new FileReader(new File(notePath)));
         String line = br.readLine();
         String line2 = br.readLine();
         Note note = new Note(line, line2);
         request.setAttribute("note",note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String path = getServletContext().getRealPath("/WEB-INF");
         String notePath = path + "\\note.txt";
         BufferedReader br = new BufferedReader(new FileReader(new File(notePath)));
         String line = br.readLine();
         String line2 = br.readLine();
         
         String test1 = request.getParameter("editTitle");
         String test2 = request.getParameter("editContent");
        Note note = new Note(test1, test2);
         request.setAttribute("note",note);
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(notePath, false)));
         pw.flush();
         pw.print(test1 + "\n");
         pw.print(test2);
         pw.close();
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       
    }

}
