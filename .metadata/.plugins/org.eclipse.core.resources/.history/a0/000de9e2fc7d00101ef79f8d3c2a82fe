<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediBridge: Administrator</title>
    
   <%@ include file="../components/cdn-links.jsp" %>

    <style>
        body {
            background-color: #f8f9fa;
        }
        .navbar-brand {
            font-weight: 600;
        }
        .nav-link {
            font-weight: 500;
            transition: color 0.3s ease;
        }
        .nav-link:hover {
            color: #ffc107 !important;
        }
        .dropdown-menu {
            border: none;
            box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
        }
        .dropdown-item:hover {
            background-color: #f8f9fa;
        }
        .content-area {
            margin-top: 2rem;
            padding: 2rem;
        }
    </style>
</head>
<body>

<!-- to solve the issue of back button accessing the admin page you should remove the cache  -->
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

if(session.getAttribute("adminObj") == null){
	response.sendRedirect("../Admin.jsp");
}

%>   
<nav class="navbar navbar-expand-lg navbar-dark bg-dark border-bottom">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">
            <img src="../assets/logo.png" alt="Logo" width="35" height="40" 
                 class="d-inline-block align-text-top me-2 rounded-circle"
                 onerror="this.style.display='none'">
            MediBridge
        </a>

        <!-- Navbar toggler for mobile -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
                data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" 
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item me-4">
                    <a class="nav-link active" aria-current="page" href="../index.jsp">
                        <i class="fa-solid fa-home me-1"></i>Home
                    </a>
                </li>
                
                <li class="nav-item me-4">
                    <a class="nav-link" href="../index.jsp">
                        <i class="fa-solid fa-user-doctor me-1"></i>Doctor
                    </a>
                </li>
                
                <li class="nav-item me-4">
                    <a class="nav-link" href="#">
                        <i class="fa-solid fa-user-injured me-1"></i>Patient
                    </a>
                </li>
                 
                <li class="nav-item me-4">
                     <a class="nav-link" href="../adminlogout">
                         <i class="fa-solid fa-sign-out-alt me-2"></i>Logout
                    </a>
               </li>       
            </ul>
        </div>
    </div>
</nav>


</body>
</html>