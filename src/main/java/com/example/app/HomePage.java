package com.example.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

    public HomePage() {
        add(new Label("message", "Hello, World! This is a simple Wicket application."));
    }
}

