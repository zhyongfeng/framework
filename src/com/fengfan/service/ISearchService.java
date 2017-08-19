package com.fengfan.service;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;

public interface ISearchService {
	Result<?> search(ISearchCondition searchEntity, int pageSize, int currentPage);
}
