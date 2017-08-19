<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" language="javascript">
	jQuery(document).ready(function(){
		$("text").css("width", "130px");
		$("select").css("width", "130px");
		$( "#search_accordion" ).accordion({
			autoHeight: false,
			navigation: true,
			icons: false
		});
		$( "#list_accordion" ).accordion({
			autoHeight: false,
			navigation: true,
			icons: false
		});
		
		
		$("#search_sumbit").button({icons : {primary : "ui-icon-search"}});
		$("#search_reset").button({icons : {primary : "ui-icon-refresh"}});

		$('#dialog').dialog({
			autoOpen : false
		});
		
		$("[name='edit.action']").button({
			icons : {
				primary : "ui-icon-pencil"
			},
			text: false
		}).click(
				function() {
					location = $(this).attr("href").substring(1);
				});
		$("[name='remove.action']").button({
			icons : {
				primary : "ui-icon-trash"
			},
			text: false
		}).click(
				function(event) {
					var url = $(this).attr("href").substring(1);
					$('#dialog').dialog({
						autoOpen : false,
						width : 300,
						modal : true,
						buttons : {
							"Ok" : function() {
								location = url;
								$(this).dialog("close");
							},
							"Cancel" : function() {
								$(this).dialog("close");
							}
						}
					});
					$('#dialog').dialog('open');
				});
	});
</script>