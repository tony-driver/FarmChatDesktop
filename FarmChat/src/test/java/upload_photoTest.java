import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class  {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void () {
        wd.get("file:///C:/Users/Tony-Driver/Desktop/FarmChatDesktop/FarmChat/src/main/webapp/upload_photo.jsp//");
        if (!wd.findElement(By.tagName("html")).getText().contains("<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%> <%@ page import=\"java.io.*,java.util.*\" %> <%@ page import=\"org.apache.commons.fileupload.*\" %> <%@ page import=\"org.apache.commons.fileupload.disk.*\" %> <%@ page import=\"org.apache.commons.fileupload.servlet.*\" %> <%@include file=\"includes/dbconnection.jsp\" %> <%@ page import=\"java.io.*,java.util.*,java.sql.*\"%> <%@ page import=\"javax.servlet.http.*,javax.servlet.*\" %> <%@include file=\"includes/connection.jsp\" %> <% String usernamelog=(String) pageContext.getAttribute(\"username\", PageContext.SESSION_SCOPE); %> <h2>Upload Your Photos: </h2> <hr/> <form action=\"\" method=\"POST\" enctype=\"multipart/form-data\"> <input type=\"file\" name=\"album_photo\"/><br/><br/> <input type=\"submit\" name=\"upload_pic\" value=\"Upload Image\"/> </form> <% if(request.getParameter(\"album_photo\")!=null){ File file=null; int maxFileSize = 5000 * 1024; int maxMemSize = 5000 * 1024; ServletContext context = pageContext.getServletContext(); String filePath = context.getInitParameter(\"file-upload\"); // Verify the content type String contentType = request.getContentType(); if ((contentType.indexOf(\"multipart/form-data\") >= 0)) { DiskFileItemFactory factory = new DiskFileItemFactory(); // maximum size that will be stored in memory factory.setSizeThreshold(maxMemSize); // Location to save data that is larger than maxMemSize. factory.setRepository(new File(\"c:\\\\album\")); // Create a new file upload handler ServletFileUpload upload = new ServletFileUpload(factory); // maximum file size to be uploaded. upload.setSizeMax( maxFileSize ); try { // Parse the request to get file items. List fileItems = upload.parseRequest(request); // Process the uploaded file items Iterator i = fileItems.iterator(); while ( i.hasNext () ) { FileItem fi = (FileItem)i.next(); if ( !fi.isFormField () ) { // Get the uploaded file parameters String fieldName = fi.getFieldName(); String fileName = fi.getName(); boolean isInMemory = fi.isInMemory(); long sizeInBytes = fi.getSize(); // Write the file if( fileName.lastIndexOf(\"\\\\\") >= 0 ){ file = new File( filePath + fileName.substring( fileName.lastIndexOf(\"\\\\\"))) ; }else{ file = new File( filePath + fileName.substring(fileName.lastIndexOf(\"\\\\\")+1)) ; } fi.write( file ) ; } } String sql_upload_photo=(\"UPDATE users SET image_url='\"+file+\"' where username='\"+usernamelog+\"'\"); try{ int action=conn.createStatement().executeUpdate(sql_upload_photo); conn.setAutoCommit(true); if(action==1){} } catch(Exception ex) { System.out.println(ex); } } catch(Exception ex) { System.out.println(ex); } } } else{%> <script type=\"text/javascript\">alert(\"Put something to upload\");</script> <% response.sendRedirect(\"upload_photo.jsp\"); } %>")) {
            System.out.println("verifyTextPresent failed");
        }
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
