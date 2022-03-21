package com.example.lab5.ativity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.R;

public class Customs_list_view_activity2 extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.cumtoms_list_view_activity2);
        ImageView img1=findViewById(R.id.imageView2);
        TextView nameShop= findViewById(R.id.nameShop2);
        TextView price =findViewById(R.id.price2);

        Intent in = getIntent();
        int img =in.getIntExtra("img",0);
        String name= in.getStringExtra("names");
        String price2= in.getStringExtra("price");

        img1.setImageResource(img);
        nameShop.setText(name);
        price.setText(price2);
    }
}
