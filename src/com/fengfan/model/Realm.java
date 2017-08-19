package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseRealm;
import com.fengfan.model.enums.YesNoRadio;



public class Realm extends BaseRealm {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Realm () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Realm (java.lang.Integer id) {
		super(id);
	}
	
	public static String PROP_NO_STRIP = "NoStrip";
	public static String PROP_IS_SUPER_REALM = "IsSuperRealm";
	
	public String getNoStripAsString(){
		return DicTypeUtils.findByID(YesNoRadio.values(), this.getNoStrip()).getName();
	}
	
	public String getIsSuperRealmAsString(){
		return DicTypeUtils.findByID(YesNoRadio.values(), this.getIsSuperRealm()).getName();
	}

/*[CONSTRUCTOR MARKER END]*/


}