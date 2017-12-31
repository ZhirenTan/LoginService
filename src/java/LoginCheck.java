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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class LoginCheck extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet{
    private Object dispatcher;
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
        response.setContentType("text/html;charest=gb2312");
    request.setCharacterEncoding("gb2312");
       int isUser=0;
       //String svc =(String) request.getSession().getAttribute("sessionverify");
       try{
           String Username=request.getParameter("username");
           String Password=request.getParameter("password");
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
            sql="Select * FROM user Where username='" +Username+"'and password= '"+Password+"'";
            //实例化数据库操作对象
            stmt=conn.prepareStatement(sql);
            //查询数据库，返回结果集
            //sql = "select * from new_table"
            //<form action="In_Grade.jsp">  
           // <input type="submit"name="submit" value=<%=Username%>>
 //</form>    
//<form action="In_Person.jsp">  
            //<input type="submit" name="submit"value=<%=Username%>>
 //</form>  
            rst = stmt.executeQuery(sql);
            while(rst.next()) 
            {
                //System.out.println(rst.getString("username"));
                //System.out.println(rst.getString("password"));
                isUser=1;
            }
            rst.close();
            stmt.close();
            conn.close();
 
        }catch (Exception e){
            e.printStackTrace();
        }
       if(isUser==1)
       {
           RequestDispatcher dispatcher=request.getRequestDispatcher("/jwxt_s.jsp");
           dispatcher.forward(request, response);
       }
       else
       {
           //System.out.println("对不起，您不是合法用户！");
           RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/Login.html");
           dispatcher.forward(request, response);
       }
       //RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(resultpage);
       //dispatcher.forward(request, response);

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  processRequest(request,response);
  response.setContentType("text/html; charset=GB2312");
  request.setCharacterEncoding("GB2312");
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

    private void getRequestDispatcher(String loginsucess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
