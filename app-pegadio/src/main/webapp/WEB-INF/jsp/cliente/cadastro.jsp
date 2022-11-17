<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastrar Cliente</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    
	<div class="container">
	<h2>Cliente</h2>
	  <form action="/cliente/incluir" method="post">
        <div class="form-group">
            <label class="form-label">Nome:</label>
            <input type="text" class="form-control" placeholder="nome do cliente" name="nome">
        </div>
	    <div class="form-group">
            <label class="form-label">Cpf ou Cnpj:</label>
            <input type="text" class="form-control" placeholder="cpf ou cnpj do cliente" name="cpfCnpj">
        </div>
        <div class="form-group">
            <label class="form-label">E-mail:</label>
            <input type="email" class="form-control" placeholder="e-mail do cliente" name="email">
        </div>
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>