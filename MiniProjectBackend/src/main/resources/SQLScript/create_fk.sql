-- Foreign Key for course_prerequistic
ALTER TABLE course_prerequistic
    ADD CONSTRAINT fk_course_prerequistic_course
        FOREIGN KEY (course) REFERENCES courses(course_id);

ALTER TABLE course_prerequistic
    ADD CONSTRAINT fk_course_prerequistic_prerequisite
        FOREIGN KEY (prerequisite) REFERENCES courses(course_id);

-- Foreign Key for course_schedule
ALTER TABLE course_schedule
    ADD CONSTRAINT fk_course_schedule_course
        FOREIGN KEY (course_id) REFERENCES courses(course_id);

-- Foreign Key for login
ALTER TABLE login
    ADD CONSTRAINT fk_login_employee
        FOREIGN KEY (email) REFERENCES employees(employee_id);

-- Foreign Key for specialization_course
ALTER TABLE specialization_course
    ADD CONSTRAINT fk_specialization_course_specialization
        FOREIGN KEY (specialization_id) REFERENCES specialization(specialization_id);

ALTER TABLE specialization_course
    ADD CONSTRAINT fk_specialization_course_course
        FOREIGN KEY (course_id) REFERENCES courses(course_id);
