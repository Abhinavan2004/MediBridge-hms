<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password - MediBridge</title>
</head>
<body>
<%@ include file="../components/cdn-links.jsp" %>

<style>
    body {
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        min-height: 100vh;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }
    
    .reset-container {
        min-height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 20px;
    }
    
    .reset-card {
        background: white;
        border-radius: 15px;
        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
        padding: 40px;
        width: 100%;
        max-width: 450px;
    }
    
    .reset-title {
        color: #333;
        font-size: 28px;
        font-weight: 600;
        margin-bottom: 10px;
        text-align: center;
    }
    
    .reset-subtitle {
        color: #666;
        font-size: 14px;
        text-align: center;
        margin-bottom: 30px;
    }
    
    .form-label {
        color: #333;
        font-weight: 500;
        margin-bottom: 8px;
        font-size: 14px;
    }
    
    .form-control {
        border: 2px solid #e1e5e9;
        border-radius: 8px;
        padding: 12px 15px;
        font-size: 14px;
        transition: all 0.3s ease;
    }
    
    .form-control:focus {
        border-color: #667eea;
        box-shadow: 0 0 0 0.2rem rgba(102, 126, 234, 0.25);
    }
    
    .btn-reset {
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        border: none;
        border-radius: 8px;
        color: white;
        font-weight: 600;
        font-size: 16px;
        padding: 12px;
        width: 100%;
        transition: all 0.3s ease;
        margin-top: 20px;
    }
    
    .btn-reset:hover {
        transform: translateY(-2px);
        box-shadow: 0 8px 25px rgba(102, 126, 234, 0.3);
        color: white;
    }
    
    .back-to-login {
        text-align: center;
        margin-top: 20px;
    }
    
    .back-to-login a {
        color: #667eea;
        text-decoration: none;
        font-size: 14px;
        font-weight: 500;
    }
    
    .back-to-login a:hover {
        color: #764ba2;
        text-decoration: underline;
    }
    
    .step-indicator {
        display: flex;
        justify-content: center;
        margin-bottom: 30px;
    }
    
    .step {
        width: 8px;
        height: 8px;
        border-radius: 50%;
        background: #e1e5e9;
        margin: 0 4px;
    }
    
    .step.active {
        background: #667eea;
    }
    
    .alert {
        border-radius: 8px;
        font-size: 14px;
        margin-bottom: 20px;
    }
</style>

<div class="reset-container">
    <div class="reset-card">
        <div class="step-indicator">
            <div class="step active"></div>
            <div class="step"></div>
            <div class="step"></div>
        </div>
        
        <h2 class="reset-title">Reset Password</h2>
        <p class="reset-subtitle">Enter your email address and we'll send you a link to reset your password.</p>
        
        <!-- Success/Error Messages -->
        <% if(request.getParameter("success") != null) { %>
            <div class="alert alert-success" role="alert">
                <i class="fas fa-check-circle me-2"></i>
                Password reset link has been sent to your email address.
            </div>
        <% } %>
        
        <% if(request.getParameter("error") != null) { %>
            <div class="alert alert-danger" role="alert">
                <i class="fas fa-exclamation-circle me-2"></i>
                Email address not found. Please check and try again.
            </div>
        <% } %>
        
        <form action="forgot-password" method="post" id="resetForm">
            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="email" name="email" 
                       placeholder="Enter your registered email" required>
                <div class="invalid-feedback">
                    Please enter a valid email address.
                </div>
            </div>
            
            <button type="submit" class="btn btn-reset">
                <i class="fas fa-paper-plane me-2"></i>
                Send Reset Link
            </button>
        </form>
        
        <div class="back-to-login">
            <a href="doctor-login.jsp">
                <i class="fas fa-arrow-left me-1"></i>
                Back to Login
            </a>
        </div>
    </div>
</div>

<script>
    // Form validation
    document.getElementById('resetForm').addEventListener('submit', function(e) {
        const email = document.getElementById('email');
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        
        if (!emailPattern.test(email.value)) {
            e.preventDefault();
            email.classList.add('is-invalid');
        } else {
            email.classList.remove('is-invalid');
            email.classList.add('is-valid');
        }
    });
    
    // Real-time email validation
    document.getElementById('email').addEventListener('input', function() {
        const email = this;
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        
        if (emailPattern.test(email.value)) {
            email.classList.remove('is-invalid');
            email.classList.add('is-valid');
        } else {
            email.classList.remove('is-valid');
            if (email.value.length > 0) {
                email.classList.add('is-invalid');
            }
        }
    });
</script>

</body>
</html>