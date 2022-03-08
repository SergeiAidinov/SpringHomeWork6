--liquibase formatted sql
--changeset sergei:261de350-ec1f-44b9-9cd8-d42e96087751

INSERT INTO link_student_course (student_id, course_id) VALUES
(1, 1),
(2, 2),
(2, 3),
(3, 1),
(3, 3)
;

--rollback;