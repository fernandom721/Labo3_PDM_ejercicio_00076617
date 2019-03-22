package com.example.ejercicio_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.ejercicio_labo3.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView mName,mLastname, mEmail, mUniv;
    private Button mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mName=findViewById(R.id.tv_name);
        mLastname=findViewById(R.id.tv_lastname);
        mEmail=findViewById(R.id.tv_email);
        mUniv=findViewById(R.id.tv_universidad);
        mButtonShare=findViewById(R.id.btn_share);

        Intent mIntent= getIntent();
        if (mIntent!= null){
            mName.setText(mIntent.getStringExtra(AppConstant.NAME_KEY));
            mLastname.setText(mIntent.getStringExtra(AppConstant.LNAME_KEY));
            mEmail.setText(mIntent.getStringExtra(AppConstant.EMAIL_KEY));
            mUniv.setText(mIntent.getStringExtra(AppConstant.UNIV_KEY));
        }

        mButtonShare.setOnClickListener(v->{
            Intent sIntent = new Intent(SecondActivity.this,ThirdActivity.class);
            String name=mName.getText().toString();
            sIntent.putExtra(AppConstant.NAME_KEY,name);

            String lastname=mLastname.getText().toString();
            sIntent.putExtra(AppConstant.LNAME_KEY,lastname);

            String email=mEmail.getText().toString();
            sIntent.putExtra(AppConstant.EMAIL_KEY,email);

            String univ=mUniv.getText().toString();
            sIntent.putExtra(AppConstant.UNIV_KEY,univ);

            startActivity(sIntent);
        });
    }
}
