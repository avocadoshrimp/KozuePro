<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <body>
             <div style="position: relative">
                 <img src="dish4.png"
                 height="auto" width="100%" border="0" alt="背景" >
                 <form action="/FortuneResultS" method="POST">
                     <center>
                         <span style="font-size:15pt; font-family:富士ポップ;
                               font-weight:bold; color:BLACK;
                               position:absolute; top:40px; left: 200px; width: 500px;">
                             うらない<br><br></span></center>
                     <center>
                         <span style="font-size:12pt; font-family:富士ポップ;
                               font-weight:bold; color:BLACK;
                               position:absolute; top:70px; left:200px; width: 500px;">
                    <!-- 最寄駅：
                        <input type="text" name="station"><br><br></span>
                    ジャンル：
                        <select name = "genre">
                            <option value = "和食">和食(寿司、ラーメン、粉物、日本料理など)</option>
                            <option value = "中華">中華</option>
                            <option value = "イタリアン">イタリアン</option>
                            <option value = "肉料理">肉料理</option>
                            <option value = "居酒屋">居酒屋</option>
                            <option value = "カフェ">カフェ</option>
                            <option value = "その他">その他</option>
                        </select><br><br><br><br>
                        <input type="submit" value="検索"><br><br><br>

                        <a href ="/ReturnServlet">【戻る】</a></center> -->

                        あなたが生まれたのは？：<br><br>
                        <!-- コンボボックス -->
<!--                        <select name = "seasons">
                        <option value = "spring">春 spring</option>
                        <option value = "summer">夏 summer</option>
                        <option value = "autumn">秋 autumn</option>
                        <option value = "winter">冬 winter</option>
                        </select><br><br>-->
                        <!-- ラジオボタン
-->                     <input type = "radio" name = "season" value = "spring" checked = "checked">春 spring
                        <input type = "radio" name = "season" value = "summer">夏 summer
                        <input type = "radio" name = "season" value = "autumn">秋 autumn
                        <input type = "radio" name = "season" value = "winter">冬 winter<br><br><br>

                        あなたが今欲しいのは？：<br><br>
                        <!-- コンボボックス -->
<!--                        <select name = "cupidity">
                        <option value = "money">お金 money</option>
                        <option value = "time">時間 time</option>
                        <option value = "lover">恋人 lover</option>
                        <option value = "other">その他 other</option>
                        </select><br><br>-->
                        <!--ラジオボタン-->                        
                        <input type = "radio" name = "cupidity" value = "money" checked = "checked">お金 money
                        <input type = "radio" name = "cupidity" value = "time">時間 time
                        <input type = "radio" name = "cupidity" value = "lover">恋人
                        <input type = "radio" name = "cupidity" value = "other">その他 other<br><br><br> 
                        
                        貴方が将来なりたいのは？<br><br>
                        <input type = "radio" name = "want" value = "woman" checked = "checked">女性 woman
                        <input type = "radio" name = "want" value = "man">男性 man<br><br><br> 
                        <input type="submit" value="うらなう"><br><br><br>
                        <a href ="/WelcomeServlet">【戻る】</a>
                        </span>
                     </center>
                 </form>
             </div>
         </body>
    </body>
</html>
