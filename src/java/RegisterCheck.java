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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
//@WebServlet(name = "RegisterCheck",urlPatterns = {"/servlet/RegisterCheck"})
public class RegisterCheck extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet{

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
        
        String Username=request.getParameter("username");
        String Password=request.getParameter("password");
        String Flag=request.getParameter("flag");
            String str,sql,url,user,password,sql1;
            int flag;
            Connection conn;
            PreparedStatement stmt;
            ResultSet rst;
            str = "com.mysql.jdbc.Driver";
            url="jdbc:mysql://localhost:3306/sys?characterEncoding=gb2312&useSSL=true";
            user = "root";
            password = "122955";
            PreparedStatement pstmt=null;
            //实例化数据库操作对象
        try {

            Class.forName(str).newInstance();
            conn = DriverManager.getConnection(url,user,password);
            sql = "Insert INTO user(username,password) VALUES('"+Username+"','"+Password+"')";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            //注册成功
            RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/LoginSuccess");
            dispatcher.forward(request, response);
            //response.setHeader("refresh", "3;URL=Login.jsp");
            out.print("<body><h2>注册成功！</h2>"+ "3秒后自动跳转到登录页面<br>"
                  + "如果没有跳转，请点<a href=\"Login.html\">这里</a></body>");
        } 
        catch (Exception e) 
        {
            //RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/LoginFailure");
        //dispatcher.forward(request, response);
            //发生异常，注册失败
            response.setHeader("refresh", "3;URL=Login.html");
            out.print("<body><h2>注册失败！</h2>" + "3秒后自动跳转到登录页面<br>"
                    + "如果没有跳转，请点<a href=\"Login.html\">这里</a></body>");
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

       // processRequest(request,response);
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
        response.setContentType("text/html; charset=gb2312");
        request.setCharacterEncoding("gb2312");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
