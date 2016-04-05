package com.example.ssahai.institutionalresearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.Locale;

public class TrendsPager extends AppCompatActivity {

    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trends_pager);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_trends_pager, menu);
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



    public void actionResourceClickHandlerAae(MenuItem item) {

        mViewPager.setCurrentItem(0);
    }

    public void actionResourceClickHandlerDeg(MenuItem item) {

        mViewPager.setCurrentItem(1);
    }

    public void actionResourceClickHandlerDe(MenuItem item) {

        mViewPager.setCurrentItem(2);
    }

    public void actionResourceClickHandlerEnr(MenuItem item) {

        mViewPager.setCurrentItem(3);
    }

    public void actionResourceClickHandlerGr(MenuItem item) {

        mViewPager.setCurrentItem(4);
    }

    public void actionResourceClickHandlerNfr(MenuItem item) {

        mViewPager.setCurrentItem(5);
    }

    public void actionResourceClickHandlerNgr(MenuItem item) {

        mViewPager.setCurrentItem(6);
    }

    public void actionResourceClickHandlerNut(MenuItem item) {

        mViewPager.setCurrentItem(7);
    }

    public void actionResourceClickHandlerRr(MenuItem item) {

        mViewPager.setCurrentItem(8);
    }

    public void actionResourceClickHandlerSCH(MenuItem item) {

        mViewPager.setCurrentItem(9);
    }
/////////////////////////////////////////
    public void actionResourceClickHandlerGoToSite(MenuItem item) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.irim.ttu.edu/Trends/"));
        startActivity(intent);
    }

    public void actionResourceClickHandlerGoToHome(MenuItem item) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }

    /////////////////////


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a Factbook_Enrolled_By_Gender (defined as a static inner class below).
            Fragment fragment = null;
            switch (position)
            {
                case 0:
                    fragment = new Trends_Applied_Admitted();  //change it to 1 later !
                    break;
                case 1:
                    fragment = new Trends_Degrees_Conferred();
                    break;
                case 2:
                    fragment = new Trends_Distance_Education();
                    break;
                case 3:
                    fragment = new Trends_Total_Enrollment();
                    break;
                case 4:
                    fragment = new Trends_Grad_Rate();
                    break;
                case 5:
                    fragment = new Trends_New_Freshmen_High_School();
                    break;
                case 6:
                    fragment = new Trends_New_Grad_Students();
                    break;
                case 7:
                    fragment = new Trends_New_Undergrad_Transfers();
                    break;
                case 8:
                    fragment = new Trends_Retention();
                    break;
                case 9:
                    fragment = new Trends_Semester_Credit_Hours();
                    break;

            }
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "";
                case 1:
                    return "";

            }
            return null;
        }
    }

}
