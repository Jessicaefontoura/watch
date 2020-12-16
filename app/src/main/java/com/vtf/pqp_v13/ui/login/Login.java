package com.vtf.pqp_v13.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vtf.pqp_v13.R;
import com.vtf.pqp_v13.ui.principal.TelaPrincipal;

public class Login extends Activity{
    private String Email;
    private String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view){
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode == Activity.RESULT_OK && requestCode==1){
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

