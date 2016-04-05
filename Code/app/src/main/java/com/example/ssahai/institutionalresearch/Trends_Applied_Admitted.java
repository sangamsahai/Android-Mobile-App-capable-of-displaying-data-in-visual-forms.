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
 * Created by ANKIT on 30/09/15.
 */
public class Trends_Applied_Admitted extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_Applied_Admitted(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("Applied, Admitted and Enrolled New Freshmen From High School");

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

        //For Applied
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(16687.000f, 0); // 2009
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(17624.000f, 1); // 2010
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(18051.000f, 2); // 2011
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(19323.000f, 3); // 2012
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(21948.000f, 4); // 2013
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(23157.000f, 5); // 2014
        valueSet1.add(v1e6);


        //For UAdmitted
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(11873.000f, 0); // 2009
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(11687.000f, 1); // 2010
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(12110.000f, 2); // 2011
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(12833.000f, 3); // 2012
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(14482.000f, 4); // 2013
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(14621.000f, 5); // 2014
        valueSet2.add(v2e6);



        //For Enrolled
        ArrayList<BarEntry> valueSet3 = new ArrayList<>();
        BarEntry v3e1 = new BarEntry(4859.000f, 0); // 2009
        valueSet3.add(v3e1);
        BarEntry v3e2 = new BarEntry(4466.000f, 1); // 2010
        valueSet3.add(v3e2);
        BarEntry v3e3 = new BarEntry(4564.000f, 2); // 2011
        valueSet3.add(v3e3);
        BarEntry v3e4 = new BarEntry(4785.000f, 3); // 2012
        valueSet3.add(v3e4);
        BarEntry v3e5 = new BarEntry(5620.000f, 4); // 2013
        valueSet3.add(v3e5);
        BarEntry v3e6 = new BarEntry(5161.000f, 5); // 2014
        valueSet3.add(v3e6);

//Pastel
//        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Applied");
//        // barDataSet1.setColor(Color.rgb(64, 89, 128));
//        barDataSet1.setColor(Color.rgb(64, 89, 128));
//        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Admitted");
//        // barDataSet2.setColor(Color.rgb(149, 165, 124));
//        barDataSet2.setColor(Color.rgb(149, 165, 124));
//        BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Enrolled");
//        //  barDataSet3.setColor(Color.rgb(217, 184, 162));
//        barDataSet3.setColor(Color.rgb(217, 184, 162));

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Applied");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Admitted");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
        barDataSet2.setColor(Color.rgb(41,114,181));
        BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Enrolled");
        //  barDataSet3.setColor(Color.rgb(217, 184, 162));
        barDataSet3.setColor(Color.rgb(176,133,45));

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        dataSets.add(barDataSet3);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2010");
        xAxis.add("2011");
        xAxis.add("2012");
        xAxis.add("2013");
        xAxis.add("2014");
        xAxis.add("2015");
        return xAxis;
    }

}

