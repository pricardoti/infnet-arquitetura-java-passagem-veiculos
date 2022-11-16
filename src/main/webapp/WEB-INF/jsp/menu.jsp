<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/passagem/lista">Passagem</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/cliente/lista">Cliente</a>
      </li>
      <li class="nav-item dropdown">
        <a
          class="nav-link active dropdown-toggle"
          href="#"
          role="button"
          data-bs-toggle="dropdown"
          >Veiculos</a
        >
        <ul class="dropdown-menu">
          <li>
            <a class="dropdown-item" href="/veiculos/passeio/lista">Passeio</a>
          </li>
          <li>
            <a class="dropdown-item" href="/veiculos/carga/lista">Carga</a>
          </li>
          <li>
            <a class="dropdown-item" href="/veiculos/transporte/lista"
              >Transporte</a
            >
          </li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
