package com.example.ssahai.institutionalresearch;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;


public class Factbook_Enrolled_By_Gender extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Factbook_Enrolled_By_Gender(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("Fall 2014 New Enrolled Freshmen by Gender");

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("");
        chart.animateXY(2000, 2000);
        chart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        chart.invalidate();
        return rootView;
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        //For Females
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(2330.000f, 0); // 2009
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(2158.000f, 1); // 2010
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(2203.000f, 2); // 2011
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(2277.000f, 3); // 2012
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(2668.000f, 4); // 2013
        valueSet1.add(v1e5);


        //For Males
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(2520.000f, 0); // 2009
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(2305.000f, 1); // 2010
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(2360.000f, 2); // 2011
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(2505.000f, 3); // 2012
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(2952.000f, 4); // 2013
        valueSet2.add(v2e5);





        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Female");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Male");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
        barDataSet2.setColor(Color.rgb(41,114,181));


        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);

        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2010");
        xAxis.add("2011");
        xAxis.add("2012");
        xAxis.add("2013");
        xAxis.add("2014");

        return xAxis;
    }

}

