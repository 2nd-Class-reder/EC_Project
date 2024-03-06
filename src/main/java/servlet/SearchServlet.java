package servlet;

import java.io.IOException;

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

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String p_name = request.getParameter("p_name");
		String[] p_categorys = request.getParameterValues("p_category");
		
		SearchBean sb;
		RequestDispatcher rd;
		if(!(p_name.equals(null))) { //p_nameに値が入っていたらtrue
			sb = new SearchBean(p_name);
			request.setAttribute("sb", sb);
			rd = request.getRequestDispatcher("/WEB-INF/jsp/productSearchResult.jsp");
		} else {
			sb = new SearchBean(p_categorys);
			request.setAttribute("sb", sb);
			rd = request.getRequestDispatcher("/WEB-INF/jsp/productCategoryResult.jsp");
		}
		
		rd.forward(request, response);
		
		
	}

}
