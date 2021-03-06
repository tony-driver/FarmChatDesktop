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
        wd.get("file:///C:/Users/Tony-Driver/Desktop/FarmChatDesktop/FarmChat/src/main/webapp/search.jsp//");
        if (!wd.findElement(By.tagName("html")).getText().contains("<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%> <%@include file=\"includes/dbconnection.jsp\" %> <%@ page import=\"java.io.*,java.util.*,java.sql.*\"%> <%@ page import=\"javax.servlet.http.*,javax.servlet.*\" %> <%@include file=\"includes/connection.jsp\" %> <%@include file=\"includes/initheader.jsp\" %> <% String user_to_find=request.getParameter(\"find\"); String sql_user_to_find_by_firstname=(\"select * from users where first_name='\"+user_to_find+\"'\"); String sql_user_to_find_by_lastname=(\"select * from users where last_name='\"+user_to_find+\"'\"); ResultSet rs_firstname=conn.createStatement().executeQuery(sql_user_to_find_by_firstname); ResultSet rs_lastname=conn.createStatement().executeQuery(sql_user_to_find_by_lastname); if(rs_firstname!=null || rs_lastname!=null){ if(rs_firstname!=null){ while(rs_firstname.next()){ String username_other_user=rs_firstname.getString(2); String firstname_other_user=rs_firstname.getString(3); String lastname_other_user=rs_firstname.getString(4); String profile_pic_other_user=rs_firstname.getString(10); out.println(\"<table height='125' width='75'>\"); out.println(\"<tr>\"); out.println(\"<a href=profile_other_user.jsp?username_other_user='\"+username_other_user+\">'\"); out.println(\"<img src='img/default_pic.jpg'/>\"); out.println(\"</tr>\"); out.println(\"</table>\"); } } if(rs_lastname!=null){ while(rs_lastname.next()){ String username_other_user=rs_lastname.getString(2); String firstname_other_user=rs_lastname.getString(3); String lastname_other_user=rs_lastname.getString(4); String profile_pic_other_user=rs_lastname.getString(10); out.println(\"<table height='125' width='75'>\"); out.println(\"<tr>\"); out.println(\"<a href=profile_other_user.jsp?username_other_user='\"+username_other_user+\">'\"); out.println(\"<img src='img/default_pic.jpg'/>\"); out.println(\"</tr>\"); out.println(\"</table>\"); } } } else{ out.println(\"<h2>THE USER YOU SEEK DOESNOT EXIST</h2>\"); } %> <%@include file=\"includes/footer.jsp\" %>")) {
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
