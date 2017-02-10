package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * this view will keep the inputs after refreshing
 * 
 * have a look how the view is registered in navigator in MyUI.java
 *
 */
public class PreservedView extends VerticalLayout implements View{

	private static final long serialVersionUID = 1L;

	static final public String VIEW_NAME = "preserved";
	
	public PreservedView() {
		addComponent(new TextField("Your Input:"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
}
