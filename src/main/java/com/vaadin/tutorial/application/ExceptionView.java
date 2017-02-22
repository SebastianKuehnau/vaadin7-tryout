package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ExceptionView extends VerticalLayout implements View {
	
	public static final String VIEW_NAME = "exception";

	@Override
	public void enter(ViewChangeEvent event) {
		addComponent(new Label("Exception View"));

		throw new NullPointerException("This is my exmaple NPE");
	}

}
