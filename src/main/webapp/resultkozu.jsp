
<%@page import="model.Kozu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Kozu registerUser = (Kozu)session.getAttribute("registerUser");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="position: relative">
                 <img src="dish4.png"
                 height="auto" width="100%" border="0" alt="背景" >
                 <div style="position: absolute; top:40px; left:430px;">
                     <img
                    src="search.png"  border="0"
                    alt="search"></div>
                 <!-- <form action="/FortuneResultS" method="POST"> -->
                     <center>
                         <span style="font-size:15pt; font-family:富士ポップ;
                               font-weight:bold; color:BLACK;
                               position:absolute; top:40px; left: 260px; width: 500px;">
                             うらない<br><br></span></center>
                     <center>
                         <span style="font-size:12pt; font-family:富士ポップ;
                               font-weight:bold; color:BLACK;
                               position:absolute; top:80px; left:260px; width: 500px;">
                             <p>あなたへのおすすめは</p>
                             <h1>　<%= registerUser.getRecommend() %></h1><br><br><br><br>
                             <a href ="/FortuneTellingS">【戻る】</a>
                         </span>
                     </center>
                <!--  </form> -->
        </div>
    </body>
</html>
