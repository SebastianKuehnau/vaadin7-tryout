package com.vaadin.tutorial.application;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.tutorial.application.customer.CustomerViewImpl;
import com.vaadin.tutorial.application.customer.SpecialCustomerViewImpl;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
@Push
@PreserveOnRefresh
public class MyUI extends UI {

	private static final long serialVersionUID = 1L;

	final VerticalLayout menuLayout = new VerticalLayout();
	final HorizontalSplitPanel panel = new HorizontalSplitPanel();
	
	@Override
	protected void init(VaadinRequest vaadinRequest) {

		//create a navigator and register view there
		Navigator navigator = new Navigator(this, view -> panel.setSecondComponent((Component) view));

		navigator.addView(HelloWorldView.VIEW_NAME, new HelloWorldView());
		menuLayout.addComponent(new Button("default", event-> navigator.navigateTo(HelloWorldView.VIEW_NAME)));
		
		//see the difference between instantiating a View-Object to passing a view type to the navigator below
		navigator.addView(PreservedView.VIEW_NAME, new PreservedView());
		menuLayout.addComponent(new Button("preserved", event-> navigator.navigateTo(PreservedView.VIEW_NAME)));
		
		navigator.addView(NonPreservedView.VIEW_NAME, NonPreservedView.class);
		menuLayout.addComponent(new Button("non-preserved", event-> navigator.navigateTo(NonPreservedView.VIEW_NAME)));
		
		navigator.addView(CustomerViewImpl.VIEW_NAME, new CustomerViewImpl());
		menuLayout.addComponent(new Button("customer", event-> navigator.navigateTo(CustomerViewImpl.VIEW_NAME)));
		
		navigator.addView(SpecialCustomerViewImpl.VIEW_NAME, new SpecialCustomerViewImpl());
		menuLayout.addComponent(new Button("special customer", event-> navigator.navigateTo(SpecialCustomerViewImpl.VIEW_NAME)));
		
		navigator.addView(SlowView.VIEW_NAME, SlowView.class);
		menuLayout.addComponent(new Button("slow view", event -> navigator.navigateTo(SlowView.VIEW_NAME)));
		
		navigator.addView(FastView.VIEW_NAME, new FastView());
		menuLayout.addComponent(new Button("fast view", event -> navigator.navigateTo(FastView.VIEW_NAME)));
		
		navigator.addView(ReadOnlyView.VIEW_NAME, new ReadOnlyView());
		menuLayout.addComponent(new Button("readonly view", event -> navigator.navigateTo(ReadOnlyView.VIEW_NAME)));
		
		navigator.addView(PushView.VIEW_NAME, new PushView());
		menuLayout.addComponent(new Button("push view", event -> navigator.navigateTo(PushView.VIEW_NAME)));
		
		menuLayout.setMargin(true);
		menuLayout.setSpacing(true);
		menuLayout.setWidth(200f, Unit.PIXELS);
		
		panel.setSplitPosition(200f, Unit.PIXELS);
		
		panel.setFirstComponent(menuLayout);
		
		this.setContent(panel);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {

		private static final long serialVersionUID = 1L;
	}
}
