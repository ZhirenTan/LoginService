<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.sql.*" %>
<head>
<title>教务系统</title>
</head>
<br><br><br><br>
<center><h1><font face="verdana" color=white>「<%=request.getParameter("name")%>成绩单」</font></h1></center><br><br><br><br>

<body style="background: url(bg.jpg)">
    <%!int isUser=0;%>
    <%!ResultSet rst;%>
    <%!Connection conn;%>
    <%!PreparedStatement stmt;%>
    <%!String mathgrade;
    String Javagrade;
String OSgrade;
String Networkgrade;
    String Username;%>
    <%!String temp2;%>
    <%response.setContentType("text/html;charest=gb2312");
    request.setCharacterEncoding("gb2312");
    %>
 <%
       try{
           Username=request.getParameter("name");
            String str,sql,url,user,password;
            str = "com.mysql.jdbc.Driver";
            url="jdbc:mysql://localhost:3306/sys?characterEncoding=gb2312&useSSL=true";
            user = "root";
            password = "122955";
            PreparedStatement pstmt=null;
            Class.forName(str).newInstance();
            conn = DriverManager.getConnection(url,user,password);
            sql="Select * FROM user Where username='" +Username+"'";
            //实例化数据库操作对象
            stmt=conn.prepareStatement(sql);
            //查询数据库，返回结果集
            //sql = "select * from new_table"
            rst = stmt.executeQuery(sql);
            while(rst.next()) 
            {
                mathgrade=rst.getString("mathgrade");
                Javagrade=rst.getString("Javagrade");
                OSgrade=rst.getString("OSgrade");
                Networkgrade=rst.getString("Networkgrade");
                //out.println("mathgrade:");
                //out.println(rst.getString("mathgrade")+"\r");
                //out.println("Javagrade:");
                //out.println(rst.getString("Javagrade"));
            }
            rst.close();
            stmt.close();
            conn.close();
        }catch (ClassNotFoundException e) 
        {
System.out.println("Sorry,can`t find the Driver!");
e.printStackTrace();
} 
       catch (SQLException e) {
e.printStackTrace();
} 
       catch (Exception e) {
e.printStackTrace();
}
%>
<center><table style="width:50%;border:3px white solid">
    <tr bgcolor="#4F81BD"style="color: #fff;">
        <th style="text-align: center">科目</th>
        <th style="text-align: center">成绩</th>
    </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">Math</td>
            <td align="center"><%=mathgrade%></td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">Java</td>
            <td align="center"><%=Javagrade%></td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">OS</td>
            <td align="center"><%=OSgrade%></td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">Network</td>
            <td align="center"><%=Networkgrade%></td>
        </tr>
</table></center>
</body>
