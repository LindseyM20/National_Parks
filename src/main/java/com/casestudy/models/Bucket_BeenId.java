package com.casestudy.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Embeddable
public class Bucket_BeenId implements Serializable{
	/**
	 * These next 2 lines were auto-generated. Should only need one, but is it necessary?
	 */
//	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = 6219429581741047516L;
	
	//Could try longs here
	@ManyToOne // This seems to have no effect. Trying to link foreign keys.
	@JoinColumn(name="park_id")
	private int park_id; // How to indicate these are foreign keys?
	@ManyToOne // This seems to have no effect. Trying to link foreign keys.
	@JoinColumn(name="user_id")
	private int user_id;
	
	public Bucket_BeenId() {
		super();
	}
	public Bucket_BeenId(int park_id, int user_id) {
		super();
		this.park_id = park_id;
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
	
	
}
