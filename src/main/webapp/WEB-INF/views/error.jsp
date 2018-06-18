<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<spring:url var="css" value="/resources/css" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap-min.css" rel="stylesheet">
<!-- Bootstrap THEME CSS -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/modern-business.css" rel="stylesheet">
<!-- My Own CSS -->
<link href="${css}/myapp.css" rel="stylesheet">
<!-- FAVICON -->
<link rel="icon" type="image/png" href="${images}/logo.png" />
<title>InsFire | ${title}</title>

<!-- FOR ACTIVE MENU -->
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>
</head>
<body>

	<!-- NAVBAR  -->

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot}/home">InsFire</a>
	</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3" style="margin-top:5%">
				<div class="col-md-6 offset-md-3">
					<img class="img-fluid rounded" src="${images}/logo.png"
						height="300" width="900" alt="">
				</div>
				<hr>
				<p class = "lead text-danger">${ErrorTitle}</p>
				<blockquote class="blockquote text-center" style = "word-wrap:break-word">
					<h1>${ErrorDescription}</h1>
					<footer class="blockquote-footer">from <cite
						title="Source Title">InsFire Team</cite></footer>
				</blockquote>

			</div>
		</div>
	</div>
</body>
<!-- Bootstrap core JavaScript -->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.bundle.min.js"></script>

<!-- MY OWN JS -->
<script src="${js}/myapp.js"></script>

</html>