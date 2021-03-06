package ru.yandex.incoming34.SpringHomeWork6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.incoming34.SpringHomeWork6.entities.CourseBriefEntity;
import ru.yandex.incoming34.SpringHomeWork6.entities.CourseEntity;
import ru.yandex.incoming34.SpringHomeWork6.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/all-courses")
	public Iterable<CourseBriefEntity> getAllCourses() {
		return courseService.getAllCoursesWithoutStudents();
	}
	
	@GetMapping("/all-courses-with-students")
	public Iterable<CourseEntity> getAllCoursesWithStudents() {
		return courseService.getAllCoursesWithStudents();
	}

}
