package com.casestudy.models;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="bucket_been")
public class Bucket_Been implements Serializable {

	@EmbeddedId
	private Bucket_BeenId primaryKey;
	
	@MapsId("park_id")
	@JoinColumn(name="park_id")
	@ManyToOne
	private Park park;
	
	@MapsId("user_id")
	@JoinColumn(name="user_id")
	@ManyToOne
	private User user;
	
	@Column(nullable=false)
	private Boolean visited;	// This is what determines bucket or been.
	
	@Column(nullable=false)
	private Boolean visit_again;// How to assign default: false? (This allows parks in been list to be added also to bucket list)

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="journal_id", nullable=true)
	private Journal journal_id;

	public Bucket_Been() {}

	public Bucket_Been(Park park, User user, Boolean visited, Boolean visit_again, Journal journal_id) {
		super();
		this.primaryKey = new Bucket_BeenId(park.getId(), user.getId());
		this.park = park;
		this.user = user;
		this.visited = visited;
		this.visit_again = visit_again;
		this.journal_id = journal_id;
	}

	public Bucket_BeenId getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Bucket_BeenId primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getVisited() {
		return visited;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	public Boolean getVisit_again() {
		return visit_again;
	}

	public void setVisit_again(Boolean visit_again) {
		this.visit_again = visit_again;
	}

	public Journal getJournal_id() {
		return journal_id;
	}

	public void setJournal_id(Journal journal_id) {
		this.journal_id = journal_id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((journal_id == null) ? 0 : journal_id.hashCode());
		result = prime * result + ((park == null) ? 0 : park.hashCode());
		result = prime * result + ((primaryKey == null) ? 0 : primaryKey.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((visit_again == null) ? 0 : visit_again.hashCode());
		result = prime * result + ((visited == null) ? 0 : visited.hashCode());
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
		Bucket_Been other = (Bucket_Been) obj;
		if (journal_id == null) {
			if (other.journal_id != null)
				return false;
		} else if (!journal_id.equals(other.journal_id))
			return false;
		if (park == null) {
			if (other.park != null)
				return false;
		} else if (!park.equals(other.park))
			return false;
		if (primaryKey == null) {
			if (other.primaryKey != null)
				return false;
		} else if (!primaryKey.equals(other.primaryKey))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (visit_again == null) {
			if (other.visit_again != null)
				return false;
		} else if (!visit_again.equals(other.visit_again))
			return false;
		if (visited == null) {
			if (other.visited != null)
				return false;
		} else if (!visited.equals(other.visited))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bucket_Been [primaryKey=" + primaryKey + ", park=" + park + ", user=" + user + ", visited=" + visited
				+ ", visit_again=" + visit_again + ", journal_id=" + journal_id + "]";
	}
	
	
	
	
//	@EmbeddedId
//	private Bucket_BeenId primaryKey = new Bucket_BeenId();
//	
//	@Column(nullable=false)
//	private Boolean visited;	// This is what determines bucket or been.
//	
//	@Column(nullable=false)
//	private Boolean visit_again;// How to assign default: false? (This allows parks in been list to be added also to bucket list)
//
//	@OneToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name="journal_id", nullable=true)
//	private Journal journal_id;
//	
//	
//	public Bucket_Been() {
//		super();
//	}
//
//	public Bucket_Been(Bucket_BeenId primaryKey, Boolean visited, Boolean visit_again,
//			Journal journal_id) {
//		super();
//		this.primaryKey = primaryKey;
//		this.visited = visited;
//		this.visit_again = visit_again;
//		this.journal_id = journal_id;
//	}
//
//	
//	public Bucket_BeenId getPrimaryKey() {
//		return primaryKey;
//	}
//	
//	public void setPrimaryKey(Bucket_BeenId primaryKey) {
//		this.primaryKey = primaryKey;
//	}
//
//	@Transient
//	public Park getPark() {
//		return getPrimaryKey().getPark();
//	}
//	
//	public void setPark(Park park) {
//		getPrimaryKey().setPark(park);
//	}
//	
//	@Transient
//	public User getUser() {
//		return getPrimaryKey().getUser();
//	}
//	
//	public void setUser(User user) {
//		getPrimaryKey().setUser(user);
//	}
//	
//	public Boolean getVisited() {
//		return visited;
//	}
//
//	public void setVisited(Boolean visited) {
//		this.visited = visited;
//	}
//
//	public Boolean getVisit_again() {
//		return visit_again;
//	}
//
//	public void setVisit_again(Boolean visit_again) {
//		this.visit_again = visit_again;
//	}
//
//	public Journal getJournal_id() {
//		return journal_id;
//	}
//
//	public void setJournal_id(Journal journal_id) {
//		this.journal_id = journal_id;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((journal_id == null) ? 0 : journal_id.hashCode());
//		result = prime * result + ((primaryKey == null) ? 0 : primaryKey.hashCode());
//		result = prime * result + ((visit_again == null) ? 0 : visit_again.hashCode());
//		result = prime * result + ((visited == null) ? 0 : visited.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bucket_Been other = (Bucket_Been) obj;
//		if (journal_id == null) {
//			if (other.journal_id != null)
//				return false;
//		} else if (!journal_id.equals(other.journal_id))
//			return false;
//		if (primaryKey == null) {
//			if (other.primaryKey != null)
//				return false;
//		} else if (!primaryKey.equals(other.primaryKey))
//			return false;
//		if (visit_again == null) {
//			if (other.visit_again != null)
//				return false;
//		} else if (!visit_again.equals(other.visit_again))
//			return false;
//		if (visited == null) {
//			if (other.visited != null)
//				return false;
//		} else if (!visited.equals(other.visited))
//			return false;
//		return true;
//	}

}
