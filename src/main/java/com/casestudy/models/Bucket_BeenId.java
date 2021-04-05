package com.casestudy.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Bucket_BeenId implements Serializable{

	private int park_id;
	private int user_id;
	
	public Bucket_BeenId() {}

	public Bucket_BeenId(int park_id, int user_id) {
		super();
		this.park_id = park_id;
		this.user_id = user_id;
	}

	public int getPark_id() {
		return park_id;
	}

	public void setPark_id(int park_id) {
		this.park_id = park_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + park_id;
		result = prime * result + user_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bucket_BeenId other = (Bucket_BeenId) obj;
		if (park_id != other.park_id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bucket_BeenId [park_id=" + park_id + ", user_id=" + user_id + "]";
	}
	
	
	
	
	
//	private Park park;
//	private User user;
//	
//
//	public Bucket_BeenId() {}
//	public Bucket_BeenId(Park park, User user) {
//		super();
//		this.park = park;
//		this.user = user;
//	}
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	public Park getPark() {
//		return park;
//	}
//	public void setPark(Park park) {
//		this.park = park;
//	}
//	@ManyToOne(cascade = CascadeType.ALL)
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((park == null) ? 0 : park.hashCode());
//		result = prime * result + ((user == null) ? 0 : user.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bucket_BeenId other = (Bucket_BeenId) obj;
//		if (park == null) {
//			if (other.park != null)
//				return false;
//		} else if (!park.equals(other.park))
//			return false;
//		if (user == null) {
//			if (other.user != null)
//				return false;
//		} else if (!user.equals(other.user))
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "Bucket_BeenId [park=" + park + ", user=" + user + "]";
//	}
//	
}
