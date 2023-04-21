package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LoginActivity extends AppCompatActivity {

    EditText edtusename, edtpassword;
    CardView cardlogin;
    TextView txtsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    private void initview() {
        edtusename = findViewById(R.id.edtusename);
        edtpassword = findViewById(R.id.edtpassword);
        cardlogin = findViewById(R.id.cardlogin);
        txtsign = findViewById(R.id.txtsign);

        cardlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = edtusename.getText().toString();
                password = edtpassword.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Enter your Username", Toast.LENGTH_SHORT).show();
                } else
                {
                    if (password.isEmpty())
                    {
                        Toast.makeText(LoginActivity.this, "Enter your Password", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent g=new Intent(LoginActivity.this,HomepageActivity.class);
                        startActivity(g);
                    }
                }
            }
        });
        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,HomepageActivity.class);
                startActivity(i);
            }
        });
    }
}