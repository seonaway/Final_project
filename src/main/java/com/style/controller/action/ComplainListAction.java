package com.style.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ComplainDAO;
import com.style.dto.ComplainDTO;

public class ComplainListAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String url = "views/complain/ComplainList.jsp";
		
		ComplainDAO cDao = ComplainDAO.getInstance();
		
		List<ComplainDTO> complainList = cDao.selectAllComplains();
		
		request.setAttribute("complainList", complainList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
