package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.Model.Account;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private List<Account> accountList;

    private EditText usernameText;
    private EditText passwordText;
    private TextView loginBtn;
    private TextView createAccount;
    private TextView forgotPassword;

    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initUi();
    }

    private void initUi() {
        usernameText = findViewById(R.id.etUsername);
        passwordText = findViewById(R.id.etPassword);
        loginBtn = findViewById(R.id.btnLogin);
        createAccount = findViewById(R.id.tvCreateAccount);
        forgotPassword = findViewById(R.id.tvForgotPassword);
    }


}