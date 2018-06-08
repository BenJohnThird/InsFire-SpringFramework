
$(document).ready(function(){
//	CAROUSEL
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
		default:
			$('#home').addClass('active');
			break;
	}
});

