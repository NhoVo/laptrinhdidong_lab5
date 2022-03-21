package com.example.lab5.ativity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.adapter.Customs_Listview_Adapter;
import com.example.lab5.R;
import com.example.lab5.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Customs_listview_activity extends AppCompatActivity {
private List<Item> listItems;
private ListView listView;
@Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.cumtoms_list_view_activity);
    listView=findViewById(R.id.idListview);
    listItems= new ArrayList<>();
    listItems.add(new Item(1,R.drawable.donut_yellow_1,"Tasty Donut","$10.00"));
    listItems.add(new Item(2,R.drawable.tasty_donut_1,"Pink Donut","$20.00"));
    listItems.add(new Item(3,R.drawable.green_donut_1,"Floating Donut","$30.00"));
    listItems.add(new Item(4,R.drawable.donut_red_1,"Tasty Donut","$10.00"));
    Customs_Listview_Adapter adapter= new Customs_Listview_Adapter(listItems, this,R.layout.item_custom_list_view);
    listView.setAdapter(adapter);
    EditText editText = findViewById(R.id.textView3);
    ArrayList<Item> dsitem = new ArrayList<>();
    editText.setOnKeyListener(new View.OnKeyListener() {
        @Override
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if(keyEvent.getAction() == keyEvent.ACTION_DOWN && keyEvent.getKeyCode() == keyEvent.KEYCODE_ENTER)
            {
                String name = editText.getText().toString().trim();
                for(Item item : listItems)
                {
                    if(item.getNames().equals(name))
                    {
                        dsitem.add(item);
                        Customs_Listview_Adapter adapter = new Customs_Listview_Adapter(dsitem,Customs_listview_activity.this,R.layout.item_custom_list_view);
                        listView.setAdapter(adapter);
                    }
                }
            }
            return false;
        }
    });
}
}
