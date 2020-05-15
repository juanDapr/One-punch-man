<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de estudiantes</title>

<!--Termina jQuery DataTable-->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<!-- jQuery DataTable -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.10.20/r-2.2.3/datatables.min.css" />

<script type="text/javascript"
	src="https://cdn.datatables.net/v/dt/dt-1.10.20/r-2.2.3/datatables.min.js"></script>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/navbars/">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script>
<!--Función para darle formato a la Tabla-->
	$(document).ready(function() {
		$('#myTable').DataTable();
		responsive = True;
	});
</script>
<head>
<title>One Punch Man</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/recursos/assets/css/main.css" />
</head>
</head>


<body>
	<!-- Header -->
	<header id="header">
		<a href="#menu">Menu </a>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="Home">Inicio</a></li>
			<li><a href="MostrarHeroes">Heroes</a></li>
			<li><a href="elements.html">Monstruos</a></li>
		</ul>
	</nav>
	<section id="banner"
		background="${pageContext.request.contextPath}/recursos/images/banner.jpg">
		<div class="inner">
			<header>
				<h1>PATROCINADOR</h1>
			</header>
			<a href="#main" class="button big alt scrolly">bajar</a>
		</div>

	</section>
	<div id="main">
		<section class="wrapper style1">
		<div class="inner">
			<header class="align-center">
				<h2>Datos de los Patrocinadores</h2>
			</header>

			<table border="1" id="myTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>NIT</th>
						<th>NOMBRE</th>
						<th>LOGO</th>
						<th>Acciones</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${p }" var="p">
						<tr>
							<td>${p.id}</td>
							<td>${p.nit}</td>
							<td>${p.nombre}</td>
							<td><img src="recursos/images/${p.logo}" width="80"
								height="80" alt="imagen"></td>
							<td><a href="edit/${p.id}"
								class="btn btn-success btn-sm" role="button" title="Edit"> <span
									class="glyphicon glyphicon-pencil"></span>editar
							</a> <a href="eliminar/${p.id}"
								onclick='return confirm("¿Estas seguro?")'
								class="btn btn-danger btn-sm" role="button" title="Eliminar">
									<span class="glyphicon glyphicon-trash"></span>eliminar
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		</section>
		</div>
		
		
		<script
			src="${pageContext.request.contextPath}/recursos/assets/js/jquery.scrolly.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/recursos/assets/js/skel.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/recursos/assets/js/util.js"></script>
		<script
			src="${pageContext.request.contextPath}/recursos/assets/js/main.js"></script>
		
</body>
</html>