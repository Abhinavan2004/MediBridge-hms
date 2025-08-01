<%@ page import="com.db.DBConnect"%>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MediBridge | HomePage</title>
    <!-- Include CDN links from external file -->
<%@include file="components/cdn-links.jsp" %>
    <style>
        .hero-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 100px 0;
        }
        .feature-card {
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            border: none;
            border-radius: 15px;
            height: 100%;
            padding: 2rem;
        }
        .feature-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 20px 40px rgba(0,0,0,0.1);
        }
        .doctor-card {
            border: none;
            border-radius: 20px;
            overflow: hidden;
            transition: transform 0.3s ease;
            height: 100%;
        }
        .doctor-card:hover {
            transform: scale(1.05);
        }
        .doctor-img {
            width: 100%;
            height: 250px;
            object-fit: cover;
        }
        .review-card {
            background: #f8f9fa;
            border: none;
            border-radius: 15px;
            padding: 2rem;
            margin: 1rem 0;
            height: 100%;
        }
        .stars {
            color: #ffc107;
        }
        .contact-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
        }
        .footer {
            background: #2c3e50;
            color: white;
        }
        .carousel-item {
            height: 500px;
        }
        .carousel-item img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        .section-title {
            position: relative;
            text-align: center;
            margin-bottom: 3rem;
            font-weight: bold;
        }
        .section-title::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
            width: 80px;
            height: 3px;
            background: #007bff;
        }
        .feature-icon {
            font-size: 3rem;
            color: #007bff;
            margin-bottom: 1rem;
        }
        .btn-custom {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border: none;
            border-radius: 25px;
            padding: 10px 30px;
            color: white;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        .btn-custom:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(0,0,0,0.2);
            color: white;
        }
    </style>
</head>
<body>
    <!-- Include Navbar -->
<%@include file="components/navbar.jsp" %>

