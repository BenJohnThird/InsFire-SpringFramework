
$(document).ready(function(){
	//	CAROUSEL
	$('.carousel').carousel({
		  interval: 5000
	});
	//NAVBAR
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
		case 'Manage Threads':
			$('#managethreads-tab').addClass('active');
			break;
		default:
			if(menu == "Home") break;
			$('#threads-tab').addClass('active');
			break;
	}
	
	//JSON FOR THREADS
	var jsonUrl = '';
	if(window.threadID == '')
	{
		jsonUrl = window.contextRoot + "/json/data/all/threads";
	}
	else
	{
		jsonUrl = window.contextRoot + "/json/data/thread/" + window.threadID;
	}
	//TABLE FOR THREADS
	$('#plugin-practice').DataTable({
		lengthMenu: [[3,5,10,-1],['3 Trds','5 Trds','10 Trds','All Trds']],
		pageLength:5,
		ajax: {
	        url: jsonUrl,
	        dataSrc: ''
	    },
	    columns: [
	    			{
	    				data:'threads_cover_image',
	    				mRender: function(data, type, row)
	    				{
	    					return "<img src = ' "+ window.contextRoot+ '/resources/images/' + data + "' class = 'dataTablesImg'/>";
	    				}
	    			},
	    			{
	    				data:'threads_title'
	    			},
	    			{
	    				data:'threads_body'
	    			},
	    			{
	    				data:'threads_status_active'
	    			},
	    			{
	    				data:'threads_created_at'
	    			},
	    			{
	    				data:'threads_cover_image'
	    			},
	    			{
	    				data:'id',
	    				mRender: function(data ,type ,row)
	    				{
	    					var str = "";
	    					str += "<a href ='"+ window.contextRoot + '/threads/' + data + '/thread' +"' class = 'btn btn-primary'>View</a> &#160;";
	    					str += "<a href ='"+ window.contextRoot + '/json/data/thread/' + data + "' class = 'btn btn-danger'>Delete</a>";
	    					return str;
	    				}
	    			},
	    		]
	});
	
	//ALERT DISMISS
	var $alert = $('.alert');
	
	if($alert.length)
	{
		setTimeout(function(){
			$alert.fadeOut('slow');
		} , 3000)
	}
});

