package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.settlerecord.SettleRecordSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.SettleRecord;
import com.fengfan.model.base.BaseSettleRecordDAO;


public class SettleRecordDAO extends BaseSettleRecordDAO implements com.fengfan.model.dao.iface.SettleRecordDAO {

	public SettleRecordDAO () {}
	
	public SettleRecordDAO (Session session) {
		super(session);
	}

	public Result<SettleRecord> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(SettleRecord.class);
		
		if(searchEntity != null){
			SettleRecordSearchCondition condition = (SettleRecordSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.like(SettleRecord.PROP_PROVIDER_ID, "%" + condition.getProviderId() + "%") );
			}
			if(condition.getStartDate() != null){
				criteria.add(Restrictions.gt(SettleRecord.PROP_SETTLE_DATE, condition.getStartDate()));
			}
			if(condition.getEndDate() != null){
				criteria.add(Restrictions.lt(SettleRecord.PROP_SETTLE_DATE, condition.getEndDate()));
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}