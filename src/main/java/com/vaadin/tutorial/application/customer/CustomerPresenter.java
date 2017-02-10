package com.vaadin.tutorial.application.customer;

import java.util.Date;

public class CustomerPresenter {

	CustomerView view ;
	
	public CustomerPresenter(CustomerView view) {
		this.view = view ;
	}

	public void onCheckButtonClick(java.util.Date value) {
		if (value.before(new Date()))
			view.showNotification("Customer is alive");
		else
			view.showWarningNotification("Customer is not born yet");
		
	}
	
	
}
