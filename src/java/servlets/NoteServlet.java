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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 759841
 */
public class NoteServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      String title;
      String content;
      
      String path = getServletContext().getRealPath("/WEB-INF/Note.txt");
// to read filesBufferedReader 
      BufferedReader  br = new BufferedReader(new FileReader(new File(path)));
// to write to a filePrintWriter 
     // PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

      title = br.readLine();
      content = br.readLine();
      
      
      Note n = new Note(title,content);
      request.setAttribute("print",n);
      request.setAttribute("title", title);
      request.setAttribute("content", content);
      
      br.close();
      
      String editNote = request.getParameter("edit");
      
      if(editNote==null)
      {
         
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
      }
      else if (editNote.equals(""))
      {
          getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
          
      }
       
      
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
          
       String path = getServletContext().getRealPath("/WEB-INF/Note.txt");
       String title = request.getParameter("Title");
       String content =  request.getParameter("Content");
       
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       
       Note n = new Note(title,content);
       request.setAttribute("print", n);
       pw.write(n.getTitle() + "\n");
       pw.write(n.getContent());
       pw.close();
      
       
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

}
