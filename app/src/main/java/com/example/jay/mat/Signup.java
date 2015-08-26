package com.example.jay.mat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.rey.material.widget.EditText;
import com.rey.material.widget.Button;

public class Signup extends ActionBarActivity implements NavigationDrawerCallbacks {

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

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
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

        // Set up the drawer.
        //mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
        // populate the navigation drawer
        //mNavigationDrawerFragment.setUserData("John Doe", "johndoe@doe.com", BitmapFactory.decodeResource(getResources(), R.drawable.avatar));



    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        //Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        if (!mNavigationDrawerFragment.isDrawerOpen()) {
//            // Only show items in the action bar relevant to this screen
//            // if the drawer is not showing. Otherwise, let the drawer
//            // decide what to show in the action bar.
//            getMenuInflater().inflate(R.menu.main, menu);
//            return true;
//        }
//        return super.onCreateOptionsMenu(menu);
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

