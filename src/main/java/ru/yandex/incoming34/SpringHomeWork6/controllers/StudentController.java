package ru.yandex.incoming34.SpringHomeWork6.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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


}
