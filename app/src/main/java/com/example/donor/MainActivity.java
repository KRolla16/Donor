package com.example.donor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSignUp= findViewById(R.id.buttonSignUp);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                            buttonLogin_onClick(view);
                                           }
                                       }
        );

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSignUp_onClick(view);
            }
        });
    }


    public void buttonLogin_onClick(View view){

    }


    public void buttonSignUp_onClick(View view){
    Intent intent = new Intent(MainActivity.this, SignUp.class);
    startActivity(intent);
    }
}
