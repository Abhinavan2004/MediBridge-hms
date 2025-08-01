<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Fixed Navbar</title>
<!-- Include CDN links from external file -->
<%@ include file="cdn-links.jsp" %>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark border-bottom">
<div class="container-fluid">
<a class="navbar-brand" href="index.jsp">
<img src="assets/logo.png" alt="Logo" width="35" height="40" class="d-inline-block align-text-top me-2 rounded-circle" 
     onerror="this.style.display='none'">
MediBridge
</a>

<!-- Navbar toggler for mobile -->
<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse" id="navbarNavDropdown">
<ul class="navbar-nav ms-auto">
<li class="nav-item me-4">
<a class="nav-link active" aria-current="page" href="Admin.jsp">
<i class="fa-solid fa-user-shield me-1"></i>Admin
</a>
</li>
<li class="nav-item me-4">
<a class="nav-link" href="Apointment.jsp">
<i class="fa-solid fa-calendar-check me-1"></i>Appointment
</a>
</li>
<li class="nav-item me-4">
<a class="nav-link" href="User.jsp">
<i class="fa-solid fa-user me-1"></i>User
</a>
</li>
<li class="nav-item me-4">
<a class="nav-link" href="Doctor.jsp">
<i class="fa-solid fa-user-doctor me-1"></i>Doctor
</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">
<i class="fa-solid fa-user-circle"></i>
</a>
</li>
</ul>
</div>
</div>
</nav>

<!-- Scripts are included in CDN file -->
</body>
</html>
</html>