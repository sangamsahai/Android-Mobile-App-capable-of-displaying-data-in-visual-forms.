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
public class Trends_Grad_Rate extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_Grad_Rate(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("Four-Year Graduation Rates");
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
        BarEntry v1e1 = new BarEntry(3862.000f, 0);
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(4439.000f, 1);
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(4338.000f, 2);
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(4514.000f, 3);
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(4759.000f, 4);
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(4413.000f, 5);
        valueSet1.add(v1e6);





        //Total Graduated
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(1427.000f, 0);
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(1455.000f, 1);
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(1413.000f, 2);
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(1582.000f, 3);
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(1623.000f, 4);
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(1537.000f, 5);
        valueSet2.add(v2e6);






//JOYFUL_COLORS
        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Cohort");
        // barDataSet1.setColor(Color.rgb(64, 89, 128));
        barDataSet1.setColor(Color.rgb(161, 10, 4));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Total Graduated");
        // barDataSet2.setColor(Color.rgb(149, 165, 124));
        barDataSet2.setColor(Color.rgb(41,114,181));
     //   BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Law");
        //  barDataSet3.setColor(Color.rgb(217, 184, 162));
      //  barDataSet3.setColor(Color.rgb(245, 199, 0));

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
       // dataSets.add(barDataSet3);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2006");
        xAxis.add("2007");
        xAxis.add("2008");
        xAxis.add("2009");
        xAxis.add("2010");
        xAxis.add("2011");


        return xAxis;
    }

}

