package com.casestudy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Park {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	@Column(name="name", nullable=false)
	private String name;
	@Column(name="state")
	private String state;
	@Column(name="year_founded")
	private int year_founded;
	@Column(name="photoLocal")
	private String photoLocal;
	@Column(name="photoURL")
	private String photoURL;
	@Column(name="photo_cred")
	private String photo_cred;
	@Column(name="summary")
	private String summary;
	
	public Park() {}

	public Park(int id, String name, String state, int year_founded, String photoLocal, String photoURL,
			String photo_cred, String summary) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.year_founded = year_founded;
		this.photoLocal = photoLocal;
		this.photoURL = photoURL;
		this.photo_cred = photo_cred;
		this.summary = summary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public int getYear_founded() {
		return year_founded;
	}

	public String getPhotoLocal() {
		return photoLocal;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public String getPhoto_cred() {
		return photo_cred;
	}

	public String getSummary() {
		return summary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Park other = (Park) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (photoLocal == null) {
			if (other.photoLocal != null)
				return false;
		} else if (!photoLocal.equals(other.photoLocal))
			return false;
		if (photoURL == null) {
			if (other.photoURL != null)
				return false;
		} else if (!photoURL.equals(other.photoURL))
			return false;
		if (photo_cred == null) {
			if (other.photo_cred != null)
				return false;
		} else if (!photo_cred.equals(other.photo_cred))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (year_founded != other.year_founded)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Park [id=" + id + ", name=" + name + ", state=" + state + ", year_founded=" + year_founded
				+ ", photoLocal=" + photoLocal + ", photoURL=" + photoURL + ", photo_cred=" + photo_cred + ", summary="
				+ summary + "]";
	}

}
