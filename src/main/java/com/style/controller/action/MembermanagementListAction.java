package com.style.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MembermanagementDAO;
import com.style.dto.MembermanagementDTO;

public class MembermanagementListAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String url = "views/membermanagement/MembermanagementList.jsp";
		
		MembermanagementDAO mDao = MembermanagementDAO.getInstance();
		
		List<MembermanagementDTO> membermanagementList = mDao.selectAllMembermanagements();
		
		request.setAttribute("membermanagementList", membermanagementList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
