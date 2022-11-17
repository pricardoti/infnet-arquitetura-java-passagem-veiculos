<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Cadastro de Clientes</title>
    <meta charset="ISO-8859-1" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container">
      <h2>Clientes: ${clientes.size()}</h2>
      <h4>
        <a href="/cliente/incluir" class="btn btn-success">Novo Cliente</a>
      </h4>
      <table class="table table-striped">
        <thead>
          <tr>
            <th>Id</th>
            <th>Nome</th>
            <th>Cpf/Cnpj</th>
            <th>Email</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="c" items="${clientes}">
            <tr>
              <td>${c.id}</td>
              <td>${c.nome}</td>
              <td>${c.cpfCnpj}</td>
              <td>${c.email}</td>
              <td>
                <a href="/cliente/${c.id}/excluir" class="btn btn-warning"
                  >excluir</a
                >
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>
