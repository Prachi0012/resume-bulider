package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SignupActivity extends AppCompatActivity {
    EditText edtusername, edtmail, edtpassword, edtconform;
    CardView cardregister;
    TextView txtlogin;
    CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initview();
    }

    private void initview() {


        edtusername=findViewById(R.id.edtusername);
        edtmail=findViewById(R.id.edtmail);
        edtpassword=findViewById(R.id.edtpassword);
        edtconform=findViewById(R.id.edtconform);
        checkbox=findViewById(R.id.checkbox);
        cardregister=findViewById(R.id.cardregister);
        txtlogin=findViewById(R.id.txtlogin);

        cardregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username,email,password,cpass;
                username= edtusername.getText().toString();
                email=edtmail.getText().toString();
                password=edtpassword.getText().toString();
                cpass=edtconform.getText().toString();

                if(username.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Enter your Username ", Toast.LENGTH_SHORT).show();
                }
                else if (email.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Enter your Email Address ", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Enter your Password", Toast.LENGTH_SHORT).show();
                }
                else if (cpass.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Re-Enter to conform Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent ha =new Intent(SignupActivity.this,HomepageActivity.class);
                    startActivity(ha);
                }
            }
        });
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(l);
            }
        });
        CheckBox checkbox = null;
        final View invisibleView = null;
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    invisibleView.setVisibility(View.VISIBLE);
                } else
                    invisibleView.setVisibility(View.GONE);
            }
        });

    }
}