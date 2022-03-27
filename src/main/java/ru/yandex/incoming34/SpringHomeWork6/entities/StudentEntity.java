package ru.yandex.incoming34.SpringHomeWork6.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity extends StudentAbstract {

	@ManyToMany
	@JoinTable(
			name = "link_student_course",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<CourseBriefEntity> courseBriefEntityList;
	
	
	public List<CourseBriefEntity> getCourseEntityList() {
		return courseBriefEntityList;
	}

	public void setCourseEntityList(List<CourseBriefEntity> courseBriefEntityList) {
		this.courseBriefEntityList = courseBriefEntityList;
	}

}
