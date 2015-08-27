package com.example.jay.mat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.rey.material.widget.Button;



public class Profile extends ActionBarActivity implements NavigationDrawerCallbacks {

    private Toolbar mToolbar;
    private TextView tvHome,name,profilename,pronumber,number,location,destination,description,descnumber;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Button edit;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();

        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        tvHome = (TextView) findViewById(R.id.toolbar_title);
        name = (TextView) findViewById(R.id.etProfile);
        profilename = (TextView) findViewById(R.id.etprofilename);
        pronumber = (TextView) findViewById(R.id.etPronumber);
        number = (TextView) findViewById(R.id.etpronum);
        location = (TextView) findViewById(R.id.etLocation);
        destination = (TextView) findViewById(R.id.etAdd);
        description = (TextView) findViewById(R.id.etDesc);
        descnumber = (TextView) findViewById(R.id.etDescnum);
        edit = (Button) findViewById(R.id.btEdit);
        setSupportActionBar(mToolbar);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvHome.setText("Profile");

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");


        name.setTypeface(myCustomFont);
        profilename.setTypeface(myCustomFont);
        pronumber.setTypeface(myCustomFont);
        number.setTypeface(myCustomFont);
        location.setTypeface(myCustomFont);
        destination.setTypeface(myCustomFont);
        description.setTypeface(myCustomFont);
        descnumber.setTypeface(myCustomFont);
        edit.setTypeface(myCustomFont);


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
                //Intent search = new Intent(this, Notification.class);
                //startActivity(search);
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
                //Intent search = new Intent(this, Product.class);
                //startActivity(search);
            }
            if(position==6) { // my profile
                Intent search = new Intent(this, Profile.class);
                startActivity(search);
            }
            if(position==7) { // settings
                //Intent search = new Intent(this, Splash.class);
                //startActivity(search);
            }
            if(position==8) { //FAQ
                //Intent search = new Intent(this, Signup.class);
                //startActivity(search);
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

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int pixels) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);

        final int color = 0xff424242;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);
        final float roundPx = pixels;

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);

        return output;
    }
}

