package com.vaadin.tutorial.application.customer;

import java.sql.Date;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CheckBox;

/**
 * extential view for SpecialCustomer
 * 
 * use the same presenter than CustomerViewImpl
 *
 */
public class SpecialCustomerViewImpl extends AbstractCustomerLayout<SpecialCustomer> implements View {

	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "specialcustomer";
	
	CheckBox old  = new CheckBox() ;
	
	public SpecialCustomerViewImpl() {
		addComponents(name, birthday, old, checkButton);
	}
	
	SpecialCustomer createSpecialCustomer() {

		SpecialCustomer customer = new SpecialCustomer();
		
		customer.setName("Sebastian Superman");
		customer.setBirthday(Date.valueOf("1982-09-22"));
		customer.setOld(true);
		
		return customer;
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		setCustomer(createSpecialCustomer()) ;
	}

	protected void setCustomer(SpecialCustomer createSpecialCustomer) {
		BeanItem<SpecialCustomer> customerItem = new BeanItem<SpecialCustomer>(createSpecialCustomer);
		
		FieldGroup customerFieldGroup = new FieldGroup(customerItem);
			
		customerFieldGroup.bindMemberFields(this);
	}
	
}
