package com.fengfan.util;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.fengfan.model.Toll;
import com.fengfan.service.ICustomerService;
import com.fengfan.service.ITollService;

public class QuartzJob extends QuartzJobBean {
	
	private ICustomerService customerService;
	private ITollService tollService;
	private JdbcTemplate jdbcTemplate;
	public static final String updateCustomerSql =
        "update customer set availableDuration = ? where providerId = ? and dueDate < now()";

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public ITollService getTollService() {
		return tollService;
	}

	public void setTollService(ITollService tollService) {
		this.tollService = tollService;
	}

	public ICustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	private final Log logger = LogFactory.getLog(QuartzJob.class);

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		List<Toll> lstToll = tollService.searchByBillingType3();
		for(Toll toll : lstToll){
			Integer durationAmount = toll.getDurationAmount();
			String providerId = toll.getProviderId();
			getJdbcTemplate().update(updateCustomerSql, durationAmount, providerId);
		}

	}
}
