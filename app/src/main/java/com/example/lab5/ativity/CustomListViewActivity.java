package com.example.lab5.ativity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.R;
import com.example.lab5.adapter.ItemsAdapter;
import com.example.lab5.model.Item;


import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {
    private List<Item> listItems;
    private ListView lstView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        lstView = findViewById(R.id.listview);
        listItems = new ArrayList<>();

        listItems.add(new Item(1, "Tasty Donut", "$10.00"));
        listItems.add(new Item(2, "Pink Donut", "$20.00"));
        listItems.add(new Item(3, "Floating Donut", "$30.00"));
        listItems.add(new Item(4, "Tasty Donut", "$10.00"));


        ItemsAdapter adapter = new ItemsAdapter(this,R.layout.item_custom_list_view, listItems);
        lstView.setAdapter(adapter);
// add event
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CustomListViewActivity.this, Customview.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", listItems.get(i).getId());
                bundle.putString("name", listItems.get(i).getName());
                bundle.putString("gia", listItems.get(i).getGia());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
