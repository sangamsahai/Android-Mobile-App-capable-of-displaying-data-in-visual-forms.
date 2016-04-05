package com.example.ssahai.institutionalresearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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


    //method to show the TRENDS Screen
    public void showTrendsScreen(View view) {

        Intent staffIntent = new Intent(this, TrendsPager.class); // Using MP Chart Library
        startActivity(staffIntent);

    }

    //method to show the Staff Screen
    public void showStaffScreen(View view) {
        Intent staffIntent = new Intent(this, StaffActivity.class);
       startActivity(staffIntent);






    }

    //method to show the About  Us Screen
    public void showAboutScreen(View view) {
        Intent aboutIntent = new Intent(this, AboutActivity.class);
        startActivity(aboutIntent);
    }

    //method to show the Contact US screen
    public void showContactScreen(View view) {
        Intent contactIntent = new Intent(this, ContactActivity.class);
        startActivity(contactIntent);
    }

    //to show Fact book screen
    public void showFactBookScreen(View view) {
        Intent staffIntent = new Intent(this, FactbookPager.class);
        startActivity(staffIntent);
    }
}
