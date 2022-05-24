package com.style.controller;

import com.style.controller.action.Action;
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

		}

		return action;
	}
}
