package com.example.ssahai.institutionalresearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.Locale;

public class FactbookPager extends AppCompatActivity {

    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factbook_pager);


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
        getMenuInflater().inflate(R.menu.menu_factbook_pager, menu);
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



    public void actionResourceClickHandlerGoToHome(MenuItem item) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }

    public void actionResourceClickHandlerENR(MenuItem item) {
        mViewPager.setCurrentItem(0);
    }
    public void actionResourceClickHandlerCLG(MenuItem item) {
        mViewPager.setCurrentItem(1);
    }
    public void actionResourceClickHandlerGDR(MenuItem item) {
        mViewPager.setCurrentItem(2);
    }
    public void actionResourceClickHandlerETH(MenuItem item) {
        mViewPager.setCurrentItem(3);
    }
    public void actionResourceClickHandlerRETR(MenuItem item) {
        mViewPager.setCurrentItem(4);
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
                // 0 is grid , 1 is bar , 2= pie , 3= combined
                case 0:
                    fragment = new Factbook_Total_Enr_Combined_Chart();  //Combined - total enr
                    break;
                case 1:
                    fragment = new Factbook_Grid_New_Students();  // Grid - new students
                    break;
                case 2:
                fragment = new Factbook_Enrolled_By_Gender(); //  Bar - enrolled by gender
                break;
                case 3:
                    fragment = new Factbook_Grid2_Freshmen_By_Ethnicity(); //  Grid2 - ethnicity
                    break;
                case 4:
                    fragment = new Factbook_Bar_One_Year_Retention(); //  Bar - One Year Retention
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }



        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "Factbook_Enrolled_By_Gender";
                case 1:
                    return "Chart2";
                case 2:
                    return "Factbook_Total_Enr_Combined_Chart";
            }
            return null;
        }
    }


}
