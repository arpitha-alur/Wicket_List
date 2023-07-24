package com.example.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import java.util.ArrayList;
import java.util.List;

public class ItemListPage extends WebPage {

    private List<String> items = new ArrayList<>();

    public ItemListPage() {
        add(new ItemForm("itemForm"));
        add(new ListView<String>("itemList", items) {
            @Override
            protected void populateItem(ListItem<String> listItem) {
                listItem.add(new ItemLabel("itemLabel", listItem.getModelObject()));
            }
        });
    }

    private class ItemForm extends Form<Void> {

        private String newItem;

        public ItemForm(String id) {
            super(id);

            add(new TextField<>("newItem", Model.of("")));
        }

        @Override
        protected void onSubmit() {
            if (newItem != null && !newItem.trim().isEmpty()) {
                items.add(newItem);
                newItem = "";
            }
        }
    }

    private class ItemLabel extends WebPage {

        public ItemLabel(String id, String text) {
            add(new Label(id, text));
        }
    }
}
