package com.example.app;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return ItemListPage.class;
    }

    @Override
    public void init() {
        super.init();
    }
}
