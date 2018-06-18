<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Page Content -->
<div class="container">

	<c:if test="${not empty message}">
		<div class="col-xs-12">
			<div class="alert alert-dismissible alert-success">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				<strong>InsFire!</strong> ${message}
			</div>
		</div>
	</c:if>
	<div class="row">
		<!-- Post Content Column -->
		<div class="col-lg-12 spaceTop">

			<form:form modelAttribute="Thread" method="POST"
				action="${contextRoot}/manage/threads">
				<div class="form-group">
					<label for="title">Title</label>
					<form:input type="text" class="form-control" path="threads_title"
						placeholder="Enter a title" id="title" />
					<small id="titleHelp" class="form-text text-muted">We'll
						never share your email with anyone else.</small>
				</div>

				<div class="form-group">
					<label for="bodyTextarea">Body</label>
					<form:textarea class="form-control" id="bodyTextarea"
						path="threads_body" rows="3" cols="50"></form:textarea>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>

				<!-- HIDDEN DATA -->
				<form:hidden path="id" />
				<form:hidden path="threads_created_at" />
				<form:hidden path="threads_cover_image" />
			</form:form>

			<hr>
		</div>

	</div>
	<!-- /.row -->

</div>
<!-- /.container -->