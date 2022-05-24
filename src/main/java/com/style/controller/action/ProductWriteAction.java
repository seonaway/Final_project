//product를 데이터베이스에 추가하기 위한 액션 클라스
package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.style.dao.ProductDAO;
import com.style.dto.ProductVO;

public class ProductWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		MultipartRequest multi = null;

		int sizeLimit = 10 * 1024 * 1024; // 10메가입니다.

		String savePath = request.getSession().getServletContext().getRealPath("upload");
		// 파일이 업로드될 실제 tomcat 폴더의 WebContent 기준

		try {

			multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());

		} catch (Exception e) {

			e.printStackTrace();

		}

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

		new ProductListAction().execute(request, response);

	}
}
