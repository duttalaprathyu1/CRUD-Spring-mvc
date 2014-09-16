package com.spring_hibernate.myapp.service.copy;

import java.util.List;

import com.spring_hibernate.myapp.model.Student;

public interface StudentService {
	public void saveStudent(Student s);
	public void updateStudent(Student s);
	public List<Student> getStudentsAll();
	public Student getStudentInfo(int stdno);
    public void deleteStudent(int stdno);

}
