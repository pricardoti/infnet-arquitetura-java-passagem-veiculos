<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Cadastrar Veiculo de Transporte</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container">
      <h2>Veiculo de Transporte</h2>
      <form action="/veiculos/transporte/incluir" method="post">
        <c:import url="/WEB-INF/jsp/veiculos/form-cadastro-commons.jsp" />
        <div class="form-group">
          <label>Qtd Passageiros:</label>
          <input
            type="text"
            maxlength="4"
            class="form-control"
            placeholder="100"
            name="quantidadePassageiros"
          />
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
</html>
