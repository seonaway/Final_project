package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.ComplainDAO;
import com.style.dto.ComplainDTO;

public class ComplainWriteAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		ComplainDTO cDto = new ComplainDTO();
		
		cDto.setComp_kind(request.getParameter("comp_kind"));
		cDto.setId(request.getParameter("id"));
		cDto.setName(request.getParameter("name"));
		cDto.setTitle(request.getParameter("title"));
		cDto.setContent(request.getParameter("content"));
		
		ComplainDAO cDao = ComplainDAO.getInstance();
		cDao.insertComplain(cDto);
		
		new ComplainListAction().execute(request, response);
	}
}
