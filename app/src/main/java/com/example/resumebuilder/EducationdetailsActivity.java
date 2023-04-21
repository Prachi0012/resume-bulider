package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EducationdetailsActivity extends AppCompatActivity {

    ImageView img2,img1,img4,img5,img6,img7,img8,img9,img10,img11,img12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educationdetails);
        initview();
    }

    private void initview() {
        img2=findViewById(R.id.img2);
        img1=findViewById(R.id.img1);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);
        img10=findViewById(R.id.img10);
        img11=findViewById(R.id.img11);
        img12=findViewById(R.id.img12);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, ObjectiveActivity.class);
                startActivity(i);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, FormActivity.class);
                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, SkillDetailsActivity.class);
                startActivity(i);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, WorkExpActivity.class);
                startActivity(i);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, AchievementActivity.class);
                startActivity(i);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, ProjectDetailsActivity.class);
                startActivity(i);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, InterestActivity.class);
                startActivity(i);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, LanguagesActivity.class);
                startActivity(i);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, ReferenceActivity.class);
                startActivity(i);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, AdditionalActivity.class);
                startActivity(i);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EducationdetailsActivity.this, PublicationActivity.class);
                startActivity(i);
            }
        });
    }
}