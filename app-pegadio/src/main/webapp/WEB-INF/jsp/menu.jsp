<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">App Pedagio</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="/cliente/lista">Cliente</a></li>
      <li><a href="/passagem/lista">Passagem</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Veiculos<span class="caret"></span></a>
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
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>