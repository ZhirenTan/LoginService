<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>


<head>
<title>教务系统</title>
</head>
<br><br><br><br>
<center><h1><font face="verdana" color=white>「修改个人信息」</font></h1></center><br><br><br><br>

<body style="background: url(bg.jpg)">
    <%!int isUser=0;%>
    <%!ResultSet rst;%>
    <%!Connection conn;%>
    <%!PreparedStatement stmt;%>
    <%!
    String sex;
String Classs;
String grade;
String Major;
    String Username;%>
    <%!String temp2;%>
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
                Major=rst.getString("Major");
                Classs=rst.getString("Class");
                sex=rst.getString("sex");
                grade=rst.getString("Grade");
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
<center>
      <form action="ChangeOn" method="post">
    <table style="width:50%;border:3px white solid">
    <tr bgcolor="#4F81BD"style="color: #fff;">
    </tr>
    <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">姓名</td> 
            <td align="center"><%=Username%></td>
            <td><input type="text" name="Username"> </td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">性别</td> 
            <td align="center"><%=sex%></td>
            <td><input type="text" name="sexx"> </td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">班级</td>
            <td align="center"><%=Classs%></td>
            <td><input type="text" name="Classs"> </td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">年级</td>
            <td align="center"><%=grade%></td>
            <td><input type="text" name="gradee"> </td>
        </tr>
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">专业</td>
            <td align="center"><%=Major%></td>
            <td><input type="text" name="majorr"> </td>
        </tr>
        
</table>
            <input type="reset" name="Reset" value="Reset">
            <input type="submit" name="Submit2" value="Submit">
      </form>
</center>
</body>
