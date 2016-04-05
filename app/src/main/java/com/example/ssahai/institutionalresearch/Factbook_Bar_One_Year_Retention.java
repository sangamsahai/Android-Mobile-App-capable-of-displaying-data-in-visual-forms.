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


public class Factbook_Bar_One_Year_Retention extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Factbook_Bar_One_Year_Retention(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("One Year Retention rate of New Full-Time Freshmen for Fall");

        com.example.ssahai.institutionalresearch.VerticalLabelView title2=(com.example.ssahai.institutionalresearch.VerticalLabelView) rootView.findViewById(R.id.verticalTextView);
        title2.setText("Percentage");


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


        ArrayList<BarEntry> valueSet1 = new ArrayList<>();

        BarEntry v1e5 = new BarEntry(82, 0);
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(82, 1);
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(81, 2);
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(82, 3);
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(83, 4);
        valueSet1.add(v1e9);


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Retention Rate");

        barDataSet1.setColor(Color.rgb(161, 10, 4));


        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);

        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2009-2010");
        xAxis.add("2010-2011");
        xAxis.add("2011-2012");
        xAxis.add("2012-2013");
        xAxis.add("2013-2014");


        return xAxis;
    }

}
