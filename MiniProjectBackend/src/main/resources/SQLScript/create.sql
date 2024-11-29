create database esdminiproject;
use esdminiproject;


CREATE TABLE course_prerequistic (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     course BIGINT NOT NULL,
                                     prerequisite BIGINT NOT NULL
);

CREATE TABLE courses (
                         course_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         course_code VARCHAR(255) NOT NULL UNIQUE,
                         name VARCHAR(255) NOT NULL,
                         description TEXT NOT NULL,
                         year VARCHAR(255) NOT NULL,
                         term VARCHAR(255) NOT NULL,
                         faculty_name VARCHAR(255) NOT NULL,
                         credits INT NOT NULL,
                         capacity INT NOT NULL
);

CREATE TABLE course_schedule (
                                 id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 course_id BIGINT NOT NULL,
                                 time VARCHAR(255) NOT NULL,
                                 day VARCHAR(255) NOT NULL,
                                 room VARCHAR(255) NOT NULL,
                                 building VARCHAR(255) NOT NULL
);

CREATE TABLE employees (
                           employee_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           first_name VARCHAR(255) NOT NULL,
                           last_name VARCHAR(255),
                           email VARCHAR(255) NOT NULL UNIQUE,
                           title VARCHAR(255) NOT NULL,
                           department VARCHAR(255) NOT NULL
);

CREATE TABLE login (
                       login_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       email BIGINT NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE specialization (
                                specialization_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                code VARCHAR(255) NOT NULL UNIQUE,
                                name VARCHAR(255) NOT NULL,
                                description TEXT NOT NULL,
                                year VARCHAR(255) NOT NULL,
                                credits_required VARCHAR(255) NOT NULL
);

CREATE TABLE specialization_course (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       specialization_id BIGINT NOT NULL,
                                       course_id BIGINT NOT NULL
);
