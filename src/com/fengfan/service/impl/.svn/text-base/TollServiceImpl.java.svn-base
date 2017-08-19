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
import com.fengfan.model.Toll;
import com.fengfan.model.dao.TollDAO;
import com.fengfan.service.ITollService;

public class TollServiceImpl implements ITollService {
	private TollDAO tollDAO;
	
	public TollDAO getTollDAO() {
		return tollDAO;
	}

	public void setTollDAO(TollDAO dao) {
		this.tollDAO = dao;
	}

	@Override
	public String addToll(Toll provider) {
		return tollDAO.save(provider);
	}

	@Override
	public boolean editToll(Toll provider) {
		tollDAO.update(provider);
		return true;
	}

	@Override
	public boolean removeToll(String[] idset) {
		for(String id : idset){
			tollDAO.delete(id);
		}
		return true;
	}

	@Override
	public Toll getToll(String id){
		return  tollDAO.get(id);
	}

	@Override
	public Result<Toll> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return tollDAO.search(searchCondition, pageSize, currentPage);
	}

	public List<Toll> searchByBillingType3(){
		return tollDAO.searchByBillingType3();
	}
	@Override
	public boolean isTollIdExists(String id) {
		try{
			Toll entity = tollDAO.get(id);
			return entity != null;
		}catch(Exception ex){
			return true;
		}
	}
	public List<Toll> listToll() {
		return tollDAO.findAll();
	}
}
