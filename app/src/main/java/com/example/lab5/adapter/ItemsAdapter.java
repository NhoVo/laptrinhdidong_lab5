package com.example.lab5.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lab5.R;
import com.example.lab5.ativity.CustomListViewActivity;
import com.example.lab5.ativity.Customview;
import com.example.lab5.model.Item;


import java.util.List;


public class ItemsAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Item> listItems;
    private int positionSelect = -1;
    public ItemsAdapter(Context context, int idLayout, List<Item> listItems) {
        this.context = context;
        this.idLayout = idLayout;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        if(listItems.size() != 0 && !listItems.isEmpty()) {
            return listItems.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        ImageView imgImage = (ImageView) convertView.findViewById(R.id.imageView);
        TextView txtName = (TextView) convertView.findViewById(R.id.name);
        TextView txtgia = (TextView) convertView.findViewById(R.id.gia);
        ImageButton btnAdd = convertView.findViewById(R.id.button123);
        final ConstraintLayout constraintLayout = (ConstraintLayout) convertView.findViewById(R.id.idConconstraintlayout);
        final Item item = listItems.get(position);
        if(listItems != null && !listItems.isEmpty()) {
            txtName.setText(item.getName());
            txtgia.setText(item.getGia());
            int idItem = item.getId();
            switch (idItem) {
                case 1: imgImage.setImageResource(R.drawable.donut_yellow_1); break;
                case 2: imgImage.setImageResource(R.drawable.tasty_donut_1); break;
                case 3: imgImage.setImageResource(R.drawable.green_donut_1); break;
                case 4: imgImage.setImageResource(R.drawable.donut_red_1); break;

            }
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(context, Customview.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", item.getId());
                    bundle.putString("name", item.getName());
                    bundle.putString("gia", item.getGia());

                    in.putExtras(bundle);
                    context.startActivity(in);
                }
            });
        }
        return convertView;
    }
}
