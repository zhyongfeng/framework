<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				
				<s:label name="lot.id" label="批次号" />
				<s:label name="lot.providerAsString" label="所属运营商" />
	            <s:label name="lot.value" label="面值(元)" />
	            <s:label name="lot.amount" label="数量"/>		        
		        <s:label name="lot.duration" label="上网时长(秒)"/>
	            <s:label name="lot.issueDate" label="制卡日期" value="%{getText('global.format.time',{null!=lot.issueDate?lot.issueDate:''})}"/>
	            <s:label name="lot.expDate" label="失效日期" value="%{getText('global.format.time',{null!=lot.expDate?lot.expDate:''})}"/>
				<s:label name="lot.activeDays" label="有效天数" />
				<s:label name="lot.statusAsString" label="状态" />
				<s:label name="lot.description" label="注释" />
		</s:form>
	</div>
</div>
<div id="view_dialog">
	<div id="view_content">
		<div class="loading"></div>
	</div>
</div>
<script>
	$(function() {
		$("#view_dialog").dialog({
			autoOpen: false,
			width: 600,
			height: 500,
			modal: true,
			title: viewDialogTitle,
			buttons: {
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			}
		});
	});
</script>
