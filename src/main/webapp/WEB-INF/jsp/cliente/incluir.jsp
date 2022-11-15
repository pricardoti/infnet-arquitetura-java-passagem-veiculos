<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastrar Cliente</title>
</head>
<body>
	<div class="container mt-3">
	<h2>Cliente</h2>
	  <form action="/cliente/incluir" method="post">
        <div class="mb-3 mt-3">
            <label class="form-label">Nome:</label>
            <input type="text" class="form-control" placeholder="nome do cliente" name="nome">
        </div>
	    <div class="mb-3 mt-3">
            <label class="form-label">cpf ou cnpj:</label>
            <input type="text" class="form-control" placeholder="cpf ou cnpj do cliente" name="cpfCnpj">
        </div>
        <div class="mb-3 mt-3">
            <label class="form-label">e-mail:</label>
            <input type="email" class="form-control" placeholder="e-mail do cliente" name="email">
        </div>
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>