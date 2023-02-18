package com.example;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@JavaScript("./script.js")
@Route
public class MainView extends Div {

    public MainView() {
        add(new H1("It works!"));
        callJsMethodInTheBrowser();
    }

    private void callJsMethodInTheBrowser() {
        getElement().executeJs("greet($0,$1)", "client", getElement());
    }

    @ClientCallable
    public void greet(String name) {
        System.out.println("Hi, " + name);
    }
}
