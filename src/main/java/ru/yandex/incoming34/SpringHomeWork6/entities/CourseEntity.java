package ru.yandex.incoming34.SpringHomeWork6.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")

public class CourseEntity extends CourseAbstract{
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "link_student_course",
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<StudentBriefEntity> studentEntityList;

	public List<StudentBriefEntity> getStudentEntityList() {
		return studentEntityList;
	}

	public void setStudentEntityList(List<StudentBriefEntity> studentEntityList) {
		this.studentEntityList = studentEntityList;
	}

}
