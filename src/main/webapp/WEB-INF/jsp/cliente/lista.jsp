<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Clientes</title>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-3">
      <h2>Clientes: ${clientes.size()}</h2>
      <table class="table table-striped">
        <thead>
          <tr>
            <th>Nome</th>
            <th>Cpf/Cnpj</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
           <c:forEach var="c" items="${clientes}">
                <tr>
                  <td>${c.nome}</td>
                  <td>${c.cpfCnpj}</td>
                  <td>${c.email}</td>
                </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
</body>
</html>