package com.fengfan.action.base;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

public class ActionUtils {
	public static final Logger logger = Logger.getLogger(ActionUtils.class);
	
	public static final boolean isPostMethod(){
		String method = ServletActionContext.getRequest().getMethod();
		return StringUtils.equalsIgnoreCase("post", method);
	}
	
	public static final <EntityType> List<EntityType> clearNullEntity(List<EntityType> entities){
		for(int i = entities.size() - 1; i>=0; --i){
			if(entities.get(i) == null){
				entities.remove(i);
			}
		}
		return entities;
	}
	
	public static final <EntityType> void CopyFormDataToEntity(EntityType srcEntity, EntityType destEntity,  String postParameterPrefix) {
		if(!StringUtils.endsWith(postParameterPrefix, ".")){
			postParameterPrefix += ".";
		}
		int len = postParameterPrefix.length();
		Class<?> clazz = srcEntity.getClass();
		for(Enumeration<String> en = ServletActionContext.getRequest().getParameterNames(); en.hasMoreElements();){
			String parameter = en.nextElement();
			if(StringUtils.startsWith(parameter, postParameterPrefix)){
				String propertyName = StringUtils.capitalize(StringUtils.substring(parameter, len));
				String setterMethodName = "set" + propertyName;
				String getterMethodName = "get" + propertyName;
				try {
					Method getter = clazz.getMethod(getterMethodName);
					if(getter == null){
						logger.warn("No getter \"" + getterMethodName + "\" for " + clazz.getSimpleName() + " form copy");
					}
					Method setter = clazz.getMethod(setterMethodName, getter.getReturnType());
					if(setter == null){
						logger.warn("No setter \"" + setterMethodName + "\" for " + clazz.getSimpleName() + " form copy");
					}
					Object value = getter.invoke(srcEntity);
					setter.invoke(destEntity, value);
				} catch (Exception ex) {
					logger.error("Property \"" + propertyName + "\" copy error" , ex);
				}
			}
		}
	}
}
