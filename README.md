# 🏥 ClinicOps

A **Java Console-Based Clinic Management System** that digitizes the daily operations of a small clinic named **TownClinic**. The application replaces paper-based records with a structured system for managing **Doctors**, **Patients**, **Appointments**, **Audit Logs**, and **Bulk Data Import**.

The project is designed as a **learning-oriented application** to demonstrate **Core Java**, **Object-Oriented Programming**, **Collections Framework**, **Java Streams**, **Exception Handling**, **File Handling**, **Logging**, and **Software Design Principles** through incremental real-world use cases.

---

# 📖 Project Scope

ClinicOps is a console-based application that helps manage the lifecycle of a patient visit—from doctor registration to appointment booking and audit logging.

The application supports two primary user roles:

- 👨‍⚕️ Clinic Administrator
- 👩‍💼 Front Desk Executive

The project gradually evolves from a simple console menu into a modular, enterprise-style Java application.

---

# ✨ Features

## Clinic Administrator

- Register Doctors
- Bulk Import Doctors from CSV
- View Registered Doctors
- View Audit Logs
- Logout

---

## Front Desk Executive

- Register Patients
- Prevent Duplicate Patient Registration
- View Patients
- Book Appointments
- Book Appointments based on Specialization
- Shift-aware Appointment Booking
- Logout

---

## Logging

- Audit Logging
- Functional Logging
- Error Logging
- Security Logging
- Log4j Integration

---

# 🛠 Technologies Used

- Java 17+
- Object-Oriented Programming
- Java Collections Framework
- Java Stream API
- File Handling
- OpenCSV (Optional)
- Regular Expressions
- Log4j2
- IntelliJ IDEA
- Git
- GitHub

---

# 📂 Project Structure

```
ClinicOps
│
├── src
│
├── model
│     ├── Doctor.java
│     ├── Patient.java
│     ├── Appointment.java
│     ├── Shift.java
│     └── Specialization.java
│
├── menu
│     ├── AdminMenu.java
│     └── FrontDeskMenu.java
│
├── util
│     ├── ScannerHelper.java
│     ├── FileHandler.java
│     └── AuditLogger.java
│
├── resources
│     └── log4j2.xml
│
├── ClinicApp.java
│
├── README.md
└── doctors.csv
```

---

# 📚 User Stories

## User Story 1

### Clinic Administrator

- Register Doctors
- Bulk Import Doctors
- View Audit Logs
- Persistent Doctor Records

---

## User Story 2

### Bulk Doctor Import

- Import CSV Files
- Validate Doctor Data
- Prevent Duplicate Doctors

---

## User Story 3

### Patient Registration

- Register Patients
- Mobile Number Validation
- Auto-generated Patient ID

---

## User Story 4

### Appointment Booking

- Book Appointment
- Book Based on Doctor Availability
- Book Based on Specialization
- Shift-aware Appointment Booking

---

## User Story 5

### Audit Logging

- Functional Logging
- Error Logging
- Security Logging
- Log4j Migration

---

# 🚀 Use Cases

## ✅ UC1 – Console-Based Menu

### Features

- Role Selection
- Admin Menu
- Front Desk Menu
- Logout

### Concepts

- Switch Case
- Modularization
- State Management
- Scanner Handling

---

## ✅ UC2 – Doctor Registration

### Features

- Register Doctors
- View Doctors

### Concepts

- Static Variables
- Input Validation
- Method Extraction

---

## ✅ UC3 – Doctor Object Model

### Features

- Doctor Class
- Auto-generated Doctor ID
- ArrayList Storage

### Concepts

- Encapsulation
- Constructors
- toString()
- ArrayList

---

## ✅ UC4 – Enums

### Features

- Shift Enum
- Specialization Enum

### Concepts

- Enum
- Generics
- values()

---

## ✅ UC5 – Bulk CSV Import

### Features

- Import Doctors
- CSV Parsing

### Concepts

- BufferedReader
- FileReader
- split()
- Try-with-Resources

---

## ✅ UC6 – OpenCSV Integration

### Features

- CSV Library
- Duplicate Detection
- Record Validation

### Concepts

- OpenCSV
- File Parsing

---

## ✅ UC7 – Patient Registration

### Features

- Register Patients
- Auto-generated Patient ID
- Mobile Validation

### Concepts

- Regex
- ArrayList
- Object Creation

---

## ✅ UC8 – Prevent Duplicate Patient Registration

### Features

- Search by Mobile Number
- Duplicate Detection

### Concepts

- Linear Search
- Getters
- Encapsulation

---

## ✅ UC9 – Appointment Booking

### Features

- Appointment Creation
- Random Doctor Allocation
- Slot Blocking

### Concepts

- Object Composition
- Random Class
- ArrayList

---

## ✅ UC10 – Specialization-based Appointment Booking

### Features

- Filter Doctors
- Stream API
- Specialization Matching

### Concepts

- Stream API
- filter()
- anyMatch()
- findFirst()

---

## ✅ UC11 – Shift-aware Appointment Booking

### Features

- Morning Shift
- Evening Shift
- Both Shift

### Concepts

- Predicate Chaining
- Stream Filters
- Business Rules

---

## ✅ UC12 – Audit Logging Infrastructure

### Features

- Audit Logger
- Timestamp Logging

### Concepts

- LocalDateTime
- ArrayList
- Utility Classes

---

## ✅ UC13 – Functional Logging

### Features

- Business Event Logging
- Appointment Logging
- Doctor Registration Logging

### Concepts

- Event-driven Programming

---

## ✅ UC14 – Error & Security Logging

### Features

- Invalid Mobile Tracking
- CSV Failure Logging
- Security Alerts

### Concepts

- Exception Handling
- Defensive Programming

---

## ✅ UC15 – Log4j Migration

### Features

- Professional Logging
- Console Logs
- File Logs

### Concepts

- Log4j2
- Dependency Management
- Refactoring

---

# 📖 Concepts Covered

## Core Java

- Classes
- Objects
- Constructors
- Packages
- Access Modifiers
- Enums
- Utility Classes

---

## Object-Oriented Programming

- Encapsulation
- Composition
- Abstraction
- Constructor
- toString()

---

## Java Collections

- ArrayList
- List
- Stream API

---

## Java Streams

- stream()
- filter()
- anyMatch()
- findFirst()
- collect()

---

## File Handling

- FileReader
- BufferedReader
- CSV Parsing
- Try-with-Resources

---

## Exception Handling

- try
- catch
- finally
- throw
- throws

---

## Logging

- Audit Logging
- Functional Logging
- Security Logging
- Error Logging
- Log4j2

---

## Regular Expressions

- Indian Mobile Number Validation
- Input Validation

---

## Design Principles

- Single Responsibility Principle
- Separation of Concerns
- Modular Programming
- Defensive Programming
- Event-driven Design

---

# ▶️ How to Run

## Clone Repository

```bash
git clone https://github.com/BL-Anbu/ClinicOps.git
```

---

## Open Project

Open using:

- IntelliJ IDEA
- Eclipse

---

## Compile

```bash
javac ClinicApp.java
```

---

## Run

```bash
java ClinicApp
```

---

# 📸 Sample Console Flow

```
=========== TownClinic ===========
1. Clinic Admin
2. Front Desk Executive
3. Exit

Enter Choice :
```

---

```
----- CLINIC ADMIN MENU -----

1. Doctor Data Entry
2. Bulk Data Entry
3. View Audit Logs
4. Display Doctors
5. Logout
```

---

```
----- FRONT DESK MENU -----

1. Register Patient
2. Book Appointment
3. View Patients
4. Logout
```

---

# 🎯 Learning Outcomes

By completing this project, you will learn:

- Core Java
- OOP
- Java Collections
- Stream API
- File Handling
- Logging Frameworks
- Regex Validation
- Exception Handling
- Modular Design
- Console Application Development
- Real-world Business Logic Implementation

---

# 🚀 Future Enhancements

- MySQL Database Integration
- Spring Boot REST APIs
- Spring Data JPA
- Spring Security
- JWT Authentication
- Hibernate ORM
- Kafka Notifications
- Docker Support
- Appointment Cancellation
- Doctor Availability Calendar
- SMS & Email Notifications
- Patient Medical History
- Billing Module
- Dashboard UI (React/Angular)
- Microservices Architecture

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

```bash
git checkout -b feature/new-feature
```

3. Commit your changes

```bash
git commit -m "Added new feature"
```

4. Push the branch

```bash
git push origin feature/new-feature
```

5. Open a Pull Request

---

# 👨‍💻 Author

**Anbarasu A**

- Java Full Stack Developer
- Spring Boot Developer
- GitHub: https://github.com/BL-Anbu

---

# ⭐ Support

If you found this project useful, don't forget to ⭐ **Star** this repository.

---

# 📄 License

This project is developed for **educational and learning purposes**.
