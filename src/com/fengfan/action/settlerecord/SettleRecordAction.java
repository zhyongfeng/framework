package com.fengfan.action.settlerecord;


import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.action.toll.TollAction;
import com.fengfan.model.SettleRecord;
import com.fengfan.model.enums.PayType;
import com.fengfan.model.enums.YesNoRadio;
import com.fengfan.service.IPayRecordService;
import com.fengfan.service.ISearchService;
import com.fengfan.service.ISettleRecordService;

public class SettleRecordAction extends BaseAction {

	public static final Logger logger = Logger.getLogger(TollAction.class);
	private SettleRecord settleRecord;
	private YesNoRadio[] yesNoRadio = YesNoRadio.values();
	private PayType[] payType = PayType.values();
	protected ISettleRecordService settleRecordService;
	protected IPayRecordService payRecordService;
	
	
	public IPayRecordService getPayRecordService() {
		return payRecordService;
	}
	public void setPayRecordService(IPayRecordService payRecordService) {
		this.payRecordService = payRecordService;
	}
	public YesNoRadio[] getYesNoRadio() {
		return yesNoRadio;
	}
	public PayType[] getPayType() {
		return payType;
	}
	public SettleRecord getSettleRecord() {
		return settleRecord;
	}

	public void setSettleRecord(SettleRecord settleRecord) {
		this.settleRecord = settleRecord;
	}

	private SettleRecordSearchCondition searchCondition = new SettleRecordSearchCondition();
	
	public SettleRecordSearchCondition getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(SettleRecordSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}

	public ISettleRecordService getSettleRecordService() {
		return settleRecordService;
	}

	public void setSettleRecordService(ISettleRecordService settleRecordService) {
		this.settleRecordService = settleRecordService;
	}

	@Override
	public ISearchService getSearchService() {
		return settleRecordService;
	}

	public String list() throws Exception{
		search();
		return "list";
	}
	
	private void handleAutoInputFields(){
		String currentProviderId = this.getCurrentProviderId();
		if(!StringUtils.isEmpty(currentProviderId)){
			settleRecord.setProviderId(currentProviderId);
		}
		settleRecord.setSettleDate(new Date());
		double totalFee = settleRecord.getTotalFee();
		double marketFee = settleRecord.getMarketFee();
		double manageFee = settleRecord.getMgtFee();
		settleRecord.setActualFee(totalFee - marketFee - manageFee);
		settleRecord.setTotalFee(totalFee);
		settleRecord.setMarketFee(marketFee);
		settleRecord.setMgtFee(manageFee);
	}

	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			handleAutoInputFields();
			if(null == settleRecordService.addSettleRecord(settleRecord)){
				getProviders();
				this.addFieldError("settleRecord.id", "结算记录编号必须唯一");
				return "input";
			}
			
			//deal with payRecord
			payRecordService.batchUpdatePayRecord(settleRecord.getProviderId(),settleRecord.getStartDate(),settleRecord.getEndDate());
			
			systemLogAdd(settleRecord.getClass(), ""+settleRecord.getId(),settleRecord.getProviderId());
			return "redirect";
		}else{
			getProviders();
			return "add";
		}
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String update() throws Exception{
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		if(ActionUtils.isPostMethod()){
			SettleRecord entity = settleRecordService.getSettleRecord(id);
			ActionUtils.CopyFormDataToEntity(settleRecord, entity, "settleRecord.");
			if(!settleRecordService.editSettleRecord(entity)){
				this.addFieldError("settleRecord.id", "结算记录编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), ""+entity.getId(),entity.getProviderId());
			return "redirect";
		}else{
			this.settleRecord = settleRecordService.getSettleRecord(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			SettleRecord entity = settleRecordService.getSettleRecord(Integer.parseInt(id));
			settleRecordService.removeSettleRecord(new Integer[]{Integer.parseInt(id)});
			systemLogDelete(SettleRecord.class, id,entity.getProviderId());
		}
		return list();
	}
}
