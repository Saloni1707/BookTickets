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
- **Framework:** (Eventually Spring Boot )
- **Build Tool:** Gradle 
- **Database:** MySQL 
- **REST API:** Implemented using Java Servlets for now
- **JSON Parser:** Jackson (for data serialization)
- **ORM:** (Figuring out)

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
