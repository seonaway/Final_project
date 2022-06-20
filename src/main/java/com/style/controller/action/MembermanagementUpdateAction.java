package com.style.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MembermanagementDAO;
import com.style.dto.MembermanagementDTO;

public class MembermanagementUpdateAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		MembermanagementDTO mDto = new MembermanagementDTO();
		
		mDto.setMem_id(request.getParameter("mem_id"));
		mDto.setMem_nick(request.getParameter("mem_nick"));
		mDto.setMem_pwd(request.getParameter("mem_pwd"));
		mDto.setMem_name(request.getParameter("mem_name"));
		mDto.setMem_addr(request.getParameter("mem_addr"));
		mDto.setMem_postnum(request.getParameter("mem_postnum"));
		mDto.setMem_phone(request.getParameter("mem_phone"));
		mDto.setNum(Integer.parseInt(request.getParameter("num")));
		
		MembermanagementDAO mDao = MembermanagementDAO.getInstance();
		mDao.updateMembermanagement(mDto);
		
		new MembermanagementListAction().execute(request, response);
	}

}
