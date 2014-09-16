package com.spring_hibernate.myapp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring_hibernate.myapp.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);
    SessionFactory sessionfactory;
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		Session s1=this.sessionfactory.getCurrentSession();
		s1.persist(s);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().update(s);
		//s1.update(s);
		//s1.getTransaction().commit();
		
		
	}

	@Override
	public List<Student> getStudentsAll() {
	    // TODO Auto-generated method stub
		Session s1=sessionfactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> studentList=s1.createQuery("from Student").list();
		return studentList;
		
	}

	@Override
	public Student getStudentInfo(int stdno) {
		// TODO Auto-generated method stub
		return (Student) sessionfactory.getCurrentSession().get(Student.class, stdno);
	}

	@Override
	public void deleteStudent(int stdno) {
		// TODO Auto-generated method stub
		//sessionfactory.getCurrentSession().delete(getStudentInfo(stdno));
		 Session session = this.sessionfactory.getCurrentSession();
		 Student p = (Student) session.load(Student.class, new Integer(stdno));
	        if(null != p){
	            session.delete(p);
	            //session.getTransaction().commit();
	            //session.clear();
	        }
	        logger.info("Person deleted successfully, person details="+p);
	}

}
