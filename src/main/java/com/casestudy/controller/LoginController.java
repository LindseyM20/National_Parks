package com.casestudy.controller;

import java.util.List;

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
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;


@Controller
public class LoginController {
	UserService userService = new UserService();
	ParkService parkService = new ParkService();
	
	@GetMapping("/")
	public String showIndexPage(Model model) {
		List<Park> parks = parkService.getAllParksService();
		model.addAttribute("parks", parks);
//		for (Park p: parks) {
//			System.out.println(p);
//		}
		return "index";
	}
	
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
		System.out.println("New user created: " + user.toString());
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
		System.out.println("Coming from processLogin method: " + user.toString());
		if (user != null && password.equals(user.getPassword())) {	// decrypt password here.
			System.out.println("Login succeeded. User authenticated: " + user.toString());
			session.setAttribute("currentUser", user);
			return "redirect:/home";
		}
		System.out.println("Login failed.");
		model.addAttribute("loginFailedMessage", "Login Failed");
		return "login";
	}
	
//	@GetMapping("/home")
//	public String showHomePage(Model model) {
//		List<Park> parks = parkService.getAllParksService();
//		model.addAttribute("parks", parks);
////		for (Park p: parks) {
////			System.out.println(p);
////		}
//		return "home";
//	}
	
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
//	@GetMapping("/about")
//	public String showAboutPage() {
//		return "about";
//	}
//	

}
