package com.example.mlkandroidchartapidemo;

import java.util.ArrayList;

import com.example.mlkandroidchartapidemo.R;

import android.app.Activity;
import android.os.Bundle;
import mlk.androidchartapi.MlkBar;
import mlk.androidchartapi.MlkBarsView;

public class BarExempleActivity extends Activity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_exemple);
        
        MlkBarsView chart = (MlkBarsView) findViewById(R.id.barChart);
        
        
        ArrayList<MlkBar> bars = new ArrayList<MlkBar>();
		
        bars.add(new MlkBar(1, "one"));
        bars.add(new MlkBar(3, "three"));
        bars.add(new MlkBar(2, "two"));
        
		chart.setBars(bars);
    }


}
