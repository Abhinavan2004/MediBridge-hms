<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediBridge | User Login</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        .login-container {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .login-card {
            background: white;
            border-radius: 15px;
            padding: 40px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            position: relative;
        }

        .login-header {
            text-align: center;
            margin-bottom: 30px;
        }

        .login-header h1 {
            color: #333;
            font-size: 28px;
            margin-bottom: 10px;
        }

        .login-header p {
            color: #666;
            font-size: 14px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 8px;
            color: #333;
            font-weight: 500;
            font-size: 14px;
        }

        .form-group input {
            width: 100%;
            padding: 12px 16px;
            border: 2px solid #e1e5e9;
            border-radius: 8px;
            font-size: 14px;
            transition: border-color 0.3s ease;
        }

        .form-group input:focus {
            outline: none;
            border-color: #667eea;
        }

        .form-group input:invalid {
            border-color: #e74c3c;
        }

        .password-container {
            position: relative;
        }

        .password-toggle {
            position: absolute;
            right: 12px;
            top: 50%;
            transform: translateY(-50%);
            background: none;
            border: none;
            cursor: pointer;
            color: #666;
            font-size: 14px;
        }

        .login-btn {
            width: 100%;
            padding: 14px;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: transform 0.2s ease, box-shadow 0.2s ease;
        }

        .login-btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
        }

        .login-btn:active {
            transform: translateY(0);
        }

        .error-message {
            background: #fee;
            color: #c33;
            padding: 10px;
            border-radius: 6px;
            margin-bottom: 20px;
            font-size: 14px;
            border-left: 4px solid #e74c3c;
        }

        .success-message {
            background: #efe;
            color: #3c3;
            padding: 10px;
            border-radius: 6px;
            margin-bottom: 20px;
            font-size: 14px;
            border-left: 4px solid #27ae60;
        }

        .forgot-password, .create_account {
            text-align: center;
            margin-top: 20px;
        }

        .forgot-password a, .create_account a {
            color: #667eea;
            text-decoration: none;
            font-size: 14px;
        }

        .forgot-password a:hover, .create_account a:hover {
            text-decoration: underline;
        }

        .loading {
            opacity: 0.7;
            pointer-events: none;
        }

        .loading .login-btn {
            background: #ccc;
        }

        @media (max-width: 480px) {
            .login-card {
                padding: 30px 20px;
            }
        }
    </style>
</head>
<body>
    <%@ include file="components/navbar.jsp" %>
    
    <div class="login-container">
        <div class="login-card">
            <div class="login-header">
                <h1>User Login</h1>
                <p>Welcome back! Please sign in to your account.</p>
            </div>

            <!-- Display error message from session -->
            <% 
                String errorMsg = (String) session.getAttribute("errorMsg");
                if (errorMsg != null) {
            %>
                <div class="error-message">
                    <%= errorMsg %>
                </div>
            <%
                    session.removeAttribute("errorMsg");
                }
            %>

            <!-- Display success message from session -->
            <% 
                String successMsg = (String) session.getAttribute("successMsg");
                if (successMsg != null) {
            %>
                <div class="success-message">
                    <%= successMsg %>
                </div>
            <%
                    session.removeAttribute("successMsg");
                }
            %>

            <!-- Fixed: Added proper action for form -->
            <form id="loginForm" action="${pageContext.request.contextPath}/UserLogin" method="POST">
                <div class="form-group">
                    <label for="email">Email id</label>
                    <input type="email" id="email" name="email" required 
                           placeholder="Enter your email">
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <div class="password-container">
                        <input type="password" id="password" name="password" required 
                               placeholder="Enter your password">
                        <button type="button" class="password-toggle" onclick="togglePassword()">
                            Show
                        </button>
                    </div>
                </div>

                <button type="submit" class="login-btn">Sign In</button>
            </form>

            <div class="forgot-password">
                <a href="forgot-password.jsp">Forgot your password?</a>
            </div>
            <div class="create_account">
                Don't have an account? <a href="Signup.jsp">Create one.</a>
            </div>
        </div>
    </div>

    <!-- Fixed: Added missing JavaScript function -->
    <script>
        function togglePassword() {
            const passwordInput = document.getElementById('password');
            const toggleButton = document.querySelector('.password-toggle');
            
            if (passwordInput.type === 'password') {
                passwordInput.type = 'text';
                toggleButton.textContent = 'Hide';
            } else {
                passwordInput.type = 'password';
                toggleButton.textContent = 'Show';
            }
        }
    </script>

</body>
</html>