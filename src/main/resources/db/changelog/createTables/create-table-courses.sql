--liquibase formatted sql
--changeset sergei:e8eb420d-9319-4f06-93b3-6ff7957b4033

CREATE TABLE IF NOT EXISTS courses(
id BIGINT AUTO_INCREMENT, 
name VARCHAR(45) UNIQUE NOT NULL,
PRIMARY KEY (id)
);

--rollback DROP TABLE courses;