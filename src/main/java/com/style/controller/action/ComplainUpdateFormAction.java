package com.style.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ComplainDAO;
import com.style.dto.ComplainDTO;

public class ComplainUpdateFormAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String url = "views/complain/ComplainUpdate.jsp";
		
		String num = request.getParameter("num");
		
		ComplainDAO cDao = ComplainDAO.getInstance();
		
		cDao.updateReadCount(num);
		
		ComplainDTO cDto = cDao.selectOneComplainbyNum(num);
		
		request.setAttribute("complain", cDto);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
