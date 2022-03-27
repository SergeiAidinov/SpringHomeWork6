package ru.yandex.incoming34.SpringHomeWork6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.yandex.incoming34.SpringHomeWork6.entities.CourseBriefEntity;
import ru.yandex.incoming34.SpringHomeWork6.entities.CourseEntity;
import ru.yandex.incoming34.SpringHomeWork6.repos.CourseRepo;

@Component
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;

	public Iterable<CourseEntity> getAllCoursesWithStudents() {
		return courseRepo.findAllCoursesWithStudents();
	}
	
	public Iterable<CourseBriefEntity> getAllCoursesWithoutStudents() {
		return courseRepo.findAllCoursesWithoutStudents();
	}


}
