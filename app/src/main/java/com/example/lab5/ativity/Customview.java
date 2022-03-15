package com.example.lab5.ativity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab5.R;

public class Customview extends AppCompatActivity {
    private ImageView imageView2;
    private TextView name2, gia2;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        String name = bundle.getString("name");
        String gia = bundle.getString("gia");
        imageView2 = findViewById(R.id.imageView2);
        name2 = findViewById(R.id.name2);
        gia2 = findViewById(R.id.gia2);
        button4= findViewById(R.id.button4);

        imageView2.setImageResource(id);
        name2.setText(name);
        gia2.setText(gia);
        // Handle button
        button4 = findViewById(R.id.button4);
        // add event
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Customview.this, "Add to card successfully.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
