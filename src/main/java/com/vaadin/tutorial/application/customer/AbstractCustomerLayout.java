package com.vaadin.tutorial.application.customer;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * abstract class for the customer views
 * 
 */
public abstract class AbstractCustomerLayout<T extends Customer> extends VerticalLayout implements CustomerView {

	private static final long serialVersionUID = 1L;

	CustomerPresenter presenter = new CustomerPresenter(this) ;

	TextField name = new TextField();
	PopupDateField birthday = new PopupDateField();
	
	Button checkButton = new Button("check", event -> presenter.onCheckButtonClick(birthday.getValue())) ;
	
	public AbstractCustomerLayout() {
		setMargin(true);
		setSpacing(true) ;
	}
	
	abstract void setCustomer(T customer) ;
	
	@Override
	public void showNotification(String string) {
		Notification.show(string, Type.HUMANIZED_MESSAGE);
	}

	@Override
	public void showWarningNotification(String string) {
		Notification.show(string, Type.WARNING_MESSAGE);
	}
	
}
