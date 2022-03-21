package com.example.lab5.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lab5.ativity.Customs_list_view_activity2;
import com.example.lab5.R;
import com.example.lab5.model.Item;

import java.util.List;

public class Customs_Listview_Adapter extends BaseAdapter {
    private List<Item> listItem;
   private Context context;
   private int idlayout;
   private int poistionSelect=-1;

    public Customs_Listview_Adapter(List<Item> listItem, Context context, int idlayout) {
        this.listItem = listItem;
        this.context = context;
        this.idlayout = idlayout;
    }

    @Override
    public int getCount() {
        if(listItem.size()!=0 && !listItem.isEmpty())
        {
            return listItem.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview==null) {
            convertview = LayoutInflater.from(parent.getContext()).inflate(idlayout, parent, false);
        }
            ImageView img = (ImageView)convertview.findViewById(R.id.imageView);
            TextView nameShop =(TextView) convertview.findViewById(R.id.nameShop);
            TextView price =convertview.findViewById(R.id.price);
            ImageButton btnAdd = convertview.findViewById(R.id.buttomrun);
             ConstraintLayout constraintLayout= (ConstraintLayout)convertview.findViewById(R.id.idConstraintLayout);
             Item item=listItem.get(position);
            if (listItem!=null && !listItem.isEmpty())
            {
                nameShop.setText(item.getNames());
                price.setText(item.getPrice());
                img.setImageResource(item.getImg());


            }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(context, Customs_list_view_activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("img",item.getImg());
                bundle.putString("names",item.getNames());
                bundle.putString("price",item.getPrice());
                in.putExtras(bundle);
                context.startActivity(in);

            }
        });

        return convertview;
    }
}
