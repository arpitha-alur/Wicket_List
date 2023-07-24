package com.example.app;

import org.apache.wicket.model.AbstractReadOnlyModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListModel extends AbstractReadOnlyModel<List<String>> implements Serializable {

    private List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    @Override
    public List<String> getObject() {
        return new ArrayList<>(items);
    }
}

