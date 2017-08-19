package com.fengfan.action.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.GroupAttr;
import com.fengfan.model.Provider;
import com.fengfan.service.ICustGroupService;
import com.fengfan.service.ISearchService;

public class CustGroupAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(CustGroupAction.class);
	private CustGroup custGroup;
	private CustGroupSearchCondition searchCondition = new CustGroupSearchCondition();

	protected ICustGroupService custGroupService;
	protected List<GroupAttr> custAttributes = new ArrayList<GroupAttr>();

	public void setCustGroupService(ICustGroupService custGroupService) {
		this.custGroupService = custGroupService;
	}

	public ICustGroupService getCustGroupService() {
		return custGroupService;
	}
	
	public CustGroup getCustGroup() {
		return custGroup;
	}

	public List<GroupAttr> getCustAttributes() {
		return custAttributes;
	}

	public void setCustAttributes(List<GroupAttr> custAttributes) {
		this.custAttributes = custAttributes;
	}

	public void setCustGroup(CustGroup custGroup) {
		this.custGroup = custGroup;
	}

	public String list() throws Exception{
		search();
		return "list";
	}

	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			if(null == custGroupService.addCustGroup(custGroup, this.custAttributes)){
				this.addFieldError("custGroup.id", "用户组编号必须唯一");
				return "input";
			}
			systemLogAdd(custGroup.getClass(), custGroup.getId());
			return "redirect";
		}else{
			return "add";
		}
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.custGroup = custGroupService.getCustGroup(id);
		return "view";
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String update() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(ActionUtils.isPostMethod()){
			CustGroup entity = custGroupService.getCustGroup(id);
			ActionUtils.CopyFormDataToEntity(custGroup, entity, "custGroup.");
			ActionUtils.clearNullEntity(custAttributes);
			if(!custGroupService.editCustGroup(entity, this.custAttributes)){
				this.addFieldError("custGroup.id", "用户组编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), entity.getId());
			return "redirect";
		}else{
			this.custGroup = custGroupService.getCustGroup(id);
			this.custAttributes.addAll(custGroup.getCustAttributes());
			Collections.sort(this.custAttributes, new Comparator<GroupAttr>(){
				@Override
				public int compare(GroupAttr o1, GroupAttr o2) {
					Integer id1 = o1.getId();
					Integer id2 = o2.getId();
					return id1 == null ? -1 : (id2 == null ? 1 : id1 - id2);
				}
			});
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			custGroupService.removeCustGroup(new String[]{id});
			systemLogDelete(CustGroup.class, id);
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return custGroupService;
	}

	@Override
	public CustGroupSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(CustGroupSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
