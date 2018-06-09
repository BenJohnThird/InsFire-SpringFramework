<!-- Page Content -->
    <div class="container">
	    <div>
	    
	    	<c:if test = "${userClickAllThreads == true}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active">All Threads</li>
				</ol>
			</c:if>
			
			<c:if test = "${userClickSpecificThread == true}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active">All Threads</li>
					<li class="breadcrumb-item active">${thread.threads_title}</li>
				</ol>
			</c:if>
		</div>
      <div class="row">
      		<c:forEach var="o" items="${threads}">
			<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="${contextRoot}/threads/${o.id}/thread">${o.id}</a>
						</h4>
						<p class="card-text">${o.threads_body}</p>
					</div>
				</div>
			</div>
			</c:forEach> 
      </div>
    </div>
      <!-- /.row -->