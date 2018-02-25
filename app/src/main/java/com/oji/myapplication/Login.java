package com.oji.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button x;
    EditText tUsername, tPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void masuk(View view) {//method onclick masuk
        tUsername = (EditText) findViewById(R.id.tUsername); //set variable
        tPass = (EditText) findViewById(R.id.tPassword); //set variable
        String username = "EAD"; //set variable username EAD
        String pass = "MOBILE"; //set variable pass MOBILE
        if (tUsername.getText().toString().equals(username) && tPass.getText().toString().equals(pass)){ //jika username && (dan) password sesuai
            Intent i = new Intent(this, ContentMenu.class);
            startActivity(i); //jika berhasil start activity

        }else { //jika salah akan menampilkan Toast
            Toast.makeText(this,"Username/PAssword Salah!!" , Toast.LENGTH_SHORT).show();

        }


    }
}
