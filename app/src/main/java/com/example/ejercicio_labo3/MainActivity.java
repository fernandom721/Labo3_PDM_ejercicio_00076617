package com.example.ejercicio_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio_labo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mUsername, mLastname, mEmail, mUniv;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername=findViewById(R.id.et_name);
        mLastname=findViewById(R.id.et_lastname);
        mEmail=findViewById(R.id.et_email);
        mUniv=findViewById(R.id.et_universidad);
        mSubmit=findViewById(R.id.btn_submit);

        mSubmit.setOnClickListener(v->{
            Intent mIntent=new Intent(MainActivity.this, SecondActivity.class);
            String name=mUsername.getText().toString();
            mIntent.putExtra(AppConstant.NAME_KEY,name);

            String lastname=mLastname.getText().toString();
            mIntent.putExtra(AppConstant.LNAME_KEY,lastname);

            String email=mEmail.getText().toString();
            mIntent.putExtra(AppConstant.EMAIL_KEY,email);

            String universidad=mUniv.getText().toString();
            mIntent.putExtra(AppConstant.UNIV_KEY,universidad);
            startActivity(mIntent);
        });

    }
}
