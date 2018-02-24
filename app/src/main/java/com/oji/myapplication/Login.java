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

    public void masuk(View view) {
        tUsername = (EditText) findViewById(R.id.tUsername);
        tPass = (EditText) findViewById(R.id.tPassword);
        String username = "EAD";
        String pass = "MOBILE";
        if (tUsername.getText().toString().equals(username) && tPass.getText().toString().equals(pass)){
            Intent i = new Intent(this, ContentMenu.class);
            startActivity(i);

        }else {
            Toast.makeText(this, tPass.getText(), Toast.LENGTH_SHORT).show();

        }


    }
}
