package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
		String[] p_categorysArray = request.getParameterValues("p_category");
		
		List<String> p_categorys = new ArrayList<>();
		if(p_categorysArray == null) {
			p_categorys.add("0");
		}else {
			p_categorys = Arrays.asList(p_categorysArray);
		}
		
		SearchBean sb;
		RequestDispatcher rd = null;
		//Object.isNull()→引数がNULLの場合True
		if(!(Objects.isNull(p_name))) { //p_nameがnullじゃない時true
			sb = new SearchBean(p_name);
			request.setAttribute("sb", sb);
			rd = request.getRequestDispatcher("/WEB-INF/jsp/productSearchResult.jsp");
		} else if(!(Objects.isNull(p_categorys))) {//p_categorysがnullじゃない時true
			sb = new SearchBean(p_categorys);
			request.setAttribute("sb", sb);
			rd = request.getRequestDispatcher("/WEB-INF/jsp/productCategoryResult.jsp");
		} else {
			response.sendRedirect("/EC_Project/searchView.jsp");
		}
		
		rd.forward(request, response);
		
		
	}

}
