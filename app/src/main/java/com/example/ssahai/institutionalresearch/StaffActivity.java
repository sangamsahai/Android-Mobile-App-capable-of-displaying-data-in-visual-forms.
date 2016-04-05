package com.example.ssahai.institutionalresearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class StaffActivity extends AppCompatActivity {


    //Array of Staff Members
    String[] staff = new String[] {
            "West, Vicki",
            "Terry, Roger",
            "Sahu, Pradip Kumar",

            "Elkins, Mary",
            "Ford, Kerri",
            "Mallindine, Julie",
            "Merriman, Katie",
            "Barlow, Tess",
            "McPherson, Ashley",
            "Chigullapally, Vamshi",
            "Ramanathan, Sathappan",
            "Sahai, Sangam",
            "Shivarudra, Manasa",
            "Reynolds, Jeanine",
            "Spallholz, Julie",
            "White, Lesli",
            "Terry, Roger",
            "Sahu, Pradip",
            "Ranganathan, Raj",
            "Burns, Nicholas",
            "Kilasevalpatti, Usha"


    };


    //Array of Staff Members
    String[] position = new String[] {
            "Managing Director",
            "Associate Managing Director",
            "Associate Managing Director",

            "Unit Manager",
            "Unit Coordinatore",
            "Unit Coordinator",
            "Graduate Assistant",
            "Unit Manager",
            "Unit Coordinator",
            "Graduate Assistant",
            "Graduate Assistant",
            "Graduate Assistant",
            "Graduate Assistant",
            "Unit Manager",
            "Unit Coordinator",
            "Unit Coordinator",
            "Associate Managing Director",
            "Associate Managing Director",
            "Programmer/Analyst III",
            "Programmer/Analyst III",
            "Programmer/Analyst III"

    };

    //Array of Staff Members
    String[] phone = new String[] {
            "834-2108",
            "834-4452",
            "834-0568",

            "834-0844",
            "834-2991",
            "834-2073",
            "834-1072",
            "834-4632",
            "834-3709",
            "834-0156",
            "834-4832",
            "834-3510",
            "834-0156",
            "834-4933",
            "834-4818",
            "834-1791",
            "834-4452",
            "834-0568",
            "834-6404",
            "834-5580",
            "742-2166"


    };



    // Array of integers points to images stored in /res/drawable-ldpi/





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<21;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("staff",  staff[i]);
            hm.put("position", position[i]);
            hm.put("phone", phone[i]);

            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "staff","position","phone" };

        // Ids of views in listview_layout
        int[] to = { R.id.staff,R.id.position,R.id.phone};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.listview);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_staff, menu);
        return true;
    }

    public void actionResourceClickHandlerGoToHome(MenuItem item) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
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
}
