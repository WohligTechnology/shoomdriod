package com.example.jay.mat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.LayoutInflater;

public class Search extends ActionBarActivity implements NavigationDrawerCallbacks{

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Toolbar mToolbar;
    private TextView tvHome;
    private int i=0;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();

        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        tvHome = (TextView) findViewById(R.id.toolbar_title);
        setSupportActionBar(mToolbar);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvHome.setText("Search");

        // Set up the drawer.
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
        // populate the navigation drawer
        //mNavigationDrawerFragment.setUserData("John Doe", "johndoe@doe.com", BitmapFactory.decodeResource(getResources(), R.drawable.avatar));
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        //Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();

        if(i>0){

            if(position==0) { // home
                Intent search = new Intent(this, MainActivity.class);
                startActivity(search);
            }
            if(position==1) { // orders
                Intent search = new Intent(this, Walletproduct.class);
                startActivity(search);
            }
            if(position==2) { // fav shop
                Intent search = new Intent(this, FavShops.class);
                startActivity(search);
            }
            if(position==3) { // noti
                Intent search = new Intent(this, Notification.class);
                startActivity(search);
            }
            if(position==4) { //order history
                Intent search = new Intent(this, Orders.class);
                startActivity(search);
            }
            if(position==5) { //wishlist
                Intent search = new Intent(this, Wishlist.class);
                startActivity(search);
            }
            if(position==6) { // my profile
                Intent search = new Intent(this, Profile.class);
                startActivity(search);
            }
            if(position==7) { // settings
                Intent search = new Intent(this, Settings.class);
                startActivity(search);
            }
            if(position==8) { //FAQ
                Intent search = new Intent(this, Faq.class);
                startActivity(search);
            }
            if(position==9) { // Logout
                Intent search = new Intent(this, Login.class);
                startActivity(search);
            }
        }
        i++;

    }


    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void openProduct(View v)
    {
        Intent product = new Intent(this,Product.class);
        startActivity(product);
    }

    public void openDiscount(View v)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.layout_alert_discount, null));
        builder.setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void openCategory(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.layout_alert_category, null));
        builder.setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void openDistance(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.layout_alert_distance, null));
        builder.setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void openSprite(View v)
    {
        Intent search = new Intent(this, Product2.class);
        startActivity(search);
    }

    public void openLays(View v)
    {
        Intent search = new Intent(this, Product.class);
        startActivity(search);
    }

    public void openKurkure(View v)
    {
        Intent search = new Intent(this, Product3.class);
        startActivity(search);
    }

    public void openKrackjack(View v)
    {
        Intent search = new Intent(this, Product4.class);
        startActivity(search);
    }
}
