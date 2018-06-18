<!-- Page Content -->
    <div class="container">
	    <div>
	    
	    	<c:if test = "${userClickAllThreads == true}">
	    	<script>
	    		window.threadID = '';
	    	</script>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active">All Threads</li>
				</ol>
			</c:if>
			
			<c:if test = "${userClickSpecificThread == true}">
			<script>
	    		window.threadID = '${thread.id}';
	    	</script>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active">All Threads</li>
					<li class="breadcrumb-item active">${thread.threads_title}</li>
				</ol>
			</c:if>
		</div>
      <div class="row">
      		<c:forEach items="${threads}" var="o" >
			<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="${images}/${o.threads_cover_image}" height="150" width="150" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="${contextRoot}/threads/${o.id}/thread">${o.threads_title}</a>
						</h4>
						<p class="card-text">${o.threads_body}</p>
					</div>
				</div>
			</div>
			</c:forEach> 
      </div>
	<div>
		<table id = "plugin-practice" class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Images</th>
					<th scope="col">Title</th>
					<th scope="col">Body</th>
					<th scope="col">Status</th>
					<th scope="col">Created At</th>
					<th scope="col">Image</th>
					<th scope="col">Function</th>
				</tr>
			</thead>
			
		</table>
	</div>	
	<hr>
	<div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Firstname</th>
					<th scope="col">Lastname</th>
					<th scope="col">Email</th>
					<th scope="col">Role</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="o" >
					<tr>
						<td>${o.firstname}</td>
						<td>${o.lastname}</td>
						<td>${o.email}</td>
						<td>${o.role}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<hr>
</div>
      <!-- /.row -->