<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<div class="nav navbar-nav">
				<a href="${pageContext.request.contextPath}/home"><img
					src="${pageContext.request.contextPath}/resources/images/chase.jpg"
					class="img-rounded" alt="logo" width="50" height="50"></a>
			</div>
			<a class="navbar-brand"
				href="${pageContext.request.contextPath}/home">MyBank</a>

		</div>
		<ul class="nav navbar-nav" style="float: right;">
			<li style="color: white;">Welcome, Akash Mistry<br />Last Login: 27th Dec 2017,
				5:30pm
			</li>
			<li class="active"><a href="${pageContext.request.contextPath}/">Logout</a></li>
		</ul>
	</div>
</nav>