package com.tap.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tap.config.AppConfig;
import com.tap.dao.StudentDao;
import com.tap.entity.Student;

@Controller
public class HomeController {
	
	private AnnotationConfigApplicationContext ac = null;
	
	@RequestMapping("/empList")
	public String empList(Model model) {
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao sdaoi = (StudentDao) ac.getBean("sdaoi");
		List<Student> allStudents = sdaoi.getAllStudents();
		model.addAttribute("allStudents", allStudents);
		return "empList";
	}
	@GetMapping("/addDetails")
    public String showAddDetailsForm() {
        return "addDetails"; // This maps to /WEB-INF/views/addDetails.jsp
    }
	@PostMapping("/addDetails")
    public String addDetails(@RequestParam("sno") int sNo, 
                             @RequestParam("name") String name,
                             @RequestParam("english") int english, 
                             @RequestParam("maths") int maths,
                             @RequestParam("science") int science, 
                             @RequestParam("social") int social) 
    {
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao sdaoi = (StudentDao) ac.getBean("sdaoi");
        
        Student stud = (Student) ac.getBean("student");
        stud.setsNo(sNo);
        stud.setName(name);
        stud.setEnglish(english);
        stud.setMaths(maths);
        stud.setScience(science);
        stud.setSocial(social);
        sdaoi.addStudent(stud);
        return "redirect:/empList";
    }
	@RequestMapping("deleteDetail")
	public String deleteDetail(@RequestParam("sno") int sNo) {
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
	    StudentDao sdaoi = (StudentDao) ac.getBean("sdaoi");
	    sdaoi.deleteStudent(sNo);
	    return "redirect:/empList";
	}
	@RequestMapping("/editDetails")
	public String editStudent(@RequestParam("sno") int sno, Model model) {
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao sdaoi = (StudentDao) ac.getBean("sdaoi");
		Student student = sdaoi.getStudent(sno);
	    model.addAttribute("student", student);
	    return "editDetails";
	}
	@RequestMapping("/updateDetails")
	public String updateStudent(@RequestParam("sno") int sno,
								@RequestParam("name") String name,
					            @RequestParam("english") int english, 
					            @RequestParam("maths") int maths,
					            @RequestParam("science") int science, 
					            @RequestParam("social") int social) 
	{
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao sdaoi = (StudentDao) ac.getBean("sdaoi");
		Student stud = (Student) ac.getBean("student");
		stud.setsNo(sno);
        stud.setName(name);
        stud.setEnglish(english);
        stud.setMaths(maths);
        stud.setScience(science);
        stud.setSocial(social);
        sdaoi.updateStudent(stud);
		return "redirect:/empList";
	}
}














