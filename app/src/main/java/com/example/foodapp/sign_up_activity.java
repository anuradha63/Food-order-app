package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView Signin;
        Signin =findViewById(R.id.textLogin);
        Signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(sign_up_activity.this, " Login clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(sign_up_activity.this , sign_in_activity.class  );
                startActivity(intent);
            }
        });
    }
}