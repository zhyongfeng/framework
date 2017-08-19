/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Customer;
import com.fengfan.model.Lot;
import com.fengfan.model.dao.LotDAO;
import com.fengfan.model.dao.iface.CustomerDAO;
import com.fengfan.service.ILotService;
import com.fengfan.util.RandomUtils;

public class LotServiceImpl implements ILotService {
	private LotDAO lotDAO;
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public LotDAO getLotDAO() {
		return lotDAO;
	}

	public void setLotDAO(LotDAO dao) {
		this.lotDAO = dao;
	}

	@Override
	public Integer addLot(Lot lot) {
		return lotDAO.save(lot);
	}

	public void addCustomerByLot(Lot lot) {
		try {
			for (int i = 0; i < lot.getAmount(); i++) {
				Customer customer = new Customer();
				customer.setAvailableDuration(lot.getDuration());
				customer.setDueDate(lot.getExpDate());
				customer.setBillingType("4");
				customer.setBindingType("4");
				customer.setId(lot.getId() + RandomUtils.getRandom(4));
				customer.setLoginName(customer.getId());
				customer.setLotId(lot.getId());
				customer.setPassword(RandomUtils.getRandom(8));
				customer.setProviderId(lot.getProviderId());
				customer.setStatus(1);
				customerDAO.save(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean editLot(Lot provider) {
		lotDAO.update(provider);
		return true;
	}

	@Override
	public boolean removeLot(Integer[] idset) {
		for (Integer id : idset) {
			lotDAO.delete(id);
		}
		return true;
	}

	@Override
	public Lot getLot(Integer id) {
		return lotDAO.get(id);
	}

	@Override
	public Result<Lot> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return lotDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public List<Lot> listLot() {
		return lotDAO.findAll();
	}
}
