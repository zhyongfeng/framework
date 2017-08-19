<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="view_dialog">
	<div id="view_content">
		<div class="loading"></div>
	</div>
</div>
<script>
	$(function() {
		$("[name='view.action']").button({
			icons : {
				primary : "ui-icon-zoomin"
			},
			text: false
		}).click(
				function() {
					
					//$("#view_dialog_frame").attr("width", $( "#view_dialog" ).attr("width"));
					//$("#view_dialog_frame").attr("height", $( "#view_dialog" ).attr("height"));
					$("#view_dialog").dialog( "open" );
					
					var url = $(this).attr("href").substring(1);
					
					//$("#view_dialog_frame").attr("src", $(this).attr("href").substring(1));
					$("#view_dialog").attr("edit_button", $(this).attr("id").replace("view", "edit"));
					
					$.ajax({
						type:"get",
						url:url,
						beforeSend: function(XMLHttpRequest){
							$("#view_content").html("<div class=\"loading\"></div>");
						},
						success: function(data, textStatus){
							$("#view_content").html(data);	
						},
						complete:function(XMLHttpRequest, textStatus){
							
						},
						error: function(){
							
						}
					});
				});
		
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