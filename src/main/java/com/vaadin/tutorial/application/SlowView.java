package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

/**
 * slow view with many layouts leads to a very slow view
 *
 */
public class SlowView extends VerticalLayout implements View {
	
	private static final long serialVersionUID = 1L;
	
	public final static String VIEW_NAME = "slowView" ;
	
	public SlowView() {
		
		addComponent(new Label("slow"));
		
		for (int i = 0; i < 100; i++) {
			addComponent(getPersonLayout());
		}
		
		setMargin(true) ;
		setSpacing(true) ;
	}
	
	private Layout getPersonLayout() {
		
		HorizontalLayout hLayout = new HorizontalLayout() ;
		
		VerticalLayout leftLayout = new VerticalLayout() ;
		VerticalLayout rightLayout = new VerticalLayout() ;
		
		hLayout.addComponent(leftLayout);
		hLayout.addComponent(rightLayout);
		
		leftLayout.addComponent(new Label("Name: John Smith"));
		leftLayout.addComponent(new Label("Street: Route 66"));
		leftLayout.addComponent(new Label("City: Nirvana"));
		leftLayout.addComponent(new Label("Postal: 123456"));
		
		rightLayout.addComponent(new Label("EMail: john.smith@somewhere.com"));
		rightLayout.addComponent(new Label("Phone: 123456789"));
		rightLayout.addComponent(new Label("Fax: 987654321"));
		rightLayout.addComponent(new Label("Mobil: 192837465"));
		
		return hLayout ;
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
