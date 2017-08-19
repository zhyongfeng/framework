package com.fengfan.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.fengfan.model.base.BaseCustGroup;



public class CustGroup extends BaseCustGroup {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CustGroup () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CustGroup (java.lang.String id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public GroupAttr findGroupAttr(Integer gaId){
		return findGroupAttr(this.getCustAttributes(), gaId);
	}
	
	public static GroupAttr findGroupAttr(Collection<GroupAttr> coll, Integer gaId){
		for(GroupAttr ca : coll){
			if(ca.getId() == gaId){
				return ca;
			}
		}
		return null;
	}

}