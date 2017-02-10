package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * just a hello world view with an empty view name
 * 
 * give the view a name and see what will happen, when redeploy the webpage
 *
 */
public class HelloWorldView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "";

	public HelloWorldView() {
		addComponent(new Label("Hello World"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
