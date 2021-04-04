package com.casestudy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	Bucket_BeenService bbService = new Bucket_BeenService();
	ParkService parkService = new ParkService();
	
	@GetMapping("/home")
	public String showHomePage(Model model, HttpSession session) {
		User user = (User) session.getAttribute("currentUser"); //use this to display user's name
		List<Park> parks = parkService.getAllParksService();	// change this later so park isn't hardcoded.
		model.addAttribute("user", user);
		model.addAttribute("parks", parks);
		return "home";
	}

	@PostMapping("/home1")
	public String processAddBucket(@RequestParam("park_id") int park_id, HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been parkToAdd = new Bucket_Been(park, user, false, false, null);
		bbService.addBBParkService(parkToAdd);
		// Todo: if park is already in bucketlist, alert user somehow
		// Todo: make it so page doesn't reload
		return "redirect:/home";
	}
	
	// How to do this so both buttons call the same function?
	@PostMapping("/home2")
	public String processAddBeen(@RequestParam("park_id") int park_id, HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been parkToAdd = new Bucket_Been(park, user, true, false, null);
		bbService.addBBParkService(parkToAdd);
		// Todo: if park is already in been list, alert user somehow
		// Todo: make it so page doesn't reload
		return "redirect:/home";
	}
	

	
	// Display the been list
	@GetMapping("/been")
	public String showBeenPage(HttpSession session, Model model) {
		User user = (User) session.getAttribute("currentUser");
		List<Bucket_Been> beenList = bbService.getUserBeenService(user.getId());
		// map beenList to a list of Park type
		List<Park> beenParks = new ArrayList<Park>();
		for (Bucket_Been bb : beenList) {
			int park_id = bb.getPrimaryKey().getPark_id();
			beenParks.add(parkService.getParkByIdService(park_id));
		}
		model.addAttribute("user", user);
		model.addAttribute("beenParks", beenParks);
		
		return "been";
	}
	
	// Display the been list
	@GetMapping("/bucket")
	public String showBucketPage(HttpSession session, Model model) {
		User user = (User) session.getAttribute("currentUser");
		List<Bucket_Been> bucketList = bbService.getUserBucketService(user.getId());
		// map bucketList to a list of Park type
		List<Park> bucketParks = new ArrayList<Park>();
		for (Bucket_Been bb : bucketList) {
			int park_id = bb.getPrimaryKey().getPark_id();
			bucketParks.add(parkService.getParkByIdService(park_id));
		}
		model.addAttribute("user", user);
		model.addAttribute("bucketParks", bucketParks);
		return "bucket";
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
