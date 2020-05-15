<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<!--
	Broadcast by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>

<head>
<title>One Punch Man</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/recursos/assets/css/main.css" />
</head>

<body>

	<!-- Header -->
	<header id="header">
		<a href="#menu">Menu </a>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Inicio</a></li>
			<li><a href="generic.html">Heroes</a></li>
			<li><a href="elements.html">Monstruos</a></li>
		</ul>
	</nav>

	<!-- Banner -->
	<!--
				To use a video as your background, set data-video to the name of your video without
				its extension (eg. images/banner). Your video must be available in both .mp4 and .webm
				formats to work correctly.
			-->
	<section id="banner"
		background="${pageContext.request.contextPath}/recursos/images/banner.jpg">
		<div class="inner">
			<header>
				<h1>Inscripción de heroes</h1>
			</header>
			<a href="#main" class="button big alt scrolly">Dignissim</a>
		</div>

	</section>

	<!-- Main -->
	<div id="main">

		<!-- One -->
		<section class="wrapper style1">
			<div class="inner">
				<header class="align-center">
					<h2>Ingresa los datos</h2>
				</header>

				<!-- 2 Column Video Section -->
				<form action="guardar" method="post" enctype="multipart/form-data">

					<div class="flex flex-2">
						<div class="video col">
							
							Nombre del heroe: <input type="text" class="form-control"
								id="nombre" name="nombre" placeholder="Nombre" required><br />
							Rango: <input type="number" class="form-control" id="rango"
								name="rango" placeholder="rango" required> <br />
							Residencia: <input type="text" class="form-control"
								id="residencia" name="residencia" placeholder="Residencia"
								required><br />
						</div>
						<div class="video col">
							Clase: <select id="clase" name="clase" required>
								<option value="">- Clase -</option>
								<option value="S">S</option>
								<option value="A">A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="otros">Otros</option>

							</select><br /> Habilidad: <input type="text" class="form-control"
								id="habilidad" name="habilidad" placeholder="habilidad" required><br />
							Telefono: <input type="number" class="form-control" id="Telefono"
								name="Telefono" placeholder="telefono" required><br />
							Foto:<input type="file" class="form-control" id="imagen"
								name="imagen">
						</div>
					</div>
					<input type="Submit" value="Registrar">
				</form>
			</div>
		</section>

		<!-- Footer -->
		<footer id="footer">
			<div class="inner">
				<div class="flex flex-3">
					<div class="col">
						<h3>Vestibullum</h3>
						<ul class="alt">
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
							<li><a href="#">Vis id faucibus montes tempor</a></li>
							<li><a href="#">Massa amet lobortis vel.</a></li>
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
						</ul>
					</div>
					<div class="col">
						<h3>Lobortis</h3>
						<ul class="alt">
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
							<li><a href="#">Vis id faucibus montes tempor</a></li>
							<li><a href="#">Massa amet lobortis vel.</a></li>
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
						</ul>
					</div>
					<div class="col">
						<h3>Accumsan</h3>
						<ul class="alt">
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
							<li><a href="#">Vis id faucibus montes tempor</a></li>
							<li><a href="#">Massa amet lobortis vel.</a></li>
							<li><a href="#">Nascetur nunc varius commodo.</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="copyright">
				<ul class="icons">
					<li><a href="#" class="icon fa-twitter"><span
							class="label">Twitter</span></a></li>
					<li><a href="#" class="icon fa-facebook"><span
							class="label">Facebook</span></a></li>
					<li><a href="#" class="icon fa-instagram"><span
							class="label">Instagram</span></a></li>
					<li><a href="#" class="icon fa-snapchat"><span
							class="label">Snapchat</span></a></li>
				</ul>
				&copy; Untitled. Design: <a href="https://templated.co">TEMPLATED</a>.
				Images: <a href="https://unsplash.com">Coverr</a>. Video: <a
					href="https://coverr.co">Coverr</a>.
			</div>
		</footer>

		<!-- Scripts -->
		<script
			src="${pageContext.request.contextPath}/recursos/assets/js/jquery.min.js"></script>
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