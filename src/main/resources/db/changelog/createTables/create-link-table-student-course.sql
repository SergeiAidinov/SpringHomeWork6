--liquibase formatted sql
--changeset sergei:a45f96e9-6856-4859-9c4b-6eeaedba682f

CREATE TABLE IF NOT EXISTS link_student_course(
id BIGINT AUTO_INCREMENT, 
student_id BIGINT,
course_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (student_id) REFERENCES students (id) ON UPDATE RESTRICT,
FOREIGN KEY (course_id) REFERENCES courses (id) ON UPDATE RESTRICT,
UNIQUE KEY `link` (student_id, course_id)
);

--rollback DROP TABLE link_student_course;