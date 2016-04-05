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
public class Trends_Semester_Credit_Hours extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_Semester_Credit_Hours(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("Semester Credit Hours");
        TextView title2=(TextView) rootView.findViewById(R.id.subText);
        title2.setText("For TTU - Fiscal Year Term");

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

        //For Graduates
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(100275.000f, 0); // 2009
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(103930.000f, 1); // 2010
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(103559.000f, 2); // 2011
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(100377.000f, 3); // 2012
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(104151.000f, 4); // 2013
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(111551.000f, 5); // 2014
        valueSet1.add(v1e6);


        //For Undergraduates
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(692974.000f, 0); // 2009
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(724336.000f, 1); // 2010
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(748399.000f, 2); // 2011
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(749561.000f, 3); // 2012
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(763113.000f, 4); // 2013
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(799383.000f, 5); // 2014
        valueSet2.add(v2e6);



        //For Law
        ArrayList<BarEntry> valueSet3 = new ArrayList<>();
        BarEntry v3e1 = new BarEntry(18646.000f, 0); // 2009
        valueSet3.add(v3e1);
        BarEntry v3e2 = new BarEntry(19735.000f, 1); // 2010
        valueSet3.add(v3e2);
        BarEntry v3e3 = new BarEntry(20136.000f, 2); // 2011
        valueSet3.add(v3e3);
        BarEntry v3e4 = new BarEntry(20135.000f, 3); // 2012
        valueSet3.add(v3e4);
        BarEntry v3e5 = new BarEntry(18345.000f, 4); // 2013
        valueSet3.add(v3e5);
        BarEntry v3e6 = new BarEntry(18607.000f, 5); // 2014
        valueSet3.add(v3e6);


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Graduate");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Undergraduate");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
        barDataSet2.setColor(Color.rgb(41,114,181) );
        BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Law");
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

