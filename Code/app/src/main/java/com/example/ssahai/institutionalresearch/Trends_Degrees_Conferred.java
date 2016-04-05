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
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by Sangam on 30/09/15.
 */
public class Trends_Degrees_Conferred extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    public Trends_Degrees_Conferred(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mpchart, container, false);
        BarChart chart = (BarChart) rootView.findViewById(R.id.chart);

        TextView title=(TextView) rootView.findViewById(R.id.textView);
        title.setText("Degrees Conferred By Degree Type");
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

        //For Bachelors
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(4478.000f, 0); // 2009
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(4606.000f, 1); // 2010
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(4941.000f, 2); // 2011
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(5206.000f, 3); // 2012
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(5231.000f, 4); // 2013
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(5331.000f, 5); // 2014
        valueSet1.add(v1e6);


        //For Masters
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(1222.000f, 0); // 2009
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(1300.000f, 1); // 2010
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(1605.000f, 2); // 2011
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(1365.000f, 3); // 2012
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(1305.000f, 4); // 2013
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(1429.000f, 5); // 2014
        valueSet2.add(v2e6);



        //For Doctoral
        ArrayList<BarEntry> valueSet3 = new ArrayList<>();
        BarEntry v3e1 = new BarEntry(243.000f, 0); // 2009
        valueSet3.add(v3e1);
        BarEntry v3e2 = new BarEntry(265.000f, 1); // 2010
        valueSet3.add(v3e2);
        BarEntry v3e3 = new BarEntry(253.000f, 2); // 2011
        valueSet3.add(v3e3);
        BarEntry v3e4 = new BarEntry(306.000f, 3); // 2012
        valueSet3.add(v3e4);
        BarEntry v3e5 = new BarEntry(317.000f, 4); // 2013
        valueSet3.add(v3e5);
        BarEntry v3e6 = new BarEntry(332.000f, 5); // 2014
        valueSet3.add(v3e6);


        //For Law
        ArrayList<BarEntry> valueSet4 = new ArrayList<>();
        BarEntry v4e1 = new BarEntry(210.000f, 0); // 2009
        valueSet4.add(v4e1);
        BarEntry v4e2 = new BarEntry(199.000f, 1); // 2010
        valueSet4.add(v4e2);
        BarEntry v4e3 = new BarEntry(216.000f, 2); // 2011
        valueSet4.add(v4e3);
        BarEntry v4e4 = new BarEntry(238.000f, 3); // 2012
        valueSet4.add(v4e4);
        BarEntry v4e5 = new BarEntry(213.000f, 4); // 2013
        valueSet4.add(v4e5);
        BarEntry v4e6 = new BarEntry(211.000f, 5); // 2014
        valueSet4.add(v4e6);


//Liberty
        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Bachelors");
        barDataSet1.setColor(Color.rgb(161, 10, 4) );
        //barDataSet1.setColors(ColorTemplate.PASTEL_COLORS);

        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Masters");
        barDataSet2.setColor(Color.rgb(41,114,181) );
        //barDataSet2.setColors(ColorTemplate.PASTEL_COLORS);

        BarDataSet barDataSet3 = new BarDataSet(valueSet3, "Doctoral");
        barDataSet3.setColor(Color.rgb(176,133,45));
        //barDataSet3.setColors(ColorTemplate.PASTEL_COLORS);

        BarDataSet barDataSet4 = new BarDataSet(valueSet4, "Law");
        barDataSet4.setColor(Color.rgb(109, 112, 74));
        //barDataSet4.setColors(ColorTemplate.PASTEL_COLORS);


        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        dataSets.add(barDataSet3);
        dataSets.add(barDataSet4);
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

