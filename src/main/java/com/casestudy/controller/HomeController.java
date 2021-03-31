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
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.Bucket_BeenService;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;

@Controller
public class HomeController {
	Bucket_BeenService bbServ = new Bucket_BeenService();
	ParkService parkServ = new ParkService();
	
	//What happens when a user clicks "add to been" on a park
	// GET HELP ON THIS
	@PostMapping("/home")
	public String processBeen(@RequestParam("park_id") Integer park_id, HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		
		Park park = parkServ.getParkByIdService(50);	// change this later so park isn't hardcoded.
		
		// check to see if park is already in bucket_been table? or assume it can't be added twice?
		//REPLACE park. How to grab park's id?
//		Bucket_Been bbPark = new Bucket_Been(park, user, true, false, null);

		return "login";
	}
	
	// Display the been list (should this stuff go in the service instead?)
	@GetMapping("/been")
	public String showBeenPage(HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		List<Bucket_Been> beenList = bbServ.getUserBeenService(user.getId());
//		How to save the list so jsp can render it? session attribute?
//		session.setAttribute("beenParks", beenList);
		return "been";
	}
	
//	@PostMapping("/been")
//	public String processBeen(@RequestParam("email") String email, 
//			@RequestParam("password") String password, Model model, HttpSession session) {
//		User user = userService.findUserByEmailService(email);
//		System.out.println(user);
//		System.out.println("Coming from line 69 " + user.toString());
//		if (user != null && password.equals(user.getPassword())) {	
//			session.setAttribute("currentUser", user);
//			return "home";
//		}
//		System.out.println("Login failed.");
//		model.addAttribute("loginFailedMessage", "Login Failed");
//		return "login";
//	}
}
