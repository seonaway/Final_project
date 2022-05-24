package com.style.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.style.dao.ProductDAO;
import com.style.dto.ProductVO;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/productWrite.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("product/productWrite.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		String encType = "UTF-8";
		int sizeLimit = 20 * 1024 * 1024;

		// String savePath =
		// request.getSession().getServletContext().getRealPath("upload");
		// 파일이 업로드될 실제 tomcat 폴더의 WebContent 기준

		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());

		String pname = multi.getParameter("pname");
		String pbrand = multi.getParameter("pbrand");
		int pprice = Integer.parseInt(multi.getParameter("pprice"));
		int pnew_price = Integer.parseInt(multi.getParameter("pnew_price"));
		String pmodel = multi.getParameter("pmodel");
		String pgrade = multi.getParameter("pgrade");
		String pdetail = multi.getParameter("pdetail");
		String pkind = multi.getParameter("pkind");
		int pquantity = Integer.parseInt(multi.getParameter("pquantity"));
		String ppictureUrl = multi.getParameter("ppictureUrl");

		ProductVO pVo = new ProductVO();

		pVo.setPname(pname);
		pVo.setPbrand(pbrand);
		pVo.setPprice(pprice);
		pVo.setPnew_price(pnew_price);
		pVo.setPmodel(pmodel);
		pVo.setPgrade(pgrade);
		pVo.setPdetail(pdetail);
		pVo.setPkind(pkind);
		pVo.setPquantity(pquantity);
		pVo.setPpictureUrl(ppictureUrl);

		ProductDAO pDao = ProductDAO.getInstance();
		pDao.insertProduct(pVo);

		response.sendRedirect("ProductServlet?command=product_list");
		// new ProductListAction().execute(request, response);

	}
}
