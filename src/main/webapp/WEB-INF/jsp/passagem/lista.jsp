<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Passagens</title>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <div class="container mt-3">
    <h3>Passagens de Veiculos: ${passagens.size()}</h3>
    <h4><a href="/passagem/incluir" class="btn btn-success">Nova Passagem</a></h4>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Pra&#231;a</th>
          <th>Guich&#234;</th>
          <th>Operador</th>
          <th>Data Hora</th>
          <th>Veciulo</th>
          <th>Cliente</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="p" items="${passagens}">
            <tr>
              <td>${p.id}</td>
              <td>${p.praca}</td>
              <td>${p.guiche}</td>
              <td>${p.operador}</td>
              <td>${localDateTimeFormat.format(p.dataHora)}</td>
              <td>${p.veiculo.placa}</td>
              <td>${p.cliente.nome}</td>
              <td><a href="/passagem/${p.id}/excluir" class="btn btn-warning">excluir</a></td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>