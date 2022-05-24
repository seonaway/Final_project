package com.style.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;
import com.style.dto.NotionVO;

public class NotionUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/views/notion/notionUpdate.jsp";

		String nno = request.getParameter("nno");

		NotionDAO nDao = NotionDAO.getInstance();

		nDao.updateReadCount(nno);

		NotionVO nVo = nDao.selectOneNotionByNno(nno);

		request.setAttribute("notion", nVo);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}