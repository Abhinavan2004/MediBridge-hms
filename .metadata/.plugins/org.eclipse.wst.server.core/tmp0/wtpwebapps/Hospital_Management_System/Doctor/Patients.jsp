<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page
	import="com.DAO.AppointmentDao, com.DAO.DoctorDao, com.db.DBConnect, com.entity.Appointment_entity, com.entity.User, com.entity.Doctor_entity, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MediBridge : View Patients</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	rel="stylesheet">
<style>
body {
	background: linear-gradient(135deg, #e3f2fd 0%, #f5f5f5 100%);
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	margin: 0;
}

.hero-section {
	background: linear-gradient(135deg, #2c5f7c 0%, #1e4a61 100%);
	height: 200px;
	position: relative;
	overflow: hidden;
}

.hero-section::before {
	content: '';
	position: absolute;
	top: -50%;
	right: -10%;
	width: 300px;
	height: 300px;
	background: rgba(52, 152, 219, 0.3);
	border-radius: 20px;
	transform: rotate(45deg);
}

.hero-section::after {
	content: '';
	position: absolute;
	bottom: -20%;
	right: 5%;
	width: 200px;
	height: 200px;
	background: rgba(52, 152, 219, 0.2);
	border-radius: 15px;
	transform: rotate(30deg);
}

.main-container {
	margin-top: -80px;
	position: relative;
	z-index: 10;
}

.appointment-card {
	background: white;
	border-radius: 15px;
	box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
	padding: 30px;
	margin-bottom: 30px;
	position: relative;
	overflow: hidden;
}

.appointment-card::before {
	content: '';
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	height: 4px;
	background: linear-gradient(90deg, #28a745, #20c997, #17a2b8);
}

.card-title {
	color: #28a745;
	font-size: 2rem;
	font-weight: 600;
	text-align: center;
	margin-bottom: 40px;
	position: relative;
}

.card-title::after {
	content: '';
	position: absolute;
	bottom: -10px;
	left: 50%;
	transform: translateX(-50%);
	width: 80px;
	height: 3px;
	background: linear-gradient(90deg, #28a745, #20c997);
	border-radius: 2px;
}

.table-responsive {
	border-radius: 10px;
	overflow: hidden;
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.08);
}

.custom-table {
	margin: 0;
	background: white;
}

.custom-table thead {
	background: linear-gradient(135deg, #28a745, #20c997);
	color: white;
}

.custom-table th {
	border: none;
	padding: 15px 12px;
	font-weight: 600;
	text-align: center;
	font-size: 0.9rem;
	letter-spacing: 0.5px;
}

.custom-table td {
	padding: 15px 12px;
	text-align: center;
	vertical-align: middle;
	border-bottom: 1px solid #f1f3f4;
	font-size: 0.9rem;
}

.custom-table tbody tr {
	transition: all 0.3s ease;
}

.custom-table tbody tr:hover {
	background-color: #f8f9fa;
	transform: translateY(-1px);
}

.status-badge {
	padding: 6px 12px;
	border-radius: 20px;
	font-size: 0.8rem;
	font-weight: 600;
	text-transform: uppercase;
	letter-spacing: 0.5px;
}

.status-ok {
	background-color: #d4edda;
	color: #155724;
	border: 1px solid #c3e6cb;
}

.status-pending {
	background-color: #fff3cd;
	color: #856404;
	border: 1px solid #ffeaa7;
}

.doctor-image-section {
	position: relative;
}

.doctor-image {
	width: 100%;
	max-width: 300px;
	height: auto;
	border-radius: 15px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
	transition: transform 0.3s ease;
}

.doctor-image:hover {
	transform: translateY(-5px);
}

.floating-elements {
	position: absolute;
	top: 20px;
	right: 20px;
	opacity: 0.1;
}

.floating-elements i {
	font-size: 2rem;
	color: #28a745;
	margin: 0 10px;
	animation: float 3s ease-in-out infinite;
}

.floating-elements i:nth-child(2) {
	animation-delay: 1s;
}

.floating-elements i:nth-child(3) {
	animation-delay: 2s;
}

@
keyframes float { 0%, 100% {
	transform: translateY(0px);
}

50
%
{
transform
:
translateY(
-10px
);
}
}
.stats-card {
	background: linear-gradient(135deg, #28a745, #20c997);
	color: white;
	border-radius: 15px;
	padding: 20px;
	text-align: center;
	box-shadow: 0 5px 15px rgba(40, 167, 69, 0.3);
	margin-bottom: 20px;
}

.stats-number {
	font-size: 2.5rem;
	font-weight: bold;
	margin-bottom: 5px;
}

.stats-label {
	font-size: 0.9rem;
	opacity: 0.9;
	text-transform: uppercase;
	letter-spacing: 1px;
}

.no-appointments {
	text-align: center;
	padding: 40px 20px;
	color: #6c757d;
}

.no-appointments i {
	font-size: 3rem;
	margin-bottom: 20px;
	color: #dee2e6;
}

@media ( max-width : 768px) {
	.appointment-card {
		margin: 15px;
		padding: 20px;
	}
	.custom-table th, .custom-table td {
		padding: 10px 8px;
		font-size: 0.8rem;
	}
	.card-title {
		font-size: 1.5rem;
	}
	.doctor-image {
		max-width: 250px;
	}
}
</style>
</head>
<body>
	<%@ include file="../Doctor/navbar_doctor.jsp"%>

	<!-- Hero Section -->
	<div class="hero-section">
		<div class="floating-elements">
			<i class="fas fa-heartbeat"></i> <i class="fas fa-user-md"></i> <i
				class="fas fa-calendar-check"></i>
		</div>
	</div>

	<!-- Main Container -->
	<div class="container main-container">
		<div class="row">
			<!-- Appointment Table Section -->
			<div class="col-lg-8 col-md-12">
				<div class="appointment-card">
					<h2 class="card-title">
						<i class="fas fa-calendar-alt me-2"></i> Patients List
					</h2>

					<%
					Doctor_entity doct_id = (Doctor_entity) session.getAttribute("doctObj");
					if (doct_id != null) {
						AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
						DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
						List<Appointment_entity> list = dao.getAllPatients(doct_id.getId());

						if (list != null && !list.isEmpty()) {
					%>

					<div class="table-responsive">
						<table class="table custom-table">
							<thead>
								<tr>
									<th>Full Name</th>
									<th>Gender</th>
									<th>Age</th>
									<th>Appoint Date</th>
									<th>Diseases</th>
									<th>Doctor Name</th>
									<th>Status</th>
								</tr>
							</thead>
							<tbody>
								<%
								int totalAppointments = list.size();
								int completedAppointments = 0;

								for (Appointment_entity ap : list) {
									Doctor_entity d = dao2.getDoctorDetails(ap.getDoct_id());
									if ("Completed".equals(ap.getApp_status())) {
										completedAppointments++;
									}
								%>
								<tr>
									<td><strong><%=ap.getApp_name()%></strong></td>
									<td><%=ap.getApp_gender()%></td>
									<td><%=ap.getApp_age()%></td>
									<td><%=ap.getApp_date()%></td>
									<td><%=ap.getApp_cond()%></td>
									<td><%=ap.getApp_contact()%></td>
									<td>
										<%
										if ("Pending".equals(ap.getApp_status())) {
										%> <span
										class="status-badge status-pending">Pending</span> <%
 } else if ("Completed".equals(ap.getApp_status())) {
 %> <span
										class="status-badge status-ok">Completed</span> <%
 } else {
 %> <span
										class="status-badge status-ok"><%=ap.getApp_status()%></span>
										<%
										}
										%>

									</td>
									<td><a href="comment.jsp?id=<%=ap.getId() %>" class="btn btn-success btn-sm">Comment</td>

								</tr>
								<%
								}
								%>
							</tbody>
						</table>
					</div>

					<%
					} else {
					%>
					<div class="no-appointments">
						<i class="fas fa-calendar-times"></i>
						<h4>No Appointments Found</h4>
						<p>You haven't booked any appointments yet.</p>
						<a href="../User/User_index.jsp" class="btn btn-success">Book
							Your First Appointment</a>
					</div>
					<%
					}
					} else {
					%>
					<div class="no-appointments">
						<i class="fas fa-user-times"></i>
						<h4>Please Login</h4>
						<p>You need to login to view your appointments.</p>
						<a href="../User/user_login.jsp" class="btn btn-primary">Login
							Now</a>
					</div>
					<%
					}
					%>
				</div>
			</div>

			<!-- Doctor Image and Stats Section -->
			<div class="col-lg-4 col-md-12">
				<div class="doctor-image-section text-center mb-4">
					<img
						src="https://images.unsplash.com/photo-1612349317150-e413f6a5b16d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1000&q=80"
						alt="Doctor" class="doctor-image">
				</div>

				<%
				Doctor_entity statsUser = (Doctor_entity) session.getAttribute("doctObj");
				if (statsUser != null) {
					AppointmentDao statsDao = new AppointmentDao(DBConnect.getConn());
					List<Appointment_entity> statsList = statsDao.getAllPatients(statsUser.getId());
					int totalCount = statsList != null ? statsList.size() : 0;
					int completedCount = 0;

					if (statsList != null) {
						for (Appointment_entity ap : statsList) {
					if ("Completed".equals(ap.getApp_status())) {
						completedCount++;
					}
						}
					}
				%>

				<div class="stats-card">
					<div class="stats-number"><%=totalCount%></div>
					<div class="stats-label">Total Appointments</div>
				</div>

				<div class="stats-card"
					style="background: linear-gradient(135deg, #17a2b8, #20c997);">
					<div class="stats-number"><%=completedCount%></div>
					<div class="stats-label">Completed</div>
				</div>

				<%
				} else {
				%>
				<div class="stats-card">
					<div class="stats-number">0</div>
					<div class="stats-label">Total Appointments</div>
				</div>

				<div class="stats-card"
					style="background: linear-gradient(135deg, #17a2b8, #20c997);">
					<div class="stats-number">0</div>
					<div class="stats-label">Completed</div>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>