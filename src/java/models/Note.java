/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 759841
 */
public class Note 
{
    String title;
    String content;
    
    public Note()
    {
        
    }
    public Note(String title, String content)
    {
        this.title=title;
        this.content=content;
    }
    
    public void setTitle(String title)
    {
        this.title= title;
    }
    public String getTitle()
    {
        return title;
    }
    
    public void setContent(String content)
    {
        this.content=content;
    }
    public String getContent()
    {
        return content;
    }
    
    /*
    String path = getServletContext().getRealPath("/WEB-INF/note.txt");
// to read filesBufferedReader 
    br = new BufferedReader(new FileReader(new File(path)));
// to write to a filePrintWriter 
    pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
*/
}
