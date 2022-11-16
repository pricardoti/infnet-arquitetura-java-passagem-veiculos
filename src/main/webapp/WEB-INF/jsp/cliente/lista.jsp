<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Cadastro de Clientes</title>
    <meta charset="ISO-8859-1" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container mt-3">
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
