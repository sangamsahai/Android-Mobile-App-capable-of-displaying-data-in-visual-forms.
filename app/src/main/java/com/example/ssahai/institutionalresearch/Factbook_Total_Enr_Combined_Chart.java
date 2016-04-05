package com.example.ssahai.institutionalresearch;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.charts.CombinedChart.DrawOrder;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.XAxis.XAxisPosition;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;


import java.util.ArrayList;

public class Factbook_Total_Enr_Combined_Chart extends Fragment {


    public Factbook_Total_Enr_Combined_Chart(){}

    private CombinedChart mChart;
    private final int itemcount = 10;
    String[] mMonths={"2005","2006","2007","2008","2009","2010","2011","2012","2013","2014"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.combined_chart, container, false);
         mChart = (CombinedChart) rootView.findViewById(R.id.chart);
        ////////////////
        mChart.setDescription("");
     //   mChart.setBackgroundColor(Color.WHITE);
        mChart.animateXY(2000, 2000);
        mChart.setDrawGridBackground(false);
        mChart.setDrawBarShadow(false);

        // draw bars behind lines
        mChart.setDrawOrder(new DrawOrder[] {
                DrawOrder.BAR,  DrawOrder.LINE,

        });

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setDrawGridLines(false);

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.setDrawGridLines(false);

        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxisPosition.BOTH_SIDED);

        CombinedData data = new CombinedData(mMonths);

        data.setData(generateLineData());
        data.setData(generateBarData());

        mChart.getLegend().setEnabled(false);
        mChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        mChart.setData(data);

        mChart.getAxisLeft().setDrawGridLines(false);
        //mChart.getXAxis().setDrawGridLines(false);

        mChart.invalidate();

        ////////////////
        return rootView;
    }

    private LineData generateLineData() {

        LineData d = new LineData();

        ArrayList<Entry> entries = new ArrayList<Entry>();

        //for (int index = 0; index < itemcount; index++)
          //  entries.add(new Entry(getRandom(15, 10), index));


        entries.add(new Entry(28001, 0));
        entries.add(new Entry(27966, 1));
        entries.add(new Entry(28260, 2));
        entries.add(new Entry(28422, 3));
        entries.add(new Entry(30049, 4));
        entries.add(new Entry(31637, 5));
        entries.add(new Entry(32327, 6));
        entries.add(new Entry(32480, 7));
        entries.add(new Entry(33111, 8));
        entries.add(new Entry(35158, 9));

        LineDataSet set = new LineDataSet(entries, "Line DataSet");
        set.setColor(Color.rgb(0, 0, 0));
        set.setLineWidth(.5f);
        set.setCircleColor(Color.rgb(0, 0, 0));
        set.setCircleSize(2f);
        set.setFillColor(Color.rgb(0, 0, 0));
        set.setDrawCubic(true);
        set.setDrawValues(true);
        set.setValueTextSize(0f);
        set.setValueTextColor(Color.rgb(0, 0, 0));

        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        d.addDataSet(set);

        return d;
    }

    private BarData generateBarData() {

        BarData d = new BarData();

        ArrayList<BarEntry> entries = new ArrayList<BarEntry>();

        //for (int index = 0; index < itemcount; index++)
          //  entries.add(new BarEntry(getRandom(15, 30), index));

        entries.add(new BarEntry(28001, 0));
        entries.add(new BarEntry(27966, 1));
        entries.add(new BarEntry(28260, 2));
        entries.add(new BarEntry(28422, 3));
        entries.add(new BarEntry(30049, 4));
        entries.add(new BarEntry(31637, 5));
        entries.add(new BarEntry(32327, 6));
        entries.add(new BarEntry(32480, 7));
        entries.add(new BarEntry(33111, 8));
        entries.add(new BarEntry(35158, 9));

        BarDataSet set = new BarDataSet(entries, "Bar DataSet");
       set.setColor(Color.rgb(161, 10, 4));
        //set.setColor(Color.);

        //set.setColors(ColorTemplate.PASTEL_COLORS);


        set.setValueTextColor(Color.rgb(0, 0, 0));
        set.setValueTextSize(7f);
        d.addDataSet(set);

        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        return d;
    }

    private float getRandom(float range, float startsfrom) {
        return (float) (Math.random() * range) + startsfrom;
    }

}

