<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
		<h1>Lista de productos</h1>
		<table border="2">
			<th>Descripcion</th><th>Familia</th><th>Precio</th><th> Ver Detalles</th>
			<c:forEach var="ele" items="${lista}">
				<tr>
					<td> ${ele.descripcion}</td>
					<td> ${ele.familia.descripcion}</td>
					<td>${ele.precioUnitario}</td>
					<td><a href="/producto/verUno/${ele.codigo}">detalle</a></td>
				</tr>
			</c:forEach>
		</table><br>
		<a href="/producto/index">volver al índice</a>
</body>
</html>