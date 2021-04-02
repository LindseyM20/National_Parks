package com.casestudy.main;

import java.util.List;

import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Bucket_BeenId;
import com.casestudy.models.Journal;
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.Bucket_BeenService;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;

public class Main {

	public static void main(String[] args) {
		UserService USer = new UserService();
		Bucket_BeenService BBSer = new Bucket_BeenService();
		ParkService parkSer = new ParkService();
		
		// seeding the User table
//		User u1 = new User("Lindsey", "hello@world.com", "asdf");
//		User u2 = new User("Dave", "funguy@fungi.com", "mush");
//		User u3 = new User("Jax", "jaxy@thedog.com", "treats");
//		User u4 = new User("Bonnie", "bon@thedog.com", "naps");
//		USer.addUserService(u1);
//		USer.addUserService(u2);
//		USer.addUserService(u3);
//		USer.addUserService(u4);
//		// test:
//		USer.findUserByEmailService("hello@world.com");
//		
//		Journal journal1 = new Journal("this is my first journal");
//		Journal journal2 = new Journal("this is my second journal");
//		
//		User u1 = USer.findUserByEmailService("hello@world.com");
//		User u2 = USer.findUserByEmailService("funguy@fungi.com");
//		User u3 = USer.findUserByEmailService("jaxy@thedog.com");
//		
//		Park park1 = parkSer.getParkByIdService(50);
//		Park park2 = parkSer.getParkByIdService(18);
//		Park park3 = parkSer.getParkByIdService(3);
//		Park park4 = parkSer.getParkByIdService(56);
//		
//		Bucket_Been been1 = new Bucket_Been(park1, u1, true, false, journal1);
//		Bucket_Been been2 = new Bucket_Been(park2, u2, true, false, null);
//		BBSer.addBBParkService(been1);
//		BBSer.addBBParkService(been2);
//		
//		BBSer.getUserBeenService(1);
//		BBSer.getUserBeenService(2);
////		
//		Journal journal3 = new Journal("this is my third journal");
////		Journal journal4 = new Journal("this is my fourth journal");
//		Bucket_Been bucket1 = new Bucket_Been(park3, u3, false, false, journal3);
//		Bucket_Been bucket2 = new Bucket_Been(park4, u1, true, true, journal2);
//		BBSer.addBBParkService(bucket1);
//		BBSer.addBBParkService(bucket2);

//		BBSer.getUserBucketService(1);
//		BBSer.getUserBeenService(u1.getId());
		
//		BBSer.getBBParkService(50, 1);
//		BBSer.deleteBBParkService(50, 1);
		
//		List<Park> parks = parkSer.getAllParksService();
//		for (Park park: parks) {
//			System.out.println(park);
//		}

//		System.out.println(park.toString());
	}
}
