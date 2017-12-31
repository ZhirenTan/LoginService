/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tan
 */
public class ChangeOn extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int isUser=0;
       //String svc =(String) request.getSession().getAttribute("sessionverify");
       try{
  
           String Sex=request.getParameter("sexx");
           String Username=request.getParameter("Username");
           String Classs=request.getParameter("Classs");
           String Grade=request.getParameter("gradee");
           String Major=request.getParameter("majorr");
            String str,sql,url,user,password;
            Connection conn;
            PreparedStatement stmt;
            ResultSet rst;
            str = "com.mysql.jdbc.Driver";
            url="jdbc:mysql://localhost:3306/sys?characterEncoding=gb2312&zeroDateTimeBehavior=convertToNull&useSSL=true";
            user = "root";
            password = "122955";
  PreparedStatement pstmt=null;
            Class.forName(str).newInstance();
            conn = DriverManager.getConnection(url,user,password);
            //sql="Update user set sex="+Sex+" and Class='"+Classs+"' and Grade='"+Grade+"' and Major='"+Major+"' Where username='" +Username+"'";
            //实例化数据库操作对象
            sql="Update user set sex='"+Sex+"' Where username='" +Username+"'";
            stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            sql="Update user set Class='"+Classs+"' Where username='" +Username+"'";
            stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            sql="Update user set Grade='"+Grade+"' Where username='" +Username+"'";
            stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            sql="Update user set Major='"+Major+"' Where username='" +Username+"'";
            stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("OK!");
            //while(rst.next()) 
            //{
                //System.out.println(rst.getString("username"));
                //System.out.println(rst.getString("password"));
                //isUser=1;
            //}
            //rst.close();
            stmt.close();
            conn.close();
    }
catch (Exception e){
            e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
