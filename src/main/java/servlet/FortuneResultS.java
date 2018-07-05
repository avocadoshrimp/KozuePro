package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Kozu;

/**
 * Servlet implementation class FortuneResultS
 */
@WebServlet("/FortuneResultS")
public class FortuneResultS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FortuneResultS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);


        String season = request.getParameter("season");
        String cupidity = request.getParameter("cupidity");
        String want = request.getParameter("want");
        String recommend = "";
        
        //String errorMsg = "";
        if(want.equals("woman")) {
        if(season.equals("spring")){
            if(cupidity.equals("money")){
                recommend = "吉野家：牛丼(並) 380円(税込)";
            }
            else if(cupidity.equals("time")){
                recommend = "スターバックス：抹茶フラペチーノ(venty) 550円(税込)";
            }
            else if(cupidity.equals("lover")){
                recommend = "鎌倉パスタ：殻付きハマグリのバンゴレビアンコ　1190円(税抜)";
            }
            else{
                recommend = "リンガーハット：長崎ちゃんぽん　626円(税込)";
            }
        }
        else if(season.equals("summer")){
            if(cupidity.equals("money")){
                recommend = "餃子の王将：キムチチャーハン　500円(税抜)";
            }
            else if(cupidity.equals("time")){
                recommend = "スパイス王国：ゴーシト・マクン・パラク　??円";
            }
            else if(cupidity.equals("lover")){
                recommend = "ラケル：チキンライスのオムライス　880円(税抜)";
            }
            else{
                recommend = "マクドナルド：ビッグマック　390円(税込)";
            }
        }
        else if(season.equals("autumn")){
            if(cupidity.equals("money")){
                recommend = "しゃぶしゃぶ温野菜：アンデス高原豚と厳選牛　2980円(税込)";
            }
            else if(cupidity.equals("time")){
                recommend = "コメダ珈琲：ハムトースト　610円(税込)";
            }
            else if(cupidity.equals("lover")){
                recommend = "BAQET：ミートソースのパスタグラタン　??円";
            }
            else{
                recommend = "カプリチョーザ：マルゲリータ　1,130円(税抜)";
            }
        }
        else{
            if(cupidity.equals("money")){
                recommend = "丸源：肉そば　650円(税抜)";
            }
            else if(cupidity.equals("time")){
                recommend = "道頓堀：チーズマカロニもんじゃ　??円";
            }
            else if(cupidity.equals("lover")){
                recommend = "とんかつ和幸：ヒレカツご飯　1,313円(税込)";
            }
            else{
                recommend = "梅の花：嶺岡豆腐　240円(税込)";
            }
        }
        }
        else {

            if(season.equals("spring")){
                if(cupidity.equals("money")){
                    recommend = "吉野家：牛丼(並) 380円(税込)";
                }
                else if(cupidity.equals("time")){
                    recommend = "スターバックス：アイスティー 290円";
                }
                else if(cupidity.equals("lover")){
                    recommend = "はなまるうどん：塩豚おろしぶっかけ中　550円";
                }
                else{
                    recommend = "PRONTO：ココアM　330円";
                }
            }
            else if(season.equals("summer")){
                if(cupidity.equals("money")){
                    recommend = "鎌倉パスタ：ハチミツピザ　380円";
                }
                else if(cupidity.equals("time")){
                    recommend = "くら寿司：えび　100円";
                }
                else if(cupidity.equals("lover")){
                    recommend = "ガスト：チーズインハンバーグ　590円";
                }
                else{
                    recommend = "モスバーガー：ストロベリーシェイクS　250円";
                }
            }
            else if(season.equals("autumn")){
                if(cupidity.equals("money")){
                    recommend = "銀だこ：ねぎだこ　680円";
                }
                else if(cupidity.equals("time")){
                    recommend = "ミスタードーナツ：エンゼルフレンチ　140円";
                }
                else if(cupidity.equals("lover")){
                    recommend = "叙々苑：壷漬カルビ焼　3,300円";
                }
                else{
                    recommend = "いきなりステーキ：リブロースステーキ400g　2,760円";
                }
            }
            else{
                if(cupidity.equals("money")){
                    recommend = "のらや：ぶっかけうどん　580円";
                }
                else if(cupidity.equals("time")){
                    recommend = "ドリアン：バナナチョコレート　550円";
                }
                else if(cupidity.equals("lover")){
                    recommend = "ムタヒロ：ワハハ煮干そば　750円";
                }
                else{
                    recommend = "北口カフェ：ミルクレープ　580円";
                }
            }
        }
        //String msg1 = "今日は"+recommend+"を食べるといいでしょう！";
        //System.out.println(recommend);
        //登録するユーザーの情報を設定
        Kozu registerUser = new Kozu(recommend);
        //Kozu registerUser = new Kozu(msg1);
        //セッションスコープに登録ユーザーを保存
        HttpSession session = request.getSession();
        session.setAttribute("registerUser", registerUser);
        
        //フォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/resultkozu.jsp");
        dispatcher.forward(request,response);
        //processRequest(request, response);
	}

}
