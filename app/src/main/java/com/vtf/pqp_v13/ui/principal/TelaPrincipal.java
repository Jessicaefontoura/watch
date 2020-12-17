package com.vtf.pqp_v13.ui.principal;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.vtf.pqp_v13.R;
import com.vtf.pqp_v13.ui.login.Login;


public class TelaPrincipal extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.item_filme);
        InicializaObjetos();
    }

    public void InicializaObjetos() {
        edtEmail = (EditText) findViewById(R.id.email);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
    }

    private void MsgInformativa(String msg){
        new AlertDialog.Builder(this)
                .setTitle("Watch")
                .setMessage(msg)
                .setPositiveButton("ok", null)
                .setCancelable(false)
                .show();
    }

    public void Login (View v){
        Login classe_login = new Login();
        classe_login.setEmail(edtEmail.getText().toString());
        classe_login.setPassword(edtPassword.getText().toString());

        if (classe_login.ValidarUsuario()==false){
            MsgInformativa("Dados Incorretos, Favor preencher corretamente!");
        }
        else{
            setResult(AppCompatActivity.RESULT_OK);
            finish();
        }
    }
}