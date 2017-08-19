package com.fengfan.action.base;

import org.apache.commons.lang.StringUtils;

import com.fengfan.model.enums.IDicType;

public class DicTypeUtils {
	
	public static final EmptyDicType EMPTY_DIC_TYPE = new EmptyDicType();
	
	private static class EmptyDicType implements IDicType{

		@Override
		public int getId() {
			return -1;
		}

		@Override
		public String getName() {
			return "";
		}
		
	}
	
	public static final IDicType findByID(IDicType[] dicTypeSet, Integer id){
		if(id == null){
			return EMPTY_DIC_TYPE;
		}
		for(IDicType dt : dicTypeSet){
			if(dt.getId() == id){
				return dt;
			}
		}
		return EMPTY_DIC_TYPE;
	}
	
	public static final IDicType findByID(IDicType[] dicTypeSet, String id){
		for(IDicType dt : dicTypeSet){
			if(StringUtils.equalsIgnoreCase(""+dt.getId(), id)){
				return dt;
			}
		}
		return EMPTY_DIC_TYPE;
	}
}
