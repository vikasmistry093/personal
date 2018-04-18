<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<div class="nav navbar-nav">
				<a href="${pageContext.request.contextPath}/home"><img
					src="${pageContext.request.contextPath}/resources/images/logo.jpg"
					class="imgLogo" alt="logo" width="50" height="50"></a>
			</div>
			<a class="navbar-brand"
				href="${pageContext.request.contextPath}/home">MyBank</a>

		</div>
		<ul class="nav navbar-nav" style="float: right;">
			<li class="userInfoOnHeader" style="color: white;">Welcome,${customer.firstName} ${customer.middleName} ${customer.lastName}.<br />${customer.updateTimestamp }</li>
			<li><a href="${pageContext.request.contextPath}/"><input type="button" class="btn btn-danger btn-sm"  value="Logout"></a></li>
		</ul>
	</div>
</nav>