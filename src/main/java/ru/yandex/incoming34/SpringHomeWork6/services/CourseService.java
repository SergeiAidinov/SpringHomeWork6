package ru.yandex.incoming34.SpringHomeWork6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.yandex.incoming34.SpringHomeWork6.entities.CourseEntity;
import ru.yandex.incoming34.SpringHomeWork6.repos.CourseRepo;

@Component
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;

	public Iterable<CourseEntity> getAllCourses() {
		return courseRepo.findAll();
	}


}
