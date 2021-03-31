package com.casestudy.main;

import java.util.List;

import com.casestudy.models.Bucket_Been;
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
		
//		User u1 = new User("Lindsey", "hello@world.com", "asdf");
//		User u2 = new User("Dave", "funguy@fungi.com", "mush");
//		User u3 = new User("Jax", "jaxy@thedog.com", "treats");
//		User u4 = new User("Bonnie", "bon@thedog.com", "naps");
//		USer.addUserService(u1);
//		USer.addUserService(u2);
//		USer.addUserService(u3);
//		USer.addUserService(u4);
//		USer.findUserByEmailService("tekglobal@email.com");

		//This works but foreign key constraints were taken out
//		Journal journal1 = new Journal("this is my first journal");
//		Journal journal2 = new Journal("this is my second journal");
//		Bucket_Been been1 = new Bucket_Been(5, 1, true, false, journal1);
//		Bucket_Been been2 = new Bucket_Been(50, 2, true, false, journal2);
//		BBSer.addBBParkService(been1);
//		BBSer.addBBParkService(been2);
//		
//		BBSer.getUserBeenService(1);
//		
//		Journal journal3 = new Journal("this is my third journal");
//		Journal journal4 = new Journal("this is my fourth journal");
//		Bucket_Been bucket1 = new Bucket_Been(12, 1, false, false, journal3);
//		Bucket_Been bucket2 = new Bucket_Been(13, 1, true, true, journal4);
//		BBSer.addBBParkService(bucket1);
//		BBSer.addBBParkService(bucket2);
//
//		BBSer.getUserBucketService(1);
		
//		BBSer.getBBParkService(50, 2);
//		BBSer.deleteBBParkService(5, 1);
		
		
		List<Park> parks = parkSer.getAllParksService();
		for (Park p: parks) {
			System.out.println(p.toString());
		}
	}
}
