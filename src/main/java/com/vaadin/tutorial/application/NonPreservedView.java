package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class NonPreservedView extends VerticalLayout implements View{

	static final public String VIEW_NAME = "nonpreserved";
	
	public NonPreservedView() {
		addComponent(new TextField("Your Input:"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}

}
