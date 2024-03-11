package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SearchBean;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// hidden属性の取得
		String search_type = request.getParameter("search_type");
		// 各変数の用意
		String p_name = request.getParameter("p_name");

		// <商品名検索の場合>
		if (p_name.isEmpty()) {
			// 検索欄が空欄の場合リダイレクトする処理
			response.sendRedirect("/EC_Project/searchView.jsp");
			return;
		}
		SearchBean sb = new SearchBean(p_name);
		request.setAttribute("sb", sb);
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/jsp/productSearchResult.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// hidden属性の取得
		String search_type = request.getParameter("search_type");
		// 各変数の用意
		List<String> p_categorys = new ArrayList<>();
		String[] p_categorysArray = request.getParameterValues("p_category");

		// <商品分類検索の場合>
		if (p_categorysArray == null) {
			// カテゴリー欄が空欄の場合リダイレクトする
			response.sendRedirect("/EC_Project/searchView.jsp");
			return;
		}
		p_categorys = Arrays.asList(p_categorysArray);
		SearchBean sb = new SearchBean(p_categorys);
		request.setAttribute("sb", sb);
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/jsp/productCategoryResult.jsp");
		rd.forward(request, response);

	}
}
