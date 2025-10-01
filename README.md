# MediBridge HMS

**MediBridge-HMS** (Hospital Management System) is a Java-based web application built using **Servlets, JSP, JDBC, and DAO architecture**. It helps streamline hospital operations such as patient registration, doctor management, appointments, and user authentication.
  

---

## Table of Contents

- [About the Project](#about-the-project)  
- [Features](#features)  
- [Tech Stack](#tech-stack)  
- [Repository Structure](#repository-structure)  
- [Setup & Installation](#setup--installation)  
- [Usage](#usage)  
- [Contributing](#contributing)  
- [Contact](#contact)  

---

## About the Project

MediBridge-HMS aims to streamline hospital operations by digitizing and automating workflows. It enables roles such as admin, doctors patients to interact securely and efficiently. The goal is to reduce manual errors, speed up processes, and provide a user-friendly interface for hospital management.

---

## ✨ Features

- 👨‍⚕️ **Doctor Module**  
  - Doctor registration, login, logout  
  - View/update doctor details  
  - Manage patient appointments  

- 👤 **User (Patient) Module**  
  - User signup/login  
  - Book, view, cancel appointments  
  - View doctors, update profile  

- 🛠 **Admin Module**  
  - Manage doctors and patients  
  - Approve/Reject appointments  
  - View all system records  

- 📅 **Appointments**  
  - Book, update, cancel  
  - Track appointment history  

- 🔐 **Authentication & Security**  
  - Role-based access (Admin, Doctor, User)  
  - Session management  )  


---

##  🛠 Tech Stack

Here is a sample tech stack — update this section to reflect what you actually used:

- Backend: Java , Servlets , JDBC 
- Database: MySQL  
- Server: Apache Tomcat 9
- Frontend: JSP , HTML , BootStrap CSS , Javascript   
- Authentication: HTTP Session-based    
- Others: Eclipse IDE , Postman.  


---

## Setup & Installation

### Prerequisites

- Install **Java JDK 8+**  
- Install **Apache Tomcat 9+**  
- Install **MySQL** database  
- Install **Maven** 
- Install **Eclipse IDE**

### Clone the repository

```bash
git clone https://github.com/Abhinavan2004/MediBridge-hms.git
cd MediBridge-hms
```
### Database Setup

1.  Create a MySQL database:
    `CREATE DATABASE hospital_db;`

2.  Import tables.

3.  Update DB credentials in `com.db.DBConnect.java`:

    `private static final String url = "jdbc:mysql://localhost:3306/hospital_db"; private static final String user = "your_username"; private static final String pass = "your_password";`

### Build & Deploy

`mvn clean install`

-   Deploy the WAR file to Tomcat (`target/MediBridge-hms.war`)

-   Or run via IDE (Eclipse/IntelliJ) on Tomcat server

## ▶️ Usage

-   Start MySQL & Tomcat server

-   Open app in browser:
    `http://localhost:8080/MediBridge-hms`

-   Login as:
    -   **Admin** → manage doctors & patients
    -   **Doctor** → view dashboard, update records
    -   **User/Patient** → book/view appointments

```scss

![Homepage screenshot](docs/screenshots/homepage.png)
![Patient dashboard](docs/screenshots/patient-dashboard.png)
```

## 🙏Contributing
Contributions are welcome! To contribute:

- Fork the project
- Create a new feature branch: `git checkout -b feat/YourFeature`
- Commit your changes: `git commit -m "feat: add your feature"`
- Push branch: `git push origin feat/YourFeature`
- Open a Pull Request

---
## 📧 Contact

**Author:** Abhinavan2004

-   GitHub Profile: [Abhinavan2004](https://github.com/Abhinavan2004)
-   Project Repo: [MediBridge-hms](https://github.com/Abhinavan2004/MediBridge-hms)


