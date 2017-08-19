package com.fengfan.action.gatewaytype;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ISearchCondition;

public class GatewaySearchCondition extends AbstractSearchCondition implements ISearchCondition {
	
	private String id;
	private String gatewayName;
	private String status;
	private String proxyEnabled;
	private String isPublic;
	private String gatewayTypeId;
	private String location;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGatewayName() {
		return gatewayName;
	}
	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProxyEnabled() {
		return proxyEnabled;
	}
	public void setProxyEnabled(String proxyEnabled) {
		this.proxyEnabled = proxyEnabled;
	}
	public String getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}
	public String getGatewayTypeId() {
		return gatewayTypeId;
	}
	public void setGatewayTypeId(String gatewayTypeId) {
		this.gatewayTypeId = gatewayTypeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
