package com.tas.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tas.test.control.model.dao.impl.StudentDao;
import com.tas.test.control.model.entity.Student;
import com.tas.test.control.model.entity.StudentWapper;
@Controller
public class AddStudentController  {
	@Autowired
	StudentDao st;
	@RequestMapping("/add")
	public String add(Model model) {
		  model.addAttribute("command", new StudentWapper());  
		return "ViewAdd";
	}
	@RequestMapping(value = {"/addStudent"} ,method = RequestMethod.POST)
	public String addStudentDatabase(@ModelAttribute("stu") StudentWapper student) {
		
		st.add(student.toStudent());
		return "redirect: add";
	}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id,Model model) {
		Student student=st.searchById(id);
	 	System.out.println("find"+ id);
	 	this.id=id;
	 	StudentWapper wapper=student.toWapper();
	 	
	
		model.addAttribute("command",wapper);
		System.out.println("ok");
		return "edit";
	}
	@RequestMapping("/updates")
	public String update2(@ModelAttribute StudentWapper studentWapper) {
		Student student=studentWapper.toStudent();
		student.setId(this.id);
		st.update(student);
	
			return "redirect: /test ";
	}
	private int id;
	
}
