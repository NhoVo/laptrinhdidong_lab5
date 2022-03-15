package com.example.lab5.ativity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.R;

public class Customview extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        ImageView imgView = findViewById(R.id.imageView22);
        TextView tvName = findViewById(R.id.name);
        TextView tvPrice = findViewById(R.id.gia);

        Intent in = getIntent();
        int id = in.getIntExtra("id",0);
        String name = in.getStringExtra("name");
        String gia = in.getStringExtra("gia");

        imgView.setImageResource(id);
        tvName.setText(name);
        tvPrice.setText(gia);
    }
}
