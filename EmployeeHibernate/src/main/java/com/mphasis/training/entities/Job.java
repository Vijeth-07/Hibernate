package com.mphasis.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Job {

	@Id
	@Column(length = 3)
	private String jcode;
	
	private String jname;

	public String getJcode() {
		return jcode;
	}

	public void setJcode(String jcode) {
		this.jcode = jcode;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}
	
	
}
