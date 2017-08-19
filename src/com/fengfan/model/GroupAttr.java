package com.fengfan.model;

import com.fengfan.model.base.BaseGroupAttr;



public class GroupAttr extends BaseGroupAttr {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public GroupAttr () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public GroupAttr (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public GroupAttr (
		java.lang.Integer id,
		java.lang.String attrName) {

		super (
			id,
			attrName);
	}

/*[CONSTRUCTOR MARKER END]*/

	 

}