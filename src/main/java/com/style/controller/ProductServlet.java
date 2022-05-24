package com.style.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.style.controller.action.Action;

/** MVC패턴의 Controller 역할 **/

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getParameter("command");
		System.out.println("ProductServlet에서 요청을 받음을 확인 : " + command);

		if (command == null) {
			// request.setCharacterEncoding("UTF-8");
			String savePath = request.getSession().getServletContext().getRealPath("upload");

			ServletContext context = getServletContext();
			int sizeLimit = 10 * 1024 * 1024; // 10메가입니다.

			String uploadFilePath = context.getRealPath(savePath);
			System.out.println("서버상의 실제 디렉토리 : ");
			System.out.println(uploadFilePath);
			System.out.println(request);
			System.out.println(sizeLimit);
			System.out.println(savePath);

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8",
					new DefaultFileRenamePolicy());

			// 파일이 업로드될 실제 tomcat 폴더의 WebContent 기준
			try {
				command = multi.getParameter("command");

			} catch (Exception e) {

				e.printStackTrace();

			}

			ActionFactory af = ActionFactory.getInstance();
			Action action = af.getAction(command);

			if (action != null) {
				action.execute(request, response);
			}

		}
		ActionFactory af = ActionFactory.getInstance();
		Action action = af.getAction(command);

		if (action != null) {
			action.execute(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
}