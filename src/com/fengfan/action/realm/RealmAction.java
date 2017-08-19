package com.fengfan.action.realm;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Provider;
import com.fengfan.model.Realm;
import com.fengfan.model.enums.YesNoRadio;
import com.fengfan.service.IRealmService;
import com.fengfan.service.ISearchService;

public class RealmAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(RealmAction.class);
	private Realm realm;
	private RealmSearchCondition searchCondition = new RealmSearchCondition();
	private YesNoRadio[] yesNoTypes = YesNoRadio.values();
	protected IRealmService realmService;

	public void setRealmService(IRealmService realmService) {
		this.realmService = realmService;
	}

	public IRealmService getRealmService() {
		return realmService;
	}
	
	public Realm getRealm() {
		return realm;
	}

	

	public YesNoRadio[] getYesNoTypes() {
		return yesNoTypes;
	}

	public void setRealm(Realm realm) {
		this.realm = realm;
	}

	public String list() throws Exception{
		search();
		return "list";
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.realm = realmService.getRealm(Integer.parseInt(id));
		return "view";
	}

	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			if(null == realmService.addRealm(realm)){
				this.addFieldError("realm.id", "网关设备类型编号必须唯一");
				return "input";
			}
			systemLogAdd(realm.getClass(), ""+realm.getId());
			return "redirect";
		}else{
			return "add";
		}
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String update() throws Exception{
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		if(ActionUtils.isPostMethod()){
			Realm entity = realmService.getRealm(id);
			ActionUtils.CopyFormDataToEntity(realm, entity, "realm.");
			if(!realmService.editRealm(entity)){
				this.addFieldError("realm.id", "网关设备类型编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), ""+entity.getId());
			return "redirect";
		}else{
			this.realm = realmService.getRealm(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			realmService.removeRealm(new int[]{Integer.parseInt(id)});
			systemLogDelete(Realm.class, id);
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return realmService;
	}

	@Override
	public RealmSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(RealmSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
