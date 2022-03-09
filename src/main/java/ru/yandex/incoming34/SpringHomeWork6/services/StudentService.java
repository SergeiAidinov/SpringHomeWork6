package ru.yandex.incoming34.SpringHomeWork6.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.yandex.incoming34.SpringHomeWork6.entities.StudentEntity;
import ru.yandex.incoming34.SpringHomeWork6.repos.StudentRepo;

@Component
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	public Iterable<StudentEntity> getAllStudents() {
		return studentRepo.findAllStudents();
	}

	public Optional<StudentEntity> getStudentById(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findStudentById(studentId);
	}

}
