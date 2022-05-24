//NotionServlet? command=notion_list 요청시 게시글 리스트 화면을 표시하기 위한 액션 클래스(모델)
package com.style.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ProductDAO;
import com.style.dto.ProductVO;

public class ProductListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "views/product/productList.jsp";

		ProductDAO nDao = ProductDAO.getInstance();

		List<ProductVO> productList = nDao.selectAllProducts();

		request.setAttribute("productList", productList);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
