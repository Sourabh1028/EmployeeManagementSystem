# Employee_Management_System

<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This is a backend API built using the Spring framework that handles various HTTP requests for an Employee Management System. The API allows users to manage employee information such as personal details, job roles, salary information, and more.

---
<br>

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The employee data model is defined in the User class, which has the following attributes:
```
Id : unique identifier for each employee
firstName : first of the employee
lastName : last of the employee
email : employee email
phoneNumber : number of the employee
role : role of employee
salary : salary of employee
```

---

## Data Flow

```
The employee sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-


* PostMapping: "/addEmployee"
```
In database we add a new user given through API.
```

* GetMapping: "/getAll"
```
This endpoint gives us the data of all employees stored in our data baase
```

* GetMapping: "/getAll/{id}"
```
This endpoint returns data of specific employee based on employeeid through API
```

* PutMapping: "/update/{id}"
```
In database we update a employee by userid given through API.
```

* DeleteMapping "/remove"
```
In database we delete a employee by userid given through API.
```

---

## DataBase Used
* MySQL
```
We have used MySQL as a database to implement CRUD Operations.
```
---

## Project Summary

The Employee Management System using Spring Boot is a user-friendly and efficient application that streamlines the management of employee data. This application provides an easy-to-use interface for HR personnel to manage employee information, and also allows employees to view and update their own personal details. With its advanced features such as reporting and user management, this application is a valuable tool for any organisation looking to manage their employee data effectively.

