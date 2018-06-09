
$(document).ready(function(){
//	CAROUSEL
	alert("WOW");
	$('.carousel').carousel({
		  interval: 5000
	});
	
	switch(menu)
	{
		case 'About Us':
			$('#about-tab').addClass('active');
			break;
		case 'Contact':
			$('#contact-tab').addClass('active');
			break;
		case 'Services':
			$('#services-tab').addClass('active');
			break;
		case 'Threads':
			$('#threads-tab').addClass('active');
			break;
		default:
			$('#threads-tab').addClass('active');
			break;
	}
});

