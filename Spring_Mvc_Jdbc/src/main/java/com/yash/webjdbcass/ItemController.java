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

import com.yash.webjdbcass.dao.ItemDao;
import com.yash.webjdbcass.model.Item;

@Controller
public class ItemController {

	@Autowired
	ItemDao objDao;
	
	@RequestMapping("/")
	public String index()
	{
	 return "index";	
	}
	@RequestMapping("/additem")
	public String addi1(Model m)
	{
		Item objItem = new Item();
		m.addAttribute("objI", objItem);
		return "additem";
	}
	@RequestMapping(value="/additem", method=RequestMethod.POST)
	public String item(@ModelAttribute("objI") Item objitem)
	{
		System.out.println(objDao.addItem(objitem)); // call database..
		return "redirect:/";
	}
	
	@RequestMapping("/viewallitem")
	public ModelAndView getallitem()
	{
		ModelAndView objmv = new ModelAndView();
		objmv.setViewName("itemlist");
		List<Item> ilist=objDao.getAllItem();
		 objmv.addObject("itemlist", ilist);   // show all list of item
	 return objmv;	 
	}
	
	
	@RequestMapping(value="/edititem/{id}")
	public String edit1(@PathVariable int id )
	{
		  return "redirect:/editi?id="+id;		 
	}
	@RequestMapping("/editi")
	public String edit2(@RequestParam("id") int itemid,Model  objmv)
	{ 
		   List<Item> list=objDao.getItemById(itemid);
		  Item objItem = list.get(0);
		  objmv.addAttribute("itemobj", objItem);		   
		return "edititem";
	}
	@RequestMapping(value="/edititemsbt", method=RequestMethod.POST)
	public String editItemSave(@ModelAttribute("itemobj") Item itemobj )
	{
		objDao.updateItem(itemobj);
		return "redirect:/viewallitem";
	}
	
	@RequestMapping(value="/deleteitem/{id}",method=RequestMethod.GET)
	public String delItem(@PathVariable int id)
	{
		objDao.deleteItem(id);
		return "redirect:/viewallitem";
	}
	
}
