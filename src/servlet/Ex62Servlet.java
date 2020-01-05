package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex62Servlet
 */
@WebServlet("/Ex62Servlet")
public class Ex62Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ランダムな整数を生成し
		int rand = (int) (Math.random() * 10);

		System.out.println(rand);
		// 奇数ならばリダイレクト、偶数ならばフォワードする
		if (rand % 2 == 1) {
			response.sendRedirect("/example/redirect.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/forward.jsp");
			dispatcher.forward(request, response);
		}


	}

}
