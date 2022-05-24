package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;
import com.style.dao.ProductDAO;
import com.style.dto.NotionVO;
import com.style.dto.ProductVO;

public class ProductUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductVO pVo = new ProductVO();
		pVo.setPnum(Integer.parseInt(request.getParameter("pnum")));
		pVo.setPname(request.getParameter("pname"));
		pVo.setPbrand(request.getParameter("pbrand"));
		pVo.setPprice(Integer.parseInt(request.getParameter("pprice")));
		pVo.setPnew_price(Integer.parseInt(request.getParameter("pnew_price")));
		pVo.setPmodel(request.getParameter("pmodel"));
		pVo.setPgrade(request.getParameter("pgrade"));
		pVo.setPdetail(request.getParameter("pdetail"));
		pVo.setPkind(request.getParameter("pkind"));
		pVo.setPquantity(Integer.parseInt(request.getParameter("pquantity")));
		pVo.setPpictureUrl(request.getParameter("ppictureUrl"));

		ProductDAO pDao = ProductDAO.getInstance();
		pDao.updateProduct(pVo);

		NotionVO nVo = new NotionVO();

		nVo.setNno(Integer.parseInt(request.getParameter("nno")));
		nVo.setNtitle(request.getParameter("ntitle"));
		nVo.setNkinds(request.getParameter("nkinds"));
		nVo.setNcontent(request.getParameter("ncontent"));
		nVo.setNcount(request.getParameter("ncount"));
		nVo.setEmp_id(request.getParameter("emp_id"));
		nVo.setEmp_nick(request.getParameter("emp_nick"));
		nVo.setEmp_pw(request.getParameter("emp_pw"));

		NotionDAO nDao = NotionDAO.getInstance();
		nDao.updateNotion(nVo);

		new NotionListAction().execute(request, response);
	}
}
