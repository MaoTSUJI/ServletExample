package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストスコープに保存するインスタンス生成
		Human human = new Human("湊祐介", 23);

		// リクエストスコープにインスタンスの生成
		request.setAttribute("human", human);	// 属性を示す

		// リクエストスコープからインスタンスを取得
		Human h = (Human) request.getAttribute("human");	// 引数には属性を指定


		// 運勢をランダムで決定
		String[] luckArray = {"超スッキリ",  "スッキリ", "最悪"};
		// 0以上3未満の整数を乱数で生成
		int index = (int) (Math.random() * 3);
		String luck = luckArray[index];

		// 実行日を取得
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String today = sdf.format(date);

		String name = "辻 真緒";

		// HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + name + "さんの" + today + "の運勢は" + luck + "です</p>");
		out.println("</body>");
		out.println("</html>");

	}


}
