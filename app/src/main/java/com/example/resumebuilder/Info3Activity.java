package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Info3Activity extends AppCompatActivity {
    CardView btnnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);
        initview();
    }

    private void initview() {
        btnnext2=findViewById(R.id.btnnext2);
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Info3Activity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}