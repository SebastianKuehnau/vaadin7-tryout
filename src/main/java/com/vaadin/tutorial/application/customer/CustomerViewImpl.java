package com.vaadin.tutorial.application.customer;

import java.sql.Date;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

/**
 * Implementation of customer view
 * 
 * see how the view interacts with the presenter
 *
 */
public class CustomerViewImpl extends AbstractCustomerLayout<Customer> implements View {
		
	private static final long serialVersionUID = 1L;
	
	public static final String VIEW_NAME = "customer";
	
	public CustomerViewImpl() {
		addComponents(name, birthday, checkButton);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		setCustomer(createCustomer());
	}
	
	Customer createCustomer() {
		Customer customer = new Customer();
		
		customer.setName("John Doe");
		customer.setBirthday(Date.valueOf("1988-12-02"));
		
		return customer;
	}
	
	protected void setCustomer(Customer customer) {
		BeanItem<Customer> customerItem = new BeanItem<Customer>(customer);
		
		FieldGroup customerFieldGroup = new FieldGroup(customerItem);
			
		customerFieldGroup.bindMemberFields(this);
	}
}
