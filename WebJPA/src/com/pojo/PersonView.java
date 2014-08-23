package com.pojo;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the person_view database table.
 * 
 */
@Entity
@Table(name="person_view")
@NamedQuery(name="PersonView.findAll", query="SELECT p FROM PersonView p")
public class PersonView implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fname;

	private String lname;

	@Id
	@Column(name="PERSON_ID")
	private int personId;

	public PersonView() {
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonView [fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append(", personId=");
		builder.append(personId);
		builder.append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + personId;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PersonView)) {
			return false;
		}
		PersonView other = (PersonView) obj;
		if (personId != other.personId) {
			return false;
		}
		return true;
	}

}