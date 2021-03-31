package com.casestudy.models;

import java.io.Serializable;
import java.sql.Date; 	// Should this be java.util.Date?

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@IdClass(Bucket_BeenId.class) // This is needed since we have a composite key
public class Bucket_Been implements Serializable{
	// Next 3 lines are new
//	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	private int id;
	
	// CHANGED INT TO INTEGER!
//	@EmbeddedId
//	private Bucket_BeenId bbId;
	@Id
	private int park_id; // How to indicate this is a foreign key?
	@Id
	private int user_id; // How to indicate this is a foreign key?
	@Column(nullable=false)
	private Boolean visited;	// This is what determines bucket or been.
	@Column(nullable=false)
	private Boolean visit_again;// How to assign default: false? (This allows parks in been list to be added also to bucket list)
//	@Column(nullable=true)
//	private Date date_visited;
//	@Column(nullable=true)
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="id")
	private Journal journal_id;
	
	public Bucket_Been() {
		super();
	}

//	public Bucket_Been(int id, int park_id, int user_id, Boolean visited, Boolean visit_again, Date date_visited,
//			int journal_id) {
//		super();
//		this.id = id;
//		this.park_id = park_id;
//		this.user_id = user_id;
//		this.visited = visited;
//		this.visit_again = visit_again;
//		this.date_visited = date_visited;
//		this.journal_id = journal_id;
//	}

	public Bucket_Been(int park_id, int user_id, Boolean visited, Boolean visit_again,
			Journal journal_id) {
		super();
		this.park_id = park_id;
		this.user_id = user_id;
		this.visited = visited;
		this.visit_again = visit_again;
		this.journal_id = journal_id;
	}



	public int getPark_id() {
		return park_id;
	}

	public int getUser_id() {
		return user_id;
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
	public String toString() {
		return "Bucket_Been [park_id=" + park_id + ", user_id=" + user_id + ", visited=" + visited + ", visit_again="
				+ visit_again + ", journal_id=" + journal_id + "]";
	}
}
