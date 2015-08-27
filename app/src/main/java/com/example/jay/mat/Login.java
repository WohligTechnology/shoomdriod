package com.example.jay.mat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.rey.material.widget.EditText;
import com.rey.material.widget.Button;

public class Login extends ActionBarActivity {

    private Toolbar mToolbar;
    private TextView tvHome;
    private EditText username,password;
    private Button login;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();

        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        tvHome = (TextView) findViewById(R.id.toolbar_title);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btLogin);
        signup = (TextView) findViewById(R.id.etSignup);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvHome.setText("Login");

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");

        username.setTypeface(myCustomFont);
        password.setTypeface(myCustomFont);
        login.setTypeface(myCustomFont);
        signup.setTypeface(myCustomFont);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login = new Intent(Login.this,MainActivity.class);
                startActivity(login);
            }
        });
    }

    public void openSignUp(View v)
    {
        Intent signup = new Intent(this, Signup.class);
        startActivity(signup);
    }
}

