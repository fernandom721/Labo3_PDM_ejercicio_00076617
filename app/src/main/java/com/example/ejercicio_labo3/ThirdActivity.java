package com.example.ejercicio_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ejercicio_labo3.utils.AppConstant;

public class ThirdActivity extends AppCompatActivity {

    private TextView mName,mLastname, mEmail, mUniv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mName=findViewById(R.id.stv_name);
        mLastname=findViewById(R.id.stv_lastname);
        mEmail=findViewById(R.id.stv_email);
        mUniv=findViewById(R.id.stv_universidad);


        Intent sIntent= getIntent();
        if (sIntent!= null){
            mName.setText(sIntent.getStringExtra(AppConstant.NAME_KEY));
            mLastname.setText(sIntent.getStringExtra(AppConstant.LNAME_KEY));
            mEmail.setText(sIntent.getStringExtra(AppConstant.EMAIL_KEY));
            mUniv.setText(sIntent.getStringExtra(AppConstant.UNIV_KEY));
        }

        String datos = "Nombre: "+mName.getText().toString()+", Apellido: "+mLastname.getText().toString()+", Correo: "+mEmail.getText().toString()+", Universidad: "+mUniv.getText().toString();
        Intent tIntent = new Intent();
        tIntent.setType("text/plain");
        tIntent.setAction(Intent.ACTION_SEND);
        tIntent.putExtra(Intent.EXTRA_TEXT,datos);
        startActivity(tIntent);

    }
}
