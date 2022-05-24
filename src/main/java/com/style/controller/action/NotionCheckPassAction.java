package com.style.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.NotionDAO;
import com.style.dto.NotionVO;

public class NotionCheckPassAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;

		String nno = request.getParameter("nno");
		String emp_pw = request.getParameter("emp_pw");

		NotionDAO nDao = NotionDAO.getInstance();
		NotionVO nVo = nDao.selectOneNotionByNno(nno);

		if (nVo.getEmp_pw().equals(emp_pw)) {// 성공
			url = "/views/notion/checkSuccess.jsp";
		} else {// 실패
			url = "/views/notion/notionCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다");

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
