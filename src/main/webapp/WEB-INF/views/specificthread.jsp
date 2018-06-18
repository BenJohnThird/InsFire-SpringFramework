<head>
<!-- Custom styles for this template -->
<link href="${css}/blog-post.css" rel="stylesheet">
</head>
<!-- Page Content -->
<div class="container">

	<div class="row">
		<c:if test="${userClickSpecificThread == true}">
			<script>
				window.threadID = '${thread.id}';
			</script>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
				<li class="breadcrumb-item active"><a
					href="${contextRoot}/threads/all/">All Threads</a></li>
			</ol>
		</c:if>
		<!-- Post Content Column -->
		<div class="col-lg-12">

			<!-- Title -->
			<h1 class="mt-4">${thread.threads_title}</h1>

			<!-- Author -->
			<p class="lead">
				by <a href="#">Start Bootstrap</a>
			</p>

			<hr>

			<!-- Date/Time -->
			<p>Posted on ${thread.threads_created_at}</p>

			<hr>

			<!-- Preview Image -->
			<img class="img-fluid rounded"
				src="${images}/${thread.threads_cover_image}" height="300"
				width="900" alt="">
			<hr>

			<!-- Post Content -->
			${thread.threads_body}

			<hr>

			<!-- Comments Form -->
			<div class="card my-4">
				<h5 class="card-header">Leave a Comment:</h5>
				<div class="card-body">
					<form>
						<div class="form-group">
							<textarea class="form-control" rows="3"></textarea>
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>

			<!-- Single Comment -->
			<div class="media mb-4">
				<img class="d-flex mr-3 rounded-circle"
					src="http://placehold.it/50x50" alt="">
				<div class="media-body">
					<h5 class="mt-0">Commenter Name</h5>
					Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
					scelerisque ante sollicitudin. Cras purus odio, vestibulum in
					vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi
					vulputate fringilla. Donec lacinia congue felis in faucibus.
				</div>
			</div>

			<!-- Comment with nested comments -->
			<div class="media mb-4">
				<img class="d-flex mr-3 rounded-circle"
					src="http://placehold.it/50x50" alt="">
				<div class="media-body">
					<h5 class="mt-0">Commenter Name</h5>
					Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
					scelerisque ante sollicitudin. Cras purus odio, vestibulum in
					vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi
					vulputate fringilla. Donec lacinia congue felis in faucibus.

					<div class="media mt-4">
						<img class="d-flex mr-3 rounded-circle"
							src="http://placehold.it/50x50" alt="">
						<div class="media-body">
							<h5 class="mt-0">Commenter Name</h5>
							Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
							scelerisque ante sollicitudin. Cras purus odio, vestibulum in
							vulputate at, tempus viverra turpis. Fusce condimentum nunc ac
							nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
						</div>
					</div>

					<div class="media mt-4">
						<img class="d-flex mr-3 rounded-circle"
							src="http://placehold.it/50x50" alt="">
						<div class="media-body">
							<h5 class="mt-0">Commenter Name</h5>
							Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
							scelerisque ante sollicitudin. Cras purus odio, vestibulum in
							vulputate at, tempus viverra turpis. Fusce condimentum nunc ac
							nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
						</div>
					</div>

				</div>
			</div>

		</div>

	</div>
	<!-- /.row -->

</div>
<!-- /.container -->