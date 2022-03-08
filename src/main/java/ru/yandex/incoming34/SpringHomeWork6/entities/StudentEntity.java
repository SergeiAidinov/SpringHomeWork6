package ru.yandex.incoming34.SpringHomeWork6.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {

	@Id
	@Column(name = "id")
	private Long studentId;
	
	@Column(name = "name")
	private String studentName;
	
	@ManyToMany
	@JoinTable(
			name = "link_student_course",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<CourseEntity> courseEntityList;
	
	public Long getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public List<CourseEntity> getCourseEntityList() {
		return courseEntityList;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public void setCourseEntityList(List<CourseEntity> courseEntityList) {
		this.courseEntityList = courseEntityList;
	}
	
	

}
