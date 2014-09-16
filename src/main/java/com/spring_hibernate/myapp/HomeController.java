package com.spring_hibernate.myapp;

import java.util.List;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring_hibernate.myapp.model.Student;
import com.spring_hibernate.myapp.service.copy.StudentService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/Student")
public class HomeController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value = "/registerStudent")
	public ModelAndView home(@ModelAttribute Student student) {
		
		
		return new ModelAndView("register","student",student);
	}
	
	@RequestMapping(value="/insert")
	public String insertStudent(@ModelAttribute Student student)//,@Valid Student student1,BindingResult result)
	{
		
		if(student!=null)
		{
		studentservice.saveStudent(student);
		}
		return "redirect:getList";
		
	}
	
	@RequestMapping(value="/getList")
	public ModelAndView getStudentList()
	{
		List<Student> s1=studentservice.getStudentsAll();
		return new ModelAndView("getList","s1",s1);
		
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView editStudent(@RequestParam int id,@ModelAttribute Student student)
	{
		student=studentservice.getStudentInfo(id);
		return new ModelAndView("edit","student",student);
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update_Student(@ModelAttribute Student student)
	{
		studentservice.updateStudent(student);
		return "redirect:getList";
		
	}
	
	@RequestMapping(value="/delete")
	public String delete_student(@RequestParam int id,@ModelAttribute Student student)
	{
		studentservice.deleteStudent(id);
		return "redirect:getList";
		
	}
	
	
	
	
}
