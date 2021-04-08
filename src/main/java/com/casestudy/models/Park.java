package com.casestudy.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="park")
public class Park {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="park_id")
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
//	@OneToMany(fetch = FetchType.LAZY)
//	private Set<Bucket_Been> bucket_been;
	
	public Park() {}

	public Park(String name, String state, int year_founded, String photoLocal, String photoURL,
			String photo_cred, String summary) {
		super();
		this.name = name;
		this.state = state;
		this.year_founded = year_founded;
		this.photoLocal = photoLocal;
		this.photoURL = photoURL;
		this.photo_cred = photo_cred;
		this.summary = summary;
	}
	
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

//	public Set<Bucket_Been> getBucket_been() {
//		return bucket_been;
//	}
//
//	public void setBucket_been(Set<Bucket_Been> bucket_been) {
//		this.bucket_been = bucket_been;
//	}
	
//	public void addBucket_Been(Bucket_Been bbPark) {
//		this.bucket_been.add(bbPark);
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((bucket_been == null) ? 0 : bucket_been.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((photoLocal == null) ? 0 : photoLocal.hashCode());
		result = prime * result + ((photoURL == null) ? 0 : photoURL.hashCode());
		result = prime * result + ((photo_cred == null) ? 0 : photo_cred.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + year_founded;
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
		Park other = (Park) obj;
//		if (bucket_been == null) {
//			if (other.bucket_been != null)
//				return false;
//		} else if (!bucket_been.equals(other.bucket_been))
//			return false;
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
