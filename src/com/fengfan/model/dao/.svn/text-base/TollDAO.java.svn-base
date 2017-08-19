package com.fengfan.model.dao;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.toll.TollSearchCondition;
import com.fengfan.common.result.Page;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Lot;
import com.fengfan.model.PayRecord;
import com.fengfan.model.Toll;
import com.fengfan.model.base.BaseTollDAO;
import com.fengfan.model.enums.BillingType;

public class TollDAO extends BaseTollDAO implements
		com.fengfan.model.dao.iface.TollDAO {

	public TollDAO() {
	}

	public TollDAO(Session session) {
		super(session);
	}

	public Result<Toll> search(ISearchCondition searchEntity, int pageSize,
			int currentPage) {
		Criteria criteria = getSession().createCriteria(Toll.class);

		if (searchEntity != null) {
			TollSearchCondition condition = (TollSearchCondition) searchEntity;
			
			if(null != condition.getProviderId()){
				criteria.add( Restrictions.eq(Toll.PROP_PROVIDER_ID, condition.getProviderId()));
			}
			
			if (StringUtils.isNotEmpty(condition.getId())) {
				criteria.add(Restrictions.like(Toll.PROP_ID, "%" + condition.getId()
						+ "%"));
			}
			if (StringUtils.isNotEmpty(condition.getTollName())) {
				criteria.add(Restrictions.like(Toll.PROP_TOLL_NAME, "%" + condition.getTollName()
						+ "%"));
			}
			if (null != condition.getBillingType()) {
				criteria.add(Restrictions.eq(Toll.PROP_BILLING_TYPE, condition.getBillingType()));
			}
			if (condition.getStartDate() != null) {
				criteria.add(Restrictions.gt(Toll.PROP_START_DATE,
						condition.getStartDate()));
			}
			if (condition.getEndDate() != null) {
				criteria.add(Restrictions.lt(Toll.PROP_END_DATE,
						condition.getEndDate()));
			}
		}

		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

	public List<Toll> searchByBillingType3() {
		Criteria criteria = getSession().createCriteria(Toll.class);

		criteria.add(Restrictions.eq(Toll.PROP_BILLING_TYPE, 3));

		List<Toll> list = criteria.list();

		return list;
	}

}