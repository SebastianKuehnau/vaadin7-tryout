package com.vaadin.tutorial.application.customer;

import java.util.Date;


/**
 * example bean
 *
 */
public class Customer {

	private String name;
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
