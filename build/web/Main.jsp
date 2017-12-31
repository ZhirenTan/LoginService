<%-- 
    Document   : Main
    Created on : 2017-12-22, 17:22:48
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
<style type="text/css">
        * {
            box-sizing: border-box;
        }
        body{height: 100%;width: 100%;margin:0;padding:0;}
        body{
            background-image:url(bg.jpg);
        width:100%;
        height:100%;
        position:absolute;
       
            }
        .wrap {
            width: 100%;
            height: 400px;
            padding: 40px 0;
            position: fixed;
            top: 40%;
            margin-top: -200px;
            opacity: 0.8;
        }
        .container {
            width: 60%;
            margin: 0 auto;
        }
        .container h1 {
            text-align: center;
            color: #FFFFFF;
            font: microsft yahei;
            font-weight: 500;
        }
        .container input {
            width: 320px;
            display: block;
            height: 36px;
            border: 0;
            outline: 0;
            padding: 6px 10px;
            line-height: 24px;
            margin: 32px auto;
            -webkit-transition: all 0s ease-in 0.1ms;
            -moz-transition: all 0s ease-in 0.1ms;
            transition: all 0s ease-in 0.1ms;
        }
        .container input[type="text"] , .container input[type="password"]  {
            background-color: #FFFFFF;
            font-size: 16px;
            color: #50a3a2;
        }
        .container input[type='submit'] 
        {
            font-size: 16px;
            letter-spacing: 2px;
            color: #666666;
            background-color: #FFFFFF;
        }
        .container input[type='reset'] {
            font-size: 16px;
            letter-spacing: 2px;
            color: #666666;
            background-color: #FFFFFF;
        }
        .container input:focus {
            width: 400px;
        }
        .container input[type='submit']:hover {
            cursor: pointer;
            width: 400px;
        }
        .container input[type='reset']:hover {
            cursor: pointer;
            width: 400px;
        }

        
        @keyframes square {
            0%  {
                    -webkit-transform: translateY(0);
                    transform: translateY(0)
                }
            100% {
                    bottom: 400px;
                    transform: rotate(600deg);
                    -webit-transform: rotate(600deg);
                    -webkit-transform: translateY(-500);
                    transform: translateY(-500)
            }
        }
        @-webkit-keyframes square {
            0%  {
                -webkit-transform: translateY(0);
                transform: translateY(0)
            }
            100% {
                bottom: 400px;
                transform: rotate(600deg);
                -webit-transform: rotate(600deg);
                -webkit-transform: translateY(-500);
                transform: translateY(-500)
            }
        }
    </style>
    <body style="background: url(bg.jpg)">
        <div class="wrap">
        <div class="container">
            <h1><font face="verdana" color="white">Hey！Welcome.</font></h1>
            <br>
                <input type="submit" name="login" value="Login" onclick="window.location.href='\Login.html'">
                <input type="submit" name="Register" value="Register" onclick="window.location.href='\Register.html'">
        </div>
    </div>
    </body>
</html>
