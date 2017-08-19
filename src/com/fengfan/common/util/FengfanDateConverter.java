package com.fengfan.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class FengfanDateConverter extends StrutsTypeConverter {
	public static String DATE_TIME_FOMART = "yyyy-MM-dd HH:mm:ss";
	public static String DATE_FOMART = "yyyy-MM-dd";
	public static SimpleDateFormat DATE_TIME_FOMARTER = new SimpleDateFormat(DATE_TIME_FOMART);
	public static SimpleDateFormat DATE_FOMARTER = new SimpleDateFormat(DATE_FOMART);
	
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Date date = null;
		String dateString = null;
		if (values != null && values.length > 0) {
			dateString = values[0];
			if (dateString != null) {
				if(dateString.length() == DATE_TIME_FOMART.length() - 3){
					dateString += ":00";
				}
				try {
					date = (dateString.length() > DATE_FOMART.length() ? DATE_TIME_FOMARTER : DATE_FOMARTER).parse(dateString);
				} catch (ParseException e) {
					date = null;
				}
			}
		}
		return date;

	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return "" + arg1;
	}


}
