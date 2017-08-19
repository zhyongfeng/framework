package com.fengfan.model.dao;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.payrecord.PayRecordSearchCondition;
import com.fengfan.common.result.Page;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.PayRecord;
import com.fengfan.model.base.BasePayRecordDAO;

public class PayRecordDAO extends BasePayRecordDAO implements
		com.fengfan.model.dao.iface.PayRecordDAO {

	public PayRecordDAO() {
	}

	public PayRecordDAO(Session session) {
		super(session);
	}

	public Result<PayRecord> search(ISearchCondition searchEntity,
			int pageSize, int currentPage) {
		Criteria criteria = getSession().createCriteria(PayRecord.class);

		if (searchEntity != null) {
			PayRecordSearchCondition condition = (PayRecordSearchCondition) searchEntity;
			if (StringUtils.isNotEmpty(condition.getCustId())) {
				criteria.add(Restrictions.like(PayRecord.PROP_CUST_ID,
						"%" + condition.getCustId() + "%"));
			}
			if (StringUtils.isNotEmpty(condition.getProviderId())) {
				criteria.add(Restrictions.like(PayRecord.PROP_PROVIDER_ID,
						"%" + condition.getProviderId() + "%"));
			}
			if (condition.getStartDate() != null) {
				criteria.add(Restrictions.gt(PayRecord.PROP_PAY_DATE,
						condition.getStartDate()));
			}
			if (condition.getEndDate() != null) {
				criteria.add(Restrictions.lt(PayRecord.PROP_PAY_DATE,
						condition.getEndDate()));
			}
		}
		
		int count = criteria.list().size();

		if ((pageSize > 0) && (currentPage > 0)) {
			criteria.setFirstResult(pageSize * (currentPage - 1));
			criteria.setMaxResults(pageSize);
		}
		List<PayRecord> list = criteria.list();
		Page page = PageUtil.createPage(pageSize, currentPage, count);
		
		Result<PayRecord> result = new Result<PayRecord>(page, list);
		return result;
		//return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
	
	public String getSumofTotalAmount(ISearchCondition searchEntity,int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(PayRecord.class);

		if (searchEntity != null) {
			PayRecordSearchCondition condition = (PayRecordSearchCondition) searchEntity;
			if (StringUtils.isNotEmpty(condition.getCustId())) {
				criteria.add(Restrictions.like(PayRecord.PROP_CUST_ID,
						"%" + condition.getCustId() + "%"));
			}
			if (StringUtils.isNotEmpty(condition.getProviderId())) {
				criteria.add(Restrictions.like(PayRecord.PROP_PROVIDER_ID,
						"%" + condition.getProviderId() + "%"));
			}
			if (condition.getStartDate() != null) {
				criteria.add(Restrictions.gt(PayRecord.PROP_PAY_DATE,
						condition.getStartDate()));
			}
			if (condition.getEndDate() != null) {
				criteria.add(Restrictions.lt(PayRecord.PROP_PAY_DATE,
						condition.getEndDate()));
			}
		}
		double sum = 0.00;
		double sumByPage = 0.00;
		try {
			List<PayRecord> list = criteria.list();
			for(PayRecord payRecord: list){
				sum += payRecord.getTotalAmount();
			}
			
			if ((pageSize > 0) && (currentPage > 0)) {
				criteria.setFirstResult(pageSize * (currentPage - 1));
				criteria.setMaxResults(pageSize);
			}
			List<PayRecord> pageList = criteria.list();
			for(PayRecord payRecord: pageList){
				sumByPage += payRecord.getTotalAmount();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.valueOf(sum) + ":" + String.valueOf(sumByPage);
		
	}
}