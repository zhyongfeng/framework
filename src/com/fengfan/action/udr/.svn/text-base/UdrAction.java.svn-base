package com.fengfan.action.udr;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.action.toll.TollAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Provider;
import com.fengfan.model.Udr;
import com.fengfan.model.enums.UdrType;
import com.fengfan.model.enums.YesNoRadio;
import com.fengfan.service.ISearchService;
import com.fengfan.service.IUdrService;

public class UdrAction extends BaseAction {

	public static final Logger logger = Logger.getLogger(TollAction.class);

	private Udr udr;
	private YesNoRadio[] yesNoRadio = YesNoRadio.values();
	private UdrType[] udrType = UdrType.values();
	protected IUdrService udrService;

	public YesNoRadio[] getYesNoRadio() {
		return yesNoRadio;
	}

	public UdrType[] getUdrType() {
		return udrType;
	}

	public Udr getUdr() {
		return udr;
	}

	public void setUdr(Udr udr) {
		this.udr = udr;
	}

	private UdrSearchCondition searchCondition = new UdrSearchCondition();

	public UdrSearchCondition getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(UdrSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}

	public IUdrService getUdrService() {
		return udrService;
	}

	public void setUdrService(IUdrService udrService) {
		this.udrService = udrService;
	}

	@Override
	public ISearchService getSearchService() {
		return udrService;
	}

	public String list() throws Exception {
		search();
		return "list";
	}

	public String view() throws Exception {
		try {
			String id = ServletActionContext.getRequest().getParameter("id");
			this.udr = udrService.getUdr(Integer.parseInt(id));
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("exception",
					e.getMessage());
			return "exception";
		}
		return "view";
	}

}
