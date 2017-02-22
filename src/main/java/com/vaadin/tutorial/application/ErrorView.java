package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ErrorView extends VerticalLayout implements View {

	public ErrorView() {
		addComponent(new Label("Error View"));
		addComponent(new Button("Go to Start Page", event -> getUI().getNavigator().navigateTo("")));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		
	}

}
