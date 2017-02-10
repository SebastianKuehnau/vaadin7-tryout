package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class FastView extends VerticalLayout implements View {

	public final static String VIEW_NAME = "fastView" ;
	
	public FastView() {
		
		addComponent(new Label("fast"));
		
		for (int i = 0; i < 100; i++) {
			addComponent(getPersonLayout());
		}
		
		setMargin(true) ;
		setSpacing(true) ;
	}
	
	private Layout getPersonLayout() {
		
		HorizontalLayout hLayout = new HorizontalLayout() ;
		
		Label leftLabel = new Label() ;
		leftLabel.setContentMode(ContentMode.HTML);
		leftLabel.setValue("Name: John Smith<br>Street: Route 66<br>City: Nirvana<br>Postal: 123456");
		hLayout.addComponent(leftLabel);
		
		Label rightLabel = new Label() ;
		rightLabel.setContentMode(ContentMode.HTML);
		rightLabel.setValue("EMail: john.smith@somewhere.com<br>Phone: 123456789<br>Fax: 987654321<br>Mobil: 192837465");
		hLayout.addComponent(rightLabel);
		
		return hLayout ;
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
