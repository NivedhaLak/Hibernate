package com.db.task.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;

@Entity
@Subselect("select u.id , u.name, a.city,a.state,a.zipcode from user u join address a on u.address_id= a.id")
@Synchronize({ "user", "address" })
public class UserView {

	@Id
	private Long id;
	private String name;
	private String city;
	private String state;
	private String zipcode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
