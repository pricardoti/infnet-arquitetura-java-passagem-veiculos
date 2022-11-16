<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    <title>Cadastrar Passagem de Veiculo</title>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container mt-3">
      <h2>Passagem de Veiculo</h2>
      <form action="/passagem/incluir" method="post">
        <div class="mb-3 mt-3">
          <label class="form-label">Pra&#231;a:</label>
          <input type="text" class="form-control" placeholder="praia-norte" name="praca">
        </div>
        <div class="mb-3 mt-3">
          <label class="form-label">Guich&#234;:</label>
          <input type="number" maxlength="2" class="form-control" placeholder="01" name="guiche">
        </div>
        <div class="mb-3 mt-3">
          <label class="form-label">Operador:</label>
          <input type="text" class="form-control" placeholder="Joao" name="operador">
        </div>
        <div class="mb-3 mt-3">
          <label class="form-label">Data Hora:</label>
          <input type="datetime-local" class="form-control" name="dataHora">
        </div>
        <div class="mb-3 mt-3">
          <label class="form-label">Veciulo:</label>
          <select class="form-select" name="veiculo">
            <option>selecione uma op&#231;&#227;o</option>
            <c:forEach var="veiculo" items="${veiculos}">
              <option value="${veiculo.id}">${veiculo.placa}</option>
            </c:forEach>
          </select>
        </div>
        <div class="mb-3 mt-3">
          <label class="form-label">Cliente:</label>
          <select class="form-select" name="cliente">
            <option>selecione uma op&#231;&#227;o</option>
            <c:forEach var="cliente" items="${clientes}">
              <option value="${cliente.id}">${cliente.nome}</option>
            </c:forEach>
          </select>
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
</html>
