package com.abramova.test.login.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route
@PageTitle("HelloWorld")
public class MainView extends VerticalLayout {

    public MainView() {

        H1 helloWorldH1 = new H1("Hello, World!");

        Button button = new Button("Click me!");

        Anchor logout = new Anchor("logout", "Log Out");

        setAlignItems(Alignment.CENTER);

        add(helloWorldH1, button, logout);

        button.addClickListener(clickEvent -> Notification.show("Have a nice day :)")
                .setPosition(Notification.Position.TOP_START));
    }
}
