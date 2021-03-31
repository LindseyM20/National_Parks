package com.casestudy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.casestudy.dao.UserDao;
import com.casestudy.models.Journal;
import com.casestudy.models.User;
import com.casestudy.service.UserService;


@Controller
public class LoginController {
//	UserDao uDao = new UserDao();
	UserService userService = new UserService();
	
	@GetMapping("/")
	public String showIndexPage() {
		return "index";	// this method is going to run a get request
	}
	
//	@GetMapping("/about")
//	public String showAboutPage() {
//		return "about";	// this method is going to run a get request
//	}
//	
//	@GetMapping("/contact")
//	public String showContactPage() {
//		return "contact";	// this method is going to run a get request
//	}
	
	@GetMapping("/register")
	public String showRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String processRegistration(@ModelAttribute("user") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		// if no errors:
		System.out.println(user.toString());
//		user.setPassword(user.getPassword());	// encrypt here, then save.
		userService.addUserService(user);
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String showLoginPage(Model model) {
//		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String processLogin(@RequestParam("email") String email, 
			@RequestParam("password") String password, Model model, HttpSession session) {
		User user = userService.findUserByEmailService(email);
		System.out.println(user);
		System.out.println("Coming from line 69 " + user.toString());
		if (user != null && password.equals(user.getPassword())) {	// decrypt password here.
			session.setAttribute("currentUser", user);
			return "home";
		}
		System.out.println("Login failed.");
		model.addAttribute("loginFailedMessage", "Login Failed");
		return "login";
	}
	
//	@GetMapping("/saveHardCodedUser")
//	public String saveHardCodedUser() {
//		User user = new User("linds", "email@test.com", "asdfasdf");
//		userService.addUserService(user);
//		return "index";
//	}
	
	
//	@GetMapping("/")
//	public String showIndexPage() {
//		return "index";
//	}
//	
//	@GetMapping("/home")
//	public String showIndexPage2() {
//		return "index";
//	}
//	
//	//delete this later
//	@GetMapping("/about")
//	public String showAboutPage() {
//		return "about";	// this method is going to run a get request
//	}
//	



////	@GetMapping("/about")
////	public String showAboutPage() {
////		return "about_me";
////	}
//	
////	@GetMapping("/thanks")
////	public String showThanksPage() {
////		return "thanks";
////	}


}
