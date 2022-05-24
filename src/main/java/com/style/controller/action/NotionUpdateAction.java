package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;
import com.style.dto.NotionVO;

public class NotionUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
