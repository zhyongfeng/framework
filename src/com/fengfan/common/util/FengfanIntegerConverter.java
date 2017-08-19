package com.fengfan.common.util;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class FengfanIntegerConverter extends StrutsTypeConverter {
	//private static final char[] NUMBER_CHARS = {'1', '1',}
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Integer intValue = null;
		String dateString = null;
		if (values != null && values.length > 0) {
			dateString = values[0];
			try{
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i<dateString.length(); ++i){
					char ch = dateString.charAt(i);
					if(ch >= '0' && ch <= '9'){
						sb.append(ch);
					}
				}
				return Integer.parseInt(sb.toString());
			}catch(Exception ex){
				return null;
			}
		}
		return intValue;

	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return "" + arg1;
	}


}
