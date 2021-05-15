<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vista producto</title>
</head>
<body>
	<h1>Descripción del producto seleccionado:</h1>
	<h3>${producto.descripcion}</h3>
	<h3>${producto.codigo}</h3>
	<h3>${producto.precioUnitario}</h3>
	<h3>${producto.color}</h3>
	<h3>${producto.marca}</h3>
	<h3>${producto.familia.descripcion}</h3>
	<a href="/producto/index">volver al índice</a>
</body>
</html>