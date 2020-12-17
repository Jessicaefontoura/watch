package com.vtf.pqp_v13.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.vtf.pqp_v13.MainActivity2;

import com.vtf.pqp_v13.R;
import com.vtf.pqp_v13.ui.principal.TelaPrincipal;

public class Login extends AppCompatActivity {
    private static final String email = "admin";
    private static final String password = "admin";
    private AppCompatButton button;



    private String Email;
    private String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);


    }
    public void Login(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        button = (AppCompatButton) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, TelaPrincipal.class));
            }
        });
        if (resultCode == Activity.RESULT_OK && requestCode == 1) {
            startActivity(new Intent(Login.this, TelaPrincipal.class));
        }
    }

    public void setEmail(String email) {

        Email = email;
    }

    public String getEmail() {

        return Email;
    }

    public void setPassword(String password) {

        Password = password;
    }

    public String getPassword() {

        return Password;
    }

    public boolean ValidarUsuario(){
        if (Email.equals("")){
            return false;
        }
        else if (Password.equals("")){
            return false;
        }
        else if (!Email.equals(Email) || !Password.equals(Password)){
            return false;
        }
        else{
            return true;
        }
    }


}

