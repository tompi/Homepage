$(document).ready(function() {
	$('#facebook').bind('click', function() {
		$( "#facebookimg" ).dialog({
			modal: true,
			width: 700,
			buttons: {
				Ok: function() {
					$( this ).dialog( "close" );
				}
			}
		});
		return false;
	});
});
