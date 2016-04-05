package com.example.ssahai.institutionalresearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact, menu);
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


    //to launch the map
    public void showMap(View view) {
        Intent intent=null;
        Intent chooser = null;

        intent=new Intent(android.content.Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:33.583444,-101.874694"));
        chooser=Intent.createChooser(intent , "Launch Maps");
        startActivity(chooser);

    }

    public void actionResourceClickHandlerGoToHome(MenuItem item) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }


    //to launch the mail app for sending email
    public void sendEmail(View view) {
        Intent intent=null;
        Intent chooser = null;

        intent=new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String[] to= {"irim@ttu.edu"};
        intent.putExtra(Intent.EXTRA_EMAIL , to);
        intent.putExtra(Intent.EXTRA_SUBJECT , "This is sent from IRIM mobile app");
        intent.putExtra(Intent.EXTRA_TEXT , "I have the following feedback / query.");
        intent.setType("message/rfc822");
        chooser=Intent.createChooser(intent,"Send Email");
        startActivity(chooser);

    }
}
