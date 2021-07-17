package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sign_in_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView Register;
        Register =findViewById(R.id.textRegister);
        Register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(sign_in_activity.this, "Register clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(sign_in_activity.this , sign_up_activity.class  );
                startActivity(intent);
            }
        });
    }
}