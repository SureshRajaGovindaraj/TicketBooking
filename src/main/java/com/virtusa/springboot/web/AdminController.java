package com.virtusa.springboot.web;

import com.virtusa.springboot.model.Admin;
import com.virtusa.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
  // display the list of Admin added movies
	
 @GetMapping("/AdminLogin")
 public String AdminLogin() {
	 return "AdminLogin";
 }
  
  @GetMapping("/addMovie")
  public String viewHomePage(Model model) {
	return "AdminAddMovies";

  }
  
  
  @GetMapping("/showNewMovieForm")
  public String showNewMovieForm(Model model) {
	  Admin admin=new Admin();
	  model.addAttribute("admin",admin);
	  return "addMovieInfo";
  }
  
  @PostMapping("/saveAdmin")
  public String saveAdmin(@ModelAttribute ("admin") Admin admin) {
	  adminService.saveAdmin(admin);
	  return "redirect:/";
  }
 
  @GetMapping("/showFormorUpdate/{id}")
  public String showFormForUpdate(@PathVariable(value="id") long id,Model model) {
	  Admin admin=adminService.getAdminById(id);
	  model.addAttribute("admin",admin);
	  return "update_movie";
  }
 
  
  
  @GetMapping("/deleteEmployee/")
  public String deleteEmployee(@PathVariable(value = "id") long id) {
    this.adminService.deleteAdminById(id);
    return  "redirect:/";
  }
  }
  
  
