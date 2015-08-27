package com.example.jay.mat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.rey.material.widget.EditText;
import com.rey.material.widget.Button;

public class Signup extends ActionBarActivity {

    private Toolbar mToolbar;
    private TextView tvHome;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private EditText passwordt,firstname,lastname,email,number,confirmpassword;
    private Button btsignup;
//    private TextView hsignup;
    private TextView hsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Intent intent = getIntent();

        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        tvHome = (TextView) findViewById(R.id.toolbar_title);
        passwordt = (EditText) findViewById(R.id.etPasswordt);
        btsignup = (Button) findViewById(R.id.btSignup);
//        hsignup = (TextView) findViewById(R.id.etHsignup);
        hsignin = (TextView) findViewById(R.id.etSignin);
        firstname = (EditText) findViewById(R.id.etFirstname);
        lastname = (EditText) findViewById(R.id.etLastname);
        email = (EditText) findViewById(R.id.etEmail);
        number = (EditText) findViewById(R.id.etNumber);
        confirmpassword = (EditText) findViewById(R.id.etConfirmpassword);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvHome.setText("Signup");

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");


        passwordt.setTypeface(myCustomFont);
        btsignup.setTypeface(myCustomFont);
//        hsignup.setTypeface(myCustomFont);
        hsignin.setTypeface(myCustomFont);
        firstname.setTypeface(myCustomFont);
        lastname.setTypeface(myCustomFont);
        email.setTypeface(myCustomFont);
        number.setTypeface(myCustomFont);
        confirmpassword.setTypeface(myCustomFont);

    }

    public void openMain(View v)
    {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void openLogin(View v)
    {
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }


}

