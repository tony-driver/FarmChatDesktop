<%-- 
    Document   : dbconnection
    Created on : Nov 26, 2015, 10:10:10 PM
    Author     : Mits
--%>

<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

       <% 
      
       java.sql.Connection conn=null;
       String url="jdbc:mysql://localhost:3306/snapchat";
       String Driver="com.mysql.jdbc.Driver";
       String username="root";
       String password="";
       try{
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       conn=DriverManager.getConnection(url,username,password);
       if(conn==null){out.println("Cannot connect to DB");}
       }
       catch(Exception e){e.printStackTrace();
      }
       
       %>