<% Connection conn = DBConnect.getConn(); %>

    <!-- Image Carousel -->
    <div id="hospitalCarousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#hospitalCarousel" data-bs-slide-to="0" class="active"></button>
            <button type="button" data-bs-target="#hospitalCarousel" data-bs-slide-to="1"></button>
            <button type="button" data-bs-target="#hospitalCarousel" data-bs-slide-to="2"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://images.unsplash.com/photo-1551190822-a9333d879b1f?ixlib=rb-4.0.3&auto=format&fit=crop&w=2070&q=80" class="d-block w-100" alt="Hospital Building">
                <div class="carousel-caption d-none d-md-block">
                    <h2>Welcome to MediBridge</h2>
                    <p>Your trusted partner in healthcare management</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="https://images.unsplash.com/photo-1538108149393-fbbd81895907?ixlib=rb-4.0.3&auto=format&fit=crop&w=2128&q=80" class="d-block w-100" alt="Medical Team">
                <div class="carousel-caption d-none d-md-block">
                    <h2>Expert Medical Team</h2>
                    <p>Dedicated professionals committed to your health</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="https://images.unsplash.com/photo-1559757148-5c350d0d3c56?ixlib=rb-4.0.3&auto=format&fit=crop&w=2131&q=80" class="d-block w-100" alt="Modern Equipment">
                <div class="carousel-caption d-none d-md-block">
                    <h2>Modern Medical Equipment</h2>
                    <p>State-of-the-art technology for better healthcare</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#hospitalCarousel" data-bs-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#hospitalCarousel" data-bs-slide="next">
            <span class="carousel-control-next-icon"></span>
        </button>
    </div>

    <!-- Key Features Section -->
    <section class="py-5">
        <div class="container">
            <h2 class="section-title">Our Key Features</h2>
            <div class="row">
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-calendar-check feature-icon"></i>
                            <h4 class="card-title">Easy Appointment Booking</h4>
                            <p class="card-text">Book appointments with your preferred doctors online. Quick, easy, and convenient scheduling system.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-user-md feature-icon"></i>
                            <h4 class="card-title">Expert Doctors</h4>
                            <p class="card-text">Our team of experienced & qualified doctors provide the best medical care with modern treatments.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-ambulance feature-icon"></i>
                            <h4 class="card-title">Emergency Services</h4>
                            <p class="card-text">24/7 emergency medical services with rapid response team and state-of-the-art emergency equipment.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-pills feature-icon"></i>
                            <h4 class="card-title">Pharmacy Services</h4>
                            <p class="card-text">In-house pharmacy with all essential medicines and prescriptions fulfilled with quality assurance.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-microscope feature-icon"></i>
                            <h4 class="card-title">Advanced Lab Tests</h4>
                            <p class="card-text">Modern laboratory facilities with accurate diagnostic tests and quick result delivery.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card feature-card text-center">
                        <div class="card-body">
                            <i class="fas fa-bed feature-icon"></i>
                            <h4 class="card-title">Comfortable Rooms</h4>
                            <p class="card-text">Well-equipped patient rooms with modern amenities for comfortable stay during treatment.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Our Great Doctors Section -->
    <section class="py-5 bg-light">
        <div class="container">
            <h2 class="section-title">Our Great Doctors</h2>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card doctor-card">
                        <img src="assets/doctor_1.jpeg" class="doctor-img" alt=" Dr. Michael Chen">
                        <div class="card-body text-center">
                            <h5 class="card-title">Dr. Sarah Johnson</h5>
                            <p class="text-muted">Cardiologist</p>
                            <p class="small">MBBS, MD Cardiology</p>
                            <p class="card-text">"Dedicated to providing exceptional cardiac care with compassion, cutting-edge technology, and unmatched expertise."</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card doctor-card">
                        <img src="assets/doctor_2.jpeg" class="doctor-img" alt="Dr. Sarah Johnson">
                        <div class="card-body text-center">
                            <h5 class="card-title">Dr. Michael Chen</h5>
                            <p class="text-muted">Neurologist</p>
                            <p class="small">MBBS, MD Neurology</p>
                            <p class="card-text">"Committed to advancing neurological care through innovation and patient-centered treatment."</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card doctor-card">
                        <img src="assets/doctor_3.jpeg" class="doctor-img" alt="Dr. James Wilson">
                        <div class="card-body text-center">
                            <h5 class="card-title">Dr. Emily Rodriguez</h5>
                            <p class="text-muted">Pediatrician</p>
                            <p class="small">MBBS, MD Pediatrics</p>
                            <p class="card-text">"Ensuring the health and happiness of children with gentle and comprehensive care."</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card doctor-card">
                        <img src="assets/doctor_4.jpeg" class="doctor-img" alt="Dr. Emily Rodriguez">
                        <div class="card-body text-center">
                            <h5 class="card-title">Dr. James Wilson</h5>
                            <p class="text-muted">Orthopedic Surgeon</p>
                            <p class="small">MBBS, MS Orthopedics</p>
                            <p class="card-text">"Specializing in advanced orthopedic procedures to restore mobility and improve quality of life."</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Reviews Section -->
    <section class="py-5">
        <div class="container">
            <h2 class="section-title">What Our Patients Say</h2>
            <div class="row">
                <div class="col-lg-4 mb-4">
                    <div class="review-card">
                        <div class="stars mb-2">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <p class="mb-3">"Excellent service and professional staff. The doctors are very knowledgeable and caring. I highly recommend MediBridge for all healthcare needs."</p>
                        <div class="d-flex align-items-center">
                            <img src=assets/doctor_1.jpeg class="rounded-circle me-3" width="50" height="50" alt="Patient">
                            <div>
                                <h6 class="mb-0">Maria Garcia</h6>
                                <small class="text-muted">Patient</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 mb-4">
                    <div class="review-card">
                        <div class="stars mb-2">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <p class="mb-3">"The online appointment system is fantastic! Easy to use and the doctors are always on time. Great experience overall."</p>
                        <div class="d-flex align-items-center">
                            <img src="assets/doctor_3.jpeg" class="rounded-circle me-3" width="50" height="50" alt="Patient">
                            <div>
                                <h6 class="mb-0">John Smith</h6>
                                <small class="text-muted">Patient</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 mb-4">
                    <div class="review-card">
                        <div class="stars mb-2">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <p class="mb-3">"Clean facilities, modern equipment, and compassionate care. MediBridge has exceeded my expectations in every way."</p>
                        <div class="d-flex align-items-center">
                            <img src="https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&auto=format&fit=crop&w=150&q=100" class="rounded-circle me-3" width="50" height="50" alt="Patient">
                            <div>
                                <h6 class="mb-0">Lisa Anderson</h6>
                                <small class="text-muted">Patient</small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Us Section -->
    <section class="py-5 contact-section">
        <div class="container">
            <h2 class="section-title text-white">Contact Us</h2>
            <div class="row">
                <div class="col-lg-8 mx-auto">
                    <form>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <input type="text" class="form-control" placeholder="Your Name" required>
                            </div>
                            <div class="col-md-6 mb-3">
                                <input type="email" class="form-control" placeholder="Your Email" required>
                            </div>
                        </div>
                        <div class="mb-3">
                            <input type="text" class="form-control" placeholder="Subject" required>
                        </div>
                        <div class="mb-3">
                            <textarea class="form-control" rows="5" placeholder="Your Message" required></textarea>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-custom btn-lg">Send Message</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="footer py-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 mb-4">
                    <h5>MediBridge</h5>
                    <p>Your trusted partner in healthcare management. We provide comprehensive medical services with modern technology and compassionate care.</p>
                    <div class="social-links">
                        <a href="#" class="text-white me-3"><i class="fab fa-facebook-f"></i></a>
                        <a href="#" class="text-white me-3"><i class="fab fa-twitter"></i></a>
                        <a href="#" class="text-white me-3"><i class="fab fa-instagram"></i></a>
                        <a href="#" class="text-white me-3"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
                <div class="col-lg-2 mb-4">
                    <h6>Quick Links</h6>
                    <ul class="list-unstyled">
                        <li><a href="#" class="text-white-50">Home</a></li>
                        <li><a href="#" class="text-white-50">About</a></li>
                        <li><a href="#" class="text-white-50">Services</a></li>
                        <li><a href="#" class="text-white-50">Doctors</a></li>
                        <li><a href="#" class="text-white-50">Contact</a></li>
                    </ul>
                </div>
                <div class="col-lg-3 mb-4">
                    <h6>Services</h6>
                    <ul class="list-unstyled">
                        <li><a href="#" class="text-white-50">Emergency Care</a></li>
                        <li><a href="#" class="text-white-50">Surgery</a></li>
                        <li><a href="#" class="text-white-50">Laboratory</a></li>
                        <li><a href="#" class="text-white-50">Pharmacy</a></li>
                        <li><a href="#" class="text-white-50">Cardiology</a></li>
                    </ul>
                </div>
                <div class="col-lg-3 mb-4">
                    <h6>Contact Info</h6>
                    <ul class="list-unstyled text-white-50">
                        <li><i class="fas fa-map-marker-alt me-2"></i>123 Medical Street, Nagpur , Maharashtra</li>
                        <li><i class="fas fa-phone me-2"></i>+91-1234567891</li>
                        <li><i class="fas fa-envelope me-2"></i>info@medibridge.com</li>
                    </ul>	
                </div>
            </div>
            <hr class="my-4">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p class="text-white-50 mb-0">&copy; 2024 MediBridge. All rights reserved.</p>
                </div>
            </div>
        </div>
    <!-- Scripts are included in CDN file -->
</body>
</html>