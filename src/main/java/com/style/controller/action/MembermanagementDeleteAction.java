package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MembermanagementDAO;

public class MembermanagementDeleteAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");

		MembermanagementDAO mDao = MembermanagementDAO.getInstance();
		mDao.deleteMembermanagement(num);

		new MembermanagementListAction().execute(request, response);
	}
}
