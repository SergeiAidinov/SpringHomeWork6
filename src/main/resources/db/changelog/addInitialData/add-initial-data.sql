--liquibase formatted sql
--changeset sergei:ea200776-dd6e-4c88-b15e-235dc190b78c

INSERT INTO students (name) VALUES('Winnie-the-Pooh'), ('Piglet'), ('Eeyore');
INSERT INTO courses (name) VALUES('Java'), ('Spring'), ('SQL');

--rollback;