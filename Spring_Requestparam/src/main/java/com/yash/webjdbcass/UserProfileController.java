package com.yash.webjdbcass;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.webjdbcass.Dao.ProfileDao;
import com.yash.webjdbcass.model.UserProfile;

@Controller
public class UserProfileController {
	
	@Autowired
	ProfileDao pDao;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/addprofile")
	public String addprofile(Model m)
	{
		UserProfile pobj = new UserProfile();
		m.addAttribute("objU", pobj);
		return "addprofile";
	}
	@RequestMapping(value="/saveprofile", method=RequestMethod.POST)
	public String user(@ModelAttribute("objU") UserProfile objprofile)
	{
	  System.out.println(pDao.saveUserProfile(objprofile));
		return "redirect:/";  
	
	}
	
	@RequestMapping("/viewall")
	public ModelAndView getallitem()
	{
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("profilelist");
		List<UserProfile> ulist=pDao.getAllUser();
		objmv.addObject("profilelist", ulist);
	 return objmv;	 
	}

	
	@RequestMapping(value="/edititem/{id}")
	public String edit1(@PathVariable int id )
	{
		//System.out.println("edit i matter"+id);
		  return "redirect:/editi?id="+id;		 
	}
	@RequestMapping("/editi")
	public String edit2(@RequestParam("id") int userid,Model  objmv)
	{ 
		   List<UserProfile> list=pDao.getUserById(userid);
		   UserProfile objstore = list.get(0);
		  objmv.addAttribute("itemobj", objstore);		   //objstore
		return "editprofile";
	}
	@RequestMapping(value="/edititemsbt", method=RequestMethod.POST)
	public String editItemSave(@ModelAttribute("objI") UserProfile objsUser )
	{
		pDao.updateUser(objsUser);
		return "redirect:/viewall";
	}
	
	@RequestMapping(value="/deleteitem/{id}",method=RequestMethod.GET)
	public String delProfile(@PathVariable int id)
	{		
		pDao.deleteUser(id);
		return "redirect:/viewall";
	}
}
