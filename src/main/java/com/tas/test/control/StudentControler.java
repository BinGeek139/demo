package com.tas.test.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tas.test.control.model.dao.impl.StudentDao;
import com.tas.test.control.model.entity.Student;
import com.tas.test.control.model.entity.StudentWapper;

@Controller
public class StudentControler {
	@Autowired
	StudentDao st;

	@RequestMapping("/")
	public String index(ModelMap model) {
		List<Student> list=st.getAll();
		model.addAttribute("list",list);
		return "index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		st.deleteById(id);
		System.out.println("delete " + id);
		return "redirect: /test ";
	}
	
	@RequestMapping("/view")
	public String view(Model model) {
		List<Student> list=st.getAll();
		model.addAttribute("list",list);
		return "index";
	}
	

}
