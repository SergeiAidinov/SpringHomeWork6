package ru.yandex.incoming34.SpringHomeWork6.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import ru.yandex.incoming34.SpringHomeWork6.entities.StudentEntity;
import ru.yandex.incoming34.SpringHomeWork6.services.StudentService;

@RestController
@RequestMapping("/sudents")
public class StudentController {
	
	@Autowired
	StudentService studentService;
    

	@GetMapping("/all-students")
    Iterable<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }
	
	@GetMapping("/student-by-id")
    Optional<StudentEntity> studentById(@NotNull Long studentId) {
        return studentService.getStudentById(studentId);
    }
	
	@DeleteMapping("/delete-student")
	void deleteStudent(@NotNull Long studentId) {
		studentService.deleteStudentById(studentId);
	}
	
	@RequestMapping(value = "/unsubscribe-student", method = RequestMethod.DELETE)
	void unsubscribe (@NotNull Long studentId, @NotNull Long courseId) {
		studentService.unsubscribeStudent(studentId, courseId);
	}


}
