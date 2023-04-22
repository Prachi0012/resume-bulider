package com.example.resumebuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class FormActivity extends AppCompatActivity {

    ImageView img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;

    EditText txtname, nationality, etnum, mail, address, ptitle, date, txtlname;
    AppCompatButton btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initview();

    }

    @SuppressLint("WrongViewCast")
    private void initview() {

        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img10 = findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);

        txtname = findViewById(R.id.txtname);
        btnsave = findViewById(R.id.btnsave);
        txtlname = findViewById(R.id.txtlname);
        nationality = findViewById(R.id.nationality);
        etnum = findViewById(R.id.etnum);
        mail = findViewById(R.id.mail);
        address = findViewById(R.id.address);
        ptitle = findViewById(R.id.ptitle);
        date = findViewById(R.id.date);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtname.getText().toString();
                String lname = txtlname.getText().toString();
                String DOB = date.getText().toString();
                String national = nationality.getText().toString();
                String num = etnum.getText().toString();
                String email = mail.getText().toString();
                String add = address.getText().toString();
                String title = ptitle.getText().toString();


                Intent i = new Intent(FormActivity.this, DataActivity.class);
                i.putExtra("NAME", name);
                i.putExtra("LAST NAME", lname);
                i.putExtra("D.O.B", DOB);
                i.putExtra("NATIONAL", national);
                i.putExtra("NUMBER", num);
                i.putExtra("E-MAIL", email);
                i.putExtra("ADDRESS", add);
                i.putExtra("PROFESSIONAL TITLE", title);
                startActivity(i);
            }
        });


        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, ObjectiveActivity.class);
                startActivity(i);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, EducationdetailsActivity.class);
                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, SkillDetailsActivity.class);
                startActivity(i);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, WorkExpActivity.class);
                startActivity(i);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, AchievementActivity.class);
                startActivity(i);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, ProjectDetailsActivity.class);
                startActivity(i);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, InterestActivity.class);
                startActivity(i);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, LanguagesActivity.class);
                startActivity(i);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, ReferenceActivity.class);
                startActivity(i);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, AdditionalActivity.class);
                startActivity(i);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormActivity.this, PublicationActivity.class);
                startActivity(i);
            }
        });
    }

    private ViewGroup containerView;

    private void addItem() {
        View newView = null;
        containerView.addView(newView, 0);
    }
}