package com.vaadin.tutorial.application.customer;

/**
 * interface for the customer view
 * 
 * needs to be implemented in CustomerViewImpl and SpecialCustomerViewImpl
 */
public interface CustomerView {

	void showNotification(String string);

	void showWarningNotification(String string);

}