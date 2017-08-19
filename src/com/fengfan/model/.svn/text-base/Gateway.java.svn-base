package com.fengfan.model;

import java.text.MessageFormat;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseGateway;
import com.fengfan.model.enums.GatewayStatus;
import com.fengfan.model.enums.GatewayUseType;



public class Gateway extends BaseGateway {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Gateway () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Gateway (java.lang.String id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/


	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}
	
	public String getGatewayTypeAsString(){
		GatewayType p =  this.getGatewayType();
		return p == null ? "" : p.getId();
	}
	
	public String getCoordinateAsString(){
		int intLatitudeHeader = this.getLatitude() == null ? 0 : this.getLatitude();
		int intLongitudeHeader =  this.getLongitude() == null ? 0 : this.getLongitude();
		String strLongitudeHeader = intLongitudeHeader > 0? "东经" : "西经";
		String strLatitudeHeader = intLatitudeHeader > 0? "北纬" : "南纬";
		return MessageFormat.format("{0}{1}° {2}{3}°", strLongitudeHeader, Math.abs(intLongitudeHeader), strLatitudeHeader, Math.abs(intLatitudeHeader));
	}
	
	public String getProxyEnabledAsString(){
		return DicTypeUtils.findByID(GatewayUseType.values(), getProxyEnabled()).getName();
	}
	
	public String getIsPublicAsString(){
		return DicTypeUtils.findByID(GatewayUseType.values(), this.getIsPublic()).getName();
	}
	
	public String getStatusAsString(){
		return DicTypeUtils.findByID(GatewayStatus.values(), this.getStatus()).getName();
	}
}