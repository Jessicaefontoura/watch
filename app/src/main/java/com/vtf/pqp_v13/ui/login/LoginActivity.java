package com.vtf.pqp_v13.ui.login;

public class LoginActivity {
    private static final String email = "admin";
    private static final String password = "admin";

    private String Email;
    private String Password;

    public String getEmail(){
         return Email;
    }
    public void setEmail(String email){
        Email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        Password = password;
    }

    public boolean ValidarUsuario(){
        if (Email.equals("")){
            return false;
        }
        else if (Password.equals("")){
            return false;
        }
        else if (!Email.equals(email) || !Password.equals(password)){
            return false;
        }
        else{
            return true;
        }

    }




}



