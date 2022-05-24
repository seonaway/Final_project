package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;

public class NotionDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nno = request.getParameter("nno");

		NotionDAO nDao = NotionDAO.getInstance();
		nDao.deleteNotion(nno);

		new NotionListAction().execute(request, response);
	}

}
