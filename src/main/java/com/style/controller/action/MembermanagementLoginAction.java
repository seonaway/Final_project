package com.style.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MembermanagementDAO;
import com.style.dto.MembermanagementDTO;

public class MembermanagementLoginAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String url = null;
		
		String mem_id = request.getParameter("mem_id");
		String mem_pwd = request.getParameter("mem_pwd");
		
		MembermanagementDAO mDao = MembermanagementDAO.getInstance();
		MembermanagementDTO mDto = mDao.checkLogin(mem_id, mem_pwd);
		request.setAttribute("membermanagement", mDto);

		
		System.out.println("mDto : " + mDto);
		
		if(mDto != null) {
			if(mDto.getMem_usertype().equals("1")){
				url = "views/membermanagement/MembermanagementList.jsp";
			}
			else {
				url = "index.jsp";
			}
		} else {
			url = "views/membermanagement/MembermanagementLogin.jsp";
			request.setAttribute("message", "아이디 또는 비밀번호가 틀렸습니다.");
		}
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
