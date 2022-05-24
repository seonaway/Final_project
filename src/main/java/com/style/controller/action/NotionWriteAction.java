//공지글을 데이터베이스에 추가하기 위한 액션 클래스
package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;
import com.style.dto.NotionVO;

public class NotionWriteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		NotionVO nVo = new NotionVO();

		nVo.setNtitle(request.getParameter("ntitle"));
		nVo.setEmp_pw(request.getParameter("emp_pw"));
		nVo.setNkinds(request.getParameter("nkinds"));
		nVo.setNcontent(request.getParameter("ncontent"));

		NotionDAO nDao = NotionDAO.getInstance();
		nDao.insertNotion(nVo);

		new NotionListAction().execute(request, response);
	}
}
