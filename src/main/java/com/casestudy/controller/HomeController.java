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
import com.casestudy.exceptions.CustomException;
import com.casestudy.exceptions.DuplicateBBException;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.Bucket_BeenService;
import com.casestudy.service.JournalService;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;

@Controller
public class HomeController {
	Bucket_BeenService bbService = new Bucket_BeenService();
	ParkService parkService = new ParkService();
	JournalService journalService = new JournalService();
	
	// Display the home page
	@GetMapping("/home")
	public String showHomePage(Model model, HttpSession session) {
		User user = (User) session.getAttribute("currentUser"); //use this to display user's name
		List<Park> parks = parkService.getAllParksService();	// change this later so park isn't hardcoded.
		model.addAttribute("user", user);
		model.addAttribute("parks", parks);
		return "home";
	}

	// Add a park to user's bucket list
	@PostMapping("/home1")
	public String processAddBucket(@RequestParam("park_id") int park_id, HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been parkToAdd = new Bucket_Been(park, user, false, null);
		bbService.addBBParkService(parkToAdd);
		// Todo: if park is already in bucket list, alert user somehow
		// Todo: if park is in been list, alert user it cannot be in both.
		// Todo: make it so page doesn't reload
		return "redirect:/home";
	}
	
	// Add a park to user's been list
	@PostMapping("/home2")
	public String processAddBeen(@RequestParam("park_id") int park_id, HttpSession session) 
								throws DuplicateBBException {
		User user = (User) session.getAttribute("currentUser");
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been parkToAdd = new Bucket_Been(park, user, true, null);
		if (bbService.getBBParkService(park_id, user.getId()) == null) {
			bbService.addBBParkService(parkToAdd);
		} else {
			// If park is in bucket list, alert user it cannot be in both.
			throw new DuplicateBBException();
		}
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
	
	// Display the bucket list
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
	
	@PostMapping("/bucket2")
	public String processMoveToBeen(@RequestParam("park_id") int park_id, HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		bbService.updateBBParkVisitedService(park_id, user.getId());
		// Keep the page reload
		return "redirect:/bucket";
	}
	
	@PostMapping("/journal")
	public String showJournalPage(@RequestParam("park_id") int park_id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("currentUser"); //use this to display user's name
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been bbPark = bbService.getBBParkService(park_id, user.getId());
		String textareaText;
		if (bbPark.getJournal_id() != null) {
			String journalEntry = bbPark.getJournal_id().getEntry();
			model.addAttribute("journalEntry", journalEntry);
//			model.addAttribute("buttonText", "Edit");
			textareaText = journalEntry;
		} else {
			model.addAttribute("journalEntry", "No journal entry yet... Write one?");
//			model.addAttribute("buttonText", "Write");
			textareaText = null;
			model.addAttribute("journal", new Journal());
		}
		model.addAttribute("park", park); // use this to display the park's name
		model.addAttribute("bbPark", bbPark);
		model.addAttribute("user", user);
		model.addAttribute("journal", bbPark.getJournal_id());
		model.addAttribute("textareaText", textareaText);
		return "journal";
	}
	
//	@GetMapping("/journal_edit")
//	public String showJournalEntryPage(Model model) {
//		model.addAttribute("journalEntry", new Journal());
//		return "journal_edit";
//	}
	
	@PostMapping("/journalentry")
	public String processJournalEntry(@RequestParam("park_id") int park_id, @RequestParam("newEntry") String entry, HttpSession session, Model model) {
		User user = (User) session.getAttribute("currentUser"); //use this to display user's name
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been bbPark = bbService.getBBParkService(park_id, user.getId());
		model.addAttribute("journalEntry", entry);
		// if a journal entry already exists for this user's bucketlist park, then edit the entry
		if (bbPark.getJournal_id() != null) {
			int journalFoundId = bbPark.getJournal_id().getId();
			Journal journalUpdate = new Journal(journalFoundId, entry);
			journalService.updateJournalService(journalUpdate);
		// else add a new journal
		} else {
			Journal newJournal = new Journal(entry);
			bbService.updateBBParkJournalService(park_id, user.getId(), newJournal);
		}

		model.addAttribute("park", park); // use this to display the park's name
		model.addAttribute("bbPark", bbPark);
		model.addAttribute("user", user);
		model.addAttribute("journal", bbPark.getJournal_id());
		model.getAttribute("textareaText");
		return "journal";
	}
	
	@PostMapping("/deletejournal")
	public String processDeleteJournal(@RequestParam("park_id") int park_id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("currentUser"); //use this to display user's name
		Park park = parkService.getParkByIdService(park_id);
		Bucket_Been bbPark = bbService.getBBParkService(park_id, user.getId());
		Journal journal = bbPark.getJournal_id();
		if (journal != null) {
			int journalFoundId = bbPark.getJournal_id().getId();
			bbService.updateBBParkJournalService(park_id, user.getId(), null);
			journalService.deleteJournalService(journalFoundId);
		// else add a new journal
		} else {
		}
		model.addAttribute("park", park); // use this to display the park's name
		model.addAttribute("bbPark", bbPark);
		model.addAttribute("user", user);
		model.addAttribute("journal", bbPark.getJournal_id());
		model.getAttribute("textareaText");
		return "journal";
	}

	@PostMapping("/removebeen")
	public String processRemoveBeen(@RequestParam("park_id") int park_id, 
								Model model, HttpSession session) {
		User user =  (User) session.getAttribute("currentUser"); //use this to display user's name
		bbService.deleteBBParkService(park_id, user.getId());
		model.addAttribute("loginFailedMessage", "Login Failed");
		return "redirect:/been";
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
