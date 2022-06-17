package com.style.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MembermanagementDAO;
import com.style.dto.MembermanagementDTO;

public class MembermanagementUpdateFormAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String url = "views/membermanagement/MembermanagementUpdate.jsp";
		
		String num = request.getParameter("num");
		
		MembermanagementDAO mDao = MembermanagementDAO.getInstance();
		
		MembermanagementDTO mDto = mDao.selectOneMembermanagementbyNum(num);
		
		request.setAttribute("membermanagement", mDto);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
