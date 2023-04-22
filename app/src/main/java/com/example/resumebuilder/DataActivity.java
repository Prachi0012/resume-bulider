package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DataActivity extends AppCompatActivity {
    TextView nametxt,dobtxt,fnametxt,pttxt,addtxt,mailtxt,nattxt,phno,eyeartxt,syeartxt,resulttxt,degtxt,clgtxt;

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



        fnametxt=findViewById(R.id.fnametxt);
        String lname = getIntent().getStringExtra("LAST NAME");
        fnametxt.setText(lname);

        dobtxt=findViewById(R.id.dobtxt);
        String dob = getIntent().getStringExtra("D.O.B");
        dobtxt.setText(dob);

        nattxt=findViewById(R.id.nattxt);
        String nat = getIntent().getStringExtra("NATIONAL");
        nattxt.setText(nat);

        phno=findViewById(R.id.phno);
        String no = getIntent().getStringExtra("NUMBER");
        phno.setText(no);

        addtxt=findViewById(R.id.addtxt);
        String addres = getIntent().getStringExtra("ADDRESS");
        addtxt.setText(addres);

        mailtxt=findViewById(R.id.mailtxt);
        String mail = getIntent().getStringExtra("E-MAIL");
        mailtxt.setText(mail);


        pttxt=findViewById(R.id.pttxt);
        String ptt = getIntent().getStringExtra("PROFESSIONAL TITLE");
        pttxt.setText(ptt);

        //EDUCATION DETAILS

        clgtxt=findViewById(R.id.clgtxt);
        String CLG = getIntent().getStringExtra("COLLEGE");
        clgtxt.setText(CLG);

        degtxt=findViewById(R.id.degtxt);
        String degree = getIntent().getStringExtra("DEGREE");
        degtxt.setText(degree);

        resulttxt=findViewById(R.id.resulttxt);
        String result = getIntent().getStringExtra("RESULT");
        resulttxt.setText(result);

        syeartxt=findViewById(R.id.syeartxt);
        String start = getIntent().getStringExtra("RESULT");
        syeartxt.setText(start);

        eyeartxt=findViewById(R.id.eyeartxt);
        String end= getIntent().getStringExtra("END");
        eyeartxt.setText(end);

    }
}