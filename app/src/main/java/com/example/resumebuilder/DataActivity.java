package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DataActivity extends AppCompatActivity {
    TextView nametxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initview();
    }

    private void initview() {
        nametxt=findViewById(R.id.nametxt);
        String fname = getIntent().getStringExtra("NAME");
        nametxt.setText(fname);
    }
}