# 🎟️ Ticket Booking System (Backend - Java)

A simple and scalable backend system for booking tickets, built with Java. This project handles core functionalities like managing users, events, and ticket reservations.
(Here this is still under development :)
---

## 🚀 Features

- ✅ User registration & login
- ✅ View available events/shows
- ✅ Book tickets 
- ✅ Cancel tickets
- ✅ View booking history
- ✅ Admin controls for event creation

---

## 🛠️ Tech Stack

- **Backend:** Java 11+
- **Framework:** (Optional: Spring Boot / Plain Java)
- **Build Tool:** Gradle / Maven
- **Database:** MySQL / H2 / PostgreSQL
- **REST API:** Implemented using Java Servlets / Spring Controllers
- **JSON Parser:** Jackson (for data serialization)
- **ORM:** (Optional: Hibernate / JPA)

---

## 📁 Project Structure

```bash
BookTickets/
│
├── src/
│   └── main/
│       └── java/
│           ├── controllers/      # API endpoints
│           ├── models/           # POJOs: User, Ticket, Event
│           ├── services/         # Business logic
│           ├── repositories/     # Data access layer
│           └── App.java          # Main entry point
├── resources/                    # application.properties, configs
├── build.gradle / pom.xml        # Dependencies
└── README.md
