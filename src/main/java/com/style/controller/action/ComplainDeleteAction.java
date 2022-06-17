package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ComplainDAO;

public class ComplainDeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");

		ComplainDAO cDao = ComplainDAO.getInstance();
		cDao.deleteComplain(num);

		new ComplainListAction().execute(request, response);
	}

}
