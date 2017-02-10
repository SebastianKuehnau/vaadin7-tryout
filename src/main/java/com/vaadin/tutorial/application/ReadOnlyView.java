package com.vaadin.tutorial.application;

import java.time.LocalDate;
import java.time.LocalTime;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ReadOnlyView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "readonly";
	
	TextField disableTextField = new TextField("disabled time field") ;
	TextField readonlyTextField = new TextField("readonly time field") ;

	Button refreshButton = new Button("refresh", event -> {
			disableTextField.setValue(LocalTime.now().toString());
			readonlyTextField.setValue(LocalTime.now().toString());
		} );
	
	public ReadOnlyView() {
		disableTextField.setValue(LocalTime.now().toString());
		disableTextField.setEnabled(false);
	
		readonlyTextField.setValue(LocalTime.now().toString());
		readonlyTextField.setReadOnly(true);
		
		addComponents(disableTextField, readonlyTextField, refreshButton);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		
	}

}
