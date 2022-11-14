<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>App Passagens Veiculos</title>
    <meta charset="ISO-8859-1">
    <!-- CARREGANDO BOOTSTRAP HTML/CSS -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
      <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="/cliente/lista">Cliente</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="/passagem/lista">Passagem</a>
            </li>
            <a class="nav-link active dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Veiculos</a>
            <ul class="dropdown-menu">
               <li><a class="dropdown-item" href="/auto-passeio/lista">Auto Passeio</a></li>
               <li><a class="dropdown-item" href="/carga/lista">Carga</a></li>
               <li><a class="dropdown-item" href="/transporte/lista">Transporte</a></li>
            </ul>
        </ul>
      </div>
    </nav>
</body>
</html>