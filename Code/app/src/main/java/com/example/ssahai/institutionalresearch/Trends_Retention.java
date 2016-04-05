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
public class Trends_Retention extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_Retention(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("One Year Retention");
        TextView title2=(TextView) rootView.findViewById(R.id.subText);
        title2.setText("For TTU - Fall to Fall");

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

        //For Cohort
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(4514.000f, 0); // 2010
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(4759.000f, 1); // 2011
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(4413.000f, 2); // 2012
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(4494.000f, 3); // 2013
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(4725.000f, 4); // 2014
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(5519.000f, 5); // 2015
        valueSet1.add(v1e6);


        //For Total Retained
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(3691.000f, 0); // 2010
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(3904.000f, 1); // 2011
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(3562.000f, 2); // 2012
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(3701.000f, 3); // 2013
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(3944.000f, 4); // 2014
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(4606.000f, 5); // 2015
        valueSet2.add(v2e6);






        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Cohort");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Total Retained");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
        barDataSet2.setColor(Color.rgb(41,114,181));


        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);

        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2009");
        xAxis.add("2010");
        xAxis.add("2011");
        xAxis.add("2012");
        xAxis.add("2013");
        xAxis.add("2014");
        return xAxis;
    }

}

