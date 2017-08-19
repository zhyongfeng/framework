/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.CustGroup;
import com.fengfan.model.GroupAttr;
import com.fengfan.model.Provider;
import com.fengfan.model.dao.CustGroupDAO;
import com.fengfan.model.dao.GroupAttrDAO;
import com.fengfan.service.ICustGroupService;

public class CustGroupServiceImpl implements ICustGroupService {
	private CustGroupDAO custGroupDAO;
	private GroupAttrDAO groupAttrDAO;
	
	public CustGroupDAO getCustGroupDAO() {
		return custGroupDAO;
	}

	public void setCustGroupDAO(CustGroupDAO dao) {
		this.custGroupDAO = dao;
	}
	
	public GroupAttrDAO getGroupAttrDAO() {
		return groupAttrDAO;
	}

	public void setGroupAttrDAO(GroupAttrDAO groupAttrDAO) {
		this.groupAttrDAO = groupAttrDAO;
	}

	@Override
	public String addCustGroup(CustGroup custGroup, List<GroupAttr> custAttributes) {
		String id = custGroupDAO.save(custGroup);
		for(GroupAttr ca : custAttributes){
			ca.setGroupId(id);
			if(!StringUtils.isEmpty(ca.getAttrName())){
				groupAttrDAO.save(ca);
			}
		}
		return id;
	}

	@Override
	public boolean editCustGroup(CustGroup custGroup, List<GroupAttr> custAttributes) {
		try{
			
			ArrayList<GroupAttr> attrs = new ArrayList<GroupAttr>();
			attrs.addAll(custGroup.getCustAttributes());
			custGroup.getCustAttributes().clear();
			for(GroupAttr ca : attrs){
				groupAttrDAO.delete(ca.getId());
			}
			for(GroupAttr ca : custAttributes){
				ca.setId(null);
				ca.setGroupId(custGroup.getId());
				groupAttrDAO.save(ca);
			}
			custGroup.getCustAttributes().addAll(custAttributes);
			custGroupDAO.update(custGroup);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean removeCustGroup(String[] idset) {
		for(String id : idset){
			custGroupDAO.delete(id);
		}
		return true;
	}

	@Override
	public boolean isCustGroupNoExists(String custGroupNo) {
		try{
			CustGroup entity = custGroupDAO.get(custGroupNo);
			return entity != null;
		}catch(Exception ex){
			return true;
		}
	}
	
	@Override
	public CustGroup getCustGroup(String id){
		return  custGroupDAO.get(id);
	}

	@Override
	public Result<CustGroup> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return custGroupDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public List<CustGroup> listCustGroup() {
		return custGroupDAO.findAll();
	}

	@Override
	public List<GroupAttr> findCustGroups(String groupId) {
		Criteria criteria = this.groupAttrDAO.getSession().createCriteria(GroupAttr.class);
		criteria.add(Restrictions.eq(GroupAttr.PROP_GROUP_ID, groupId));
		return criteria.list();
	}
}
