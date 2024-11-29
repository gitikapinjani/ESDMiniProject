# Admin Department - Course Management Feature

## Overview
This mini-project focuses on enabling employees of the **Admin Department** to log in and manage course details. The system allows authenticated employees to create and update courses with essential attributes such as credits, capacity, schedule, specialization, and prerequisites.

The project is built with *Spring Boot* for backend logic and *React* for frontend interaction.

---

## Features
- **Secure Employee Login**: Employees in the Admin Department can log in to access the system.
- **Course Management**: Add or update course details including:
  - Credits
  - Capacity
  - Schedule
  - Specialization (via dropdown selection)
  - Prerequisites (selected from existing courses)
- **Validation and Constraints**: Enforce rules on input fields to ensure accurate data entry.
- **Interactive UI**: User-friendly interfaces for course creation and management.

---

## Tech Stack
- **Frontend**: React, Bootstrap
- **Backend**: Spring Boot, REST APIs
- **Database**: MySQL
- **Authentication**: JWT Tokens

---

## Project Structure
- **Frontend**:  
  - Tech Stack: React, Bootstrap  
  - Directory: `/admin-course-react`  

- **Backend**:  
  - Tech Stack: Spring Boot, JPA, Hibernate  
  - Directory: `/Admin_Course_Backend`  

---

## Setup Instructions

### Prerequisites
- **Frontend**:
  - Node.js and npm installed  
- **Backend**:
  - Java Development Kit (JDK) installed  
  - Maven configured  
- **Database**:
  - MySQL configured and running  

---

### Frontend Setup
1. Navigate to the `/admin-course-react` directory.  
2. Install dependencies:  
   ```bash
   npm install
