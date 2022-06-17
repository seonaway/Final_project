package com.style.controller;

import com.style.controller.action.Action;
import com.style.controller.action.ComplainDeleteAction;
import com.style.controller.action.ComplainListAction;
import com.style.controller.action.ComplainUpdateAction;
import com.style.controller.action.ComplainUpdateFormAction;
import com.style.controller.action.ComplainViewAction;
import com.style.controller.action.ComplainWriteAction;
import com.style.controller.action.ComplainWriteFormAction;
import com.style.controller.action.MembermanagementDeleteAction;
import com.style.controller.action.MembermanagementJoinAction;
import com.style.controller.action.MembermanagementJoinFormAction;
import com.style.controller.action.MembermanagementListAction;
import com.style.controller.action.MembermanagementLoginAction;
import com.style.controller.action.MembermanagementLoginFormAction;
import com.style.controller.action.MembermanagementUpdateAction;
import com.style.controller.action.MembermanagementUpdateFormAction;
import com.style.controller.action.MembermanagementViewAction;
import com.style.controller.action.NotionCheckPassAction;
import com.style.controller.action.NotionCheckPassFormAction;
import com.style.controller.action.NotionDeleteAction;
import com.style.controller.action.NotionListAction;
import com.style.controller.action.NotionUpdateAction;
import com.style.controller.action.NotionUpdateFormAction;
import com.style.controller.action.NotionViewAction;
import com.style.controller.action.NotionWriteAction;
import com.style.controller.action.NotionWriteFormAction;
import com.style.controller.action.ProductListAction;
import com.style.controller.action.ProductListAction2;
import com.style.controller.action.ProductWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);

		// notionlist 결과값을 얻어오는 명령 처리 클래스
		if (command.equals("notion_list")) {
			action = new NotionListAction();

		} else if (command.equals("notion_write_form")) {
			action = new NotionWriteFormAction();

		} else if (command.equals("notion_write")) {
			action = new NotionWriteAction();

		} else if (command.equals("notion_view")) {
			action = new NotionViewAction();

		} else if (command.equals("notion_check_pass_form")) {
			action = new NotionCheckPassFormAction();

		} else if (command.equals("notion_check_pass")) {
			action = new NotionCheckPassAction();

		} else if (command.equals("notion_update_form")) {
			action = new NotionUpdateFormAction();

		} else if (command.equals("notion_update")) {
			action = new NotionUpdateAction();

		} else if (command.equals("notion_delete")) {
			action = new NotionDeleteAction();

		} else if (command.equals("product_list")) {
			action = new ProductListAction();

		} else if (command.equals("product_list2")) {
			action = new ProductListAction2();

		} else if (command.equals("product_write_form")) {
			action = new ProductWriteFormAction();

		} else if (command.equals("complain_list")) {
			action = new ComplainListAction();
			
		} else if (command.equals("complain_write_form")) {
			action = new ComplainWriteFormAction();
			
		} else if (command.equals("complain_write")) {
			action = new ComplainWriteAction();
			
		} else if (command.equals("complain_view")) {
			action = new ComplainViewAction();
			
		} else if (command.equals("complain_update_form")) {
			action = new ComplainUpdateFormAction();
			
		} else if (command.equals("complain_update")) {
			action = new ComplainUpdateAction();
			
		} else if (command.equals("complain_delete")) {
			action = new ComplainDeleteAction();
			
		} else if (command.equals("membermanagement_list")) {
			action = new MembermanagementListAction();
			
		} else if (command.equals("membermanagement_view")) {
			action = new MembermanagementViewAction();
			
		} else if (command.equals("membermanagement_update_form")) {
			action = new MembermanagementUpdateFormAction();
			
		} else if (command.equals("membermanagement_update")) {
			action = new MembermanagementUpdateAction();
			
		} else if (command.equals("membermanagement_delete")) {
			action = new MembermanagementDeleteAction();
			
		} else if (command.equals("membermanagement_join_form")) {
			action = new MembermanagementJoinFormAction();
			
		} else if (command.equals("membermanagement_join")) {
			action = new MembermanagementJoinAction();
			
		} else if (command.equals("membermanagement_login_form")) {
			action = new MembermanagementLoginFormAction();
			
		} else if (command.equals("membermanagement_login")) {
			action = new MembermanagementLoginAction();
			
		}

		return action;
	}
}
