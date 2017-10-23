﻿$(document).ready(
	function() {
		$('[title]').attr('data-tooltip', '').attr('aria-haspopup', 'true');
		
		$('input[type=submit], input[type=reset], input[type=button], button').addClass('button');
		$('input[type=submit]:not(.tiny):not(.medium):not(.large), input[type=reset]:not(.tiny):not(.medium):not(.large), input[type=button]:not(.tiny):not(.medium):not(.large), button:not(.tiny):not(.medium):not(.large), a.button:not(.tiny):not(.medium):not(.large)').addClass('small');
		
		$('#\\/Date').fdatepicker({format: 'yyyy-mm-dd'});
		
		$(document).foundation();
		
		var lclModalsToOpenOnLoad = $('.modal-open-on-load');
		if (lclModalsToOpenOnLoad.length > 0) {
			lclModalsToOpenOnLoad.foundation('open');
		}
		
		for (var columns = 1; columns < 10; columns++) {
			var options = {
				textExtraction: myTextExtractor,
				widgets: ['scroller'],
				widgetOptions: {
					scroller_fixedColumns: columns,
					scroller_height: 1000000
				}
			};
			
			$('table[data-fixed-columns=' + columns + ']:not(.unsortable)').tablesorter(options);
		}
		
		$('table:not([data-fixed-columns]):not(.unsortable)').tablesorter({textExtraction: myTextExtractor});
	}
);

var myTextExtractor = function(argNode) {
	var lclCustom = argNode.getAttribute('data-order');
	if (lclCustom) {
		return lclCustom;
	} else {
		return argNode.innerHTML.toUpperCase();
	}
}

function acknowledgeMessage(argMessageId) {
	try {
		$.ajax(
			{
				url: '/messages/AcknowledgeMessage',
				type: 'POST',
				dataType: 'json',
				data: {'message_id': argMessageId}
			}
		).done(
			function (argResponse) {
				var lclMessagesModal = $('#messages-modal');
				if (lclMessagesModal.length > 0) {
					lclMessagesModal.foundation('close');
				} else {
					// This is for when we're on the full page of messages.  It's lame, but a lot easier than actually updating the display in place.
					window.location.reload(true);
				}
			}
		).fail(
			function(argResponse) {
				window.alert('Failed to acknowledge message. Ask for help.');
			}
		);
	} catch (lclE) {
		window.alert('Failed to acknowledge message: ' + lclE.message);
	}
}
