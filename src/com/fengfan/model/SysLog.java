package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseSysLog;
import com.fengfan.model.enums.SysLogType;



public class SysLog extends BaseSysLog {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public SysLog () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public SysLog (java.lang.Integer id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/


	public String getLogTypeAsString(){
		return DicTypeUtils.findByID(SysLogType.values(), this.getLogType()).getName();
	}
}