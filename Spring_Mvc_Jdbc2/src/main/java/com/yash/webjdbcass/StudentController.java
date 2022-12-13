package com.yash.webjdbcass;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.webjdbcass.Dao.StudentDao;
import com.yash.webjdbcass.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDao objsDao;
	
	@RequestMapping("/")
	public String index()
	{
	 return "index";	
	}
	@RequestMapping("/addstudent")
	public String adds1(Model m)
	{
		Student objStudent = new Student();
		m.addAttribute("objS", objStudent);
		return "addstudent";
	}
	@RequestMapping(value="/addstudent", method=RequestMethod.POST)
	public String student(@Valid @ModelAttribute("objS") Student objstudent, BindingResult bsr)
	{
		 if(bsr.hasErrors())
			 return "addstudent";
		 else {
		objsDao.addStudent(objstudent); // call database..
		return "redirect:/";
		 }
	}
	
	@RequestMapping("/viewallstudent")
	public ModelAndView getallstudent()
	{
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("studentlist"); // jspfile name currently not 
		List<Student> slist=objsDao.getAllStudent();
		 objmv.addObject("studentlist", slist);   
	 return objmv;	 
	}
	
	
	@RequestMapping(value="/editstudent/{id}")
	public String edit1(@PathVariable int id )
	{
		  return "redirect:/edits?id="+id;		 
	}
	@RequestMapping("/edits")
	public String edit2(@RequestParam("id") int studentid,Model objmv)
	{ 
		   List<Student> slist=objsDao.getStudentById(studentid);
		   Student objStudent = slist.get(0);
		  objmv.addAttribute("studentobj", objStudent);		   
		return "editstudent";
	}
	@RequestMapping(value="/editstudent", method=RequestMethod.POST)
	public String editStudentSave(@ModelAttribute("studentobj") Student studentobj)
	{
		objsDao.updateStudent(studentobj);
		return "redirect:/viewallstudent";
	}
	@RequestMapping(value="/deletestudent/{id}",method=RequestMethod.GET)
	public String deleteStudent(@PathVariable int id)
	{
		objsDao.deleteStudentRecord(id);
		return "redirect:/viewallstudent";
	}
}
