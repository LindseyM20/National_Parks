package com.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.casestudy.dao.UserDao;
import com.casestudy.models.Journal;
import com.casestudy.models.User;


@Controller
public class LoginController {
	UserDao uDao = new UserDao(); 	// or import service which imports dao
	
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/home")
	public String showIndexPage2() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String processRegistration(@ModelAttribute("user") User user) {
		System.out.println(user.toString());
		uDao.addUser(user);
		return "login";
	}

	@GetMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String processLogin(@ModelAttribute("user") User user) {
		System.out.println(user);
		User uFound = uDao.findUserByEmail(user.getEmail());
		System.out.println("Coming from line 70" + uFound.toString());
		if (uFound != null && uFound.getPassword().equals(user.getPassword())) {
			user.setName(uFound.getName());
			return "login_success";
		} else {
			return "login_failed";
		}
	}
	
	//This could be a replacement for the above method, but above allows us to display the name on the next page with ${user.name}
//	@PostMapping("/login")
//	public String processLogin(@RequestParam("email") String email, 
//			@RequestParam("password") String password) {
//		System.out.println(email);
//		User uFound = uDao.findUserByEmail(email);
//		System.out.println("Coming from line 70" + uFound.toString());
//		if (uFound != null && uFound.getPassword().equals(password)) {
//			return "login_success";
//		} else {
//			return "login";
//		}
//	}

	
	@GetMapping("/journal")
	public String showContactPage(Model model) {
		model.addAttribute("journal", new Journal());
		return "journal";
	}
	
	@PostMapping("/journal")
	public String processContact(@ModelAttribute("journal") Journal journal) {
		System.out.println(journal.toString());
		// do stuff here
		return "thanks";
	}
	
	
	
//	@GetMapping("/about")
//	public String showAboutPage() {
//		return "about_me";
//	}
	
//	@GetMapping("/thanks")
//	public String showThanksPage() {
//		return "thanks";
//	}


}
