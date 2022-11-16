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
    <title>Cadastrar Veiculo de Transporte</title>
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="container mt-3">
      <h2>Veiculo de Transporte</h2>
      <form action="/veiculos/transporte/incluir" method="post">
        <c:import url="/WEB-INF/jsp/veiculos/form-cadastro-commons.jsp" />
        <div class="mb-3 mt-3">
          <label class="form-label">Qtd Passageiros:</label>
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
