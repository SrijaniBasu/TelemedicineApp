# TelemedicineApp

A simple **console-based Java application** that simulates a basic telemedicine system for **doctor–patient registration and appointment booking**.

---

## Features

- **User registration**
  - Register as a **Doctor** (name, email, password, specialization)
  - Register as a **Patient** (name, email, password)

- **User login**
  - Login as **Doctor**
  - Login as **Patient**

- **Appointment management (Patient side)**
  - View list of available doctors
  - Book an appointment with a selected doctor (date & time as free text)
  - View all booked appointments (printed in the console)

- **In-memory storage**
  - Doctors, patients, and appointments are stored in Java `List`s during program execution (no database).

---

## Project Structure

All source files are under `src/`:

- `Main.java` – Entry point; shows menus, handles user input.
- `TelemedicineSystem.java` – Core logic for:
  - registering doctors and patients  
  - logging in users  
  - booking and listing appointments
- `User.java` – Base class for users (id, name, email, password).
- `Doctor.java` – Extends `User`, adds `specialization`.
- `Patient.java` – Extends `User`, represents patient accounts.
- `Appointment.java` – Represents an appointment (appointmentId, patientId, doctorId, dateTime).

---

## Prerequisites

- **Java 8+** installed
- A terminal / command prompt
- (Optional) An IDE like IntelliJ IDEA or VS Code with Java support

---

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/SrijaniBasu/TelemedicineApp.git
cd TelemedicineApp
