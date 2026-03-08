 Employee Attendance Management System

 Project Overview : -

The Employee Attendance Management System is a smart backend application built using Java and Spring Boot that automatically marks employee attendance based on location.

The system verifies whether an employee is within a 15-meter radius of the office location. If the employee is inside this range, the system automatically records the attendance.

This project demonstrates backend development skills including REST API development, geolocation logic, database integration, and secure application design.

---

🚀 Key Features

✔ Automatic attendance marking based on location
✔ 15-meter office radius verification
✔ Secure API access using authentication
✔ Employee attendance tracking
✔ RESTful API architecture
✔ Database integration for storing attendance data

---

🧠 How It Works

1. Employee sends their current location coordinates.
2. The system calculates the distance between employee location and office location.
3. If the employee is within 15 meters, attendance is automatically marked.
4. If outside the radius, attendance is not recorded.

This ensures accurate and location-based attendance management.

---

🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Spring Security
- Maven
- Postman (API testing)

---

🏗 Project Architecture

The application follows a layered architecture:

Controller → Service → Repository → Database

This architecture ensures clean code structure, scalability, and maintainability.

---

📂 Project Structure

src
├── controller
├── service
├── repository
├── entity
├── security
└── config

---

⚙️ Setup & Installation

1. Clone the repository

git clone https://github.com/Mthakur-123/employee-attendance-system.git

2. Open the project in Spring Tool Suite / IntelliJ

3. Configure database in "application.properties"

4. Run the Spring Boot application

5. Test APIs using Postman

📖 Learning Outcomes

Through this project I learned:

- Building scalable REST APIs using Spring Boot
- Implementing location-based business logic
- Integrating MySQL database with Spring Data JPA
- Applying authentication and security practices
- Designing a clean layered architecture
