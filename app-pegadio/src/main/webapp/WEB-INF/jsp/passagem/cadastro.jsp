<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Cadastrar Passagem de Veiculo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container">
      <h2>Passagem de Veiculo</h2>
      <form action="/passagem/incluir" method="post">
        <div class="form-group">
          <label>Pra&#231;a:</label>
          <input type="text" class="form-control" placeholder="praia-norte" name="praca">
        </div>
        <div class="form-group">
          <label>Guich&#234;:</label>
          <input type="number" maxlength="2" class="form-control" placeholder="01" name="guiche">
        </div>
        <div class="form-group">
          <label>Operador:</label>
          <input type="text" class="form-control" placeholder="Joao" name="operador">
        </div>
        <div class="form-group">
          <label>Data Hora:</label>
          <input type="datetime-local" class="form-control" name="dataHora">
        </div>
        <div class="form-group">
          <label>Veciulo:</label>
          <select class="form-control" name="veiculo">
            <option>selecione uma op&#231;&#227;o</option>
            <c:forEach var="veiculo" items="${veiculos}">
              <option value="${veiculo.id}">${veiculo.placa}</option>
            </c:forEach>
          </select>
        </div>
        <div class="form-group">
          <label>Cliente:</label>
          <select class="form-control" name="cliente">
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
