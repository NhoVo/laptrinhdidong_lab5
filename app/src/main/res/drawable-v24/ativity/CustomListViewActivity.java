package com.example.lab5.ativity;


import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.R;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {
    private List<Item> listItems;
    private ListView lstView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_custom_list_view);

        lstView = findViewById(R.id.listview);
        listItems = new ArrayList<>();

        listItems.add(new Item(1, "Tasty Donut", "$10.00"));
        listItems.add(new Item(2, "Pink Donut", "$20.00"));
        listItems.add(new Item(3, "Floating Donut", "$30.00"));
        listItems.add(new Item(4, "Tasty Donut", "$10.00"));


        ItemsAdapter adapter = new ItemsAdapter(this,R.layout.item_custom_list_view, listItems);
        lstView.setAdapter(adapter);
    }
}
