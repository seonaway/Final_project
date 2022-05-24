package com.style.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ProductDAO;
import com.style.dto.ProductVO;

@WebServlet("/productDelete.do")
public class ProductDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/views/product/productDelete.jsp";

		String pnum = request.getParameter("pnum");

		ProductDAO pDao = ProductDAO.getInstance();

		ProductVO pVo = pDao.selectOneProductByPnum(pnum);

		request.setAttribute("product", pVo);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pnum = request.getParameter("pnum");

		ProductDAO pDao = ProductDAO.getInstance();
		pDao.deleteProduct(pnum);

		response.sendRedirect("ProductServlet?command=product_list");
	}

}
