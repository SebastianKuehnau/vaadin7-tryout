package com.vaadin.tutorial.application;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * example view with push feature of Vaadin
 *
 */
public class PushView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "push";
	
	final TextField textField = new TextField() ;
	
	Integer counter = 1 ;
	
	public PushView() {
		textField.setConverter(Integer.class);
		textField.setConvertedValue(counter);
		
		addComponent(textField);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		new CounterThread().start();
	}

	class CounterThread extends Thread {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				getUI().access(new Runnable() {
					
					@Override
					public void run() {
						counter++;
						textField.setConvertedValue(counter);
					}
				});
				
			}
		}
		
	}
	
}
