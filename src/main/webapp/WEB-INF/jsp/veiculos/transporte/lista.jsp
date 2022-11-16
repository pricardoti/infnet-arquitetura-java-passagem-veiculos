<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Transporte</title>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <div class="container mt-3">
    <h3>Veiculos de Transporte: ${veiculos.size()}</h3>
    <h4><a href="/veiculos/transporte/incluir" class="btn btn-success">Novo Veiculo</a></h4>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Placa</th>
          <th>Fabricante</th>
          <th>Modelo</th>
          <th>Motor</th>
          <th>Ano</th>
          <th>Qtd. Passageiros</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="v" items="${veiculos}">
            <tr>
              <td>${v.id}</td>
              <td>${v.placa}</td>
              <td>${v.fabricante}</td>
              <td>${v.modelo}</td>
              <td>${v.motor}</td>
              <td>${v.ano}</td>
              <td>${v.quantidadePassageiros}</td>
              <td><a href="/veiculos/transporte/${v.id}/excluir" class="btn btn-warning">excluir</a></td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>