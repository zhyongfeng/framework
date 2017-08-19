package com.fengfan.service;

import java.util.List;

import com.fengfan.model.CustGroup;
import com.fengfan.model.GroupAttr;

public interface ICustGroupService extends ISearchService {
	public List<CustGroup> listCustGroup();
	public boolean isCustGroupNoExists(String no);
	public String addCustGroup(CustGroup custGroup, List<GroupAttr> attributes);
	public CustGroup getCustGroup(String id);
	public boolean editCustGroup(CustGroup custGroup, List<GroupAttr> attributes);
	public boolean removeCustGroup(String[] idset);
	public List<GroupAttr> findCustGroups(String groupId);
}
