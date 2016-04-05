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

/**
 * Created by Sangam on 30/09/15.
 */
public class Trends_New_Freshmen_High_School extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_New_Freshmen_High_School(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("New Freshmen from High School");
        TextView title2=(TextView) rootView.findViewById(R.id.subText);
        title2.setText("For TTU - Fall Term");

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("");
        chart.animateXY(2000, 2000);
        chart.invalidate();
        chart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);

        return rootView;
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        //Total Enrolled
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
//        BarEntry v1e1 = new BarEntry(3922.000f, 0);
//        valueSet1.add(v1e1);
//        BarEntry v1e2 = new BarEntry(4514.000f, 1);
//        valueSet1.add(v1e2);
//        BarEntry v1e3 = new BarEntry(4407.000f, 2);
//        valueSet1.add(v1e3);
//        BarEntry v1e4 = new BarEntry(4586.000f, 3);
//        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(4859.000f, 0);
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(4466.000f, 1);
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(4564.000f, 2);
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(4785.000f, 3);
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(5620.000f, 4);
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(5161.000f, 5);
        valueSet1.add(v1e10);









        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Total Enrolled");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
       // BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Total Graduated");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
       // barDataSet2.setColor(Color.rgb(106, 150, 31));
        //   BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Law");
        //  barDataSet3.setColor(Color.rgb(217, 184, 162));
        //  barDataSet3.setColor(Color.rgb(245, 199, 0));

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
       // dataSets.add(barDataSet2);
        // dataSets.add(barDataSet3);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
//        xAxis.add("2006");
//        xAxis.add("2007");
//        xAxis.add("2008");
//        xAxis.add("2009");
        xAxis.add("2010");
        xAxis.add("2011");
        xAxis.add("2012");
        xAxis.add("2013");
        xAxis.add("2014");
        xAxis.add("2015");

        return xAxis;
    }

}

