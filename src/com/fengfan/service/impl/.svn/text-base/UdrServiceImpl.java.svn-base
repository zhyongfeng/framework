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
import com.fengfan.model.Udr;
import com.fengfan.model.dao.UdrDAO;
import com.fengfan.service.IUdrService;


public class UdrServiceImpl implements IUdrService {
	private UdrDAO udrDAO;

	public UdrDAO getUdrDAO() {
		return udrDAO;
	}

	public void setUdrDAO(UdrDAO udrDAO) {
		this.udrDAO = udrDAO;
	}
	@Override
	public Integer addUdr(Udr udr) {
		return udrDAO.save(udr);
	}

	@Override
	public boolean editUdr(Udr provider) {
		udrDAO.update(provider);
		return true;
	}

	@Override
	public boolean removeUdr(Integer[] idset) {
		for(Integer id : idset){
			udrDAO.delete(id);
		}
		return true;
	}

	@Override
	public Udr getUdr(int id){
		return  udrDAO.get(id);
	}

	@Override
	public Result<Udr> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return udrDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public List<Udr> listUdr() {
		return udrDAO.findAll();
	}

}
