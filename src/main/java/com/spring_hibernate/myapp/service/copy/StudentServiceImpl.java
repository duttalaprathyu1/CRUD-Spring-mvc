package com.spring_hibernate.myapp.service.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_hibernate.myapp.DAO.StudentDAO;
import com.spring_hibernate.myapp.model.Student;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentdao;
	
    public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}
	
	
	@Transactional
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		studentdao.saveStudent(s);
	}

	@Override
	@Transactional
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		studentdao.updateStudent(s);
		
	}

	@Override
	@Transactional
	public List<Student> getStudentsAll() {
		// TODO Auto-generated method stub
		return studentdao.getStudentsAll();
	}

	@Override
	@Transactional
	public Student getStudentInfo(int stdno) {
		// TODO Auto-generated method stub
		return studentdao.getStudentInfo(stdno);
	}

	@Override
	@Transactional
	public void deleteStudent(int stdno) {
		// TODO Auto-generated method stub
		studentdao.deleteStudent(stdno);
		
	}

}
