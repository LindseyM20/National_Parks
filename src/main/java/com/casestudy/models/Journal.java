package com.casestudy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Journal {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(length=2000, nullable=true)
	private String entry;
	// Maybe add join columns to display park name, user name, date visited, etc.
	// See here: https://docs.oracle.com/cd/E16439_01/doc.1013/e13981/cmp30cfg002.htm#CEGEHCFB
	
	public Journal() {
		super();
	}

	public Journal(int id, String entry) {
		super();
		this.id = id;
		this.entry = entry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
	
}