package com.example.mlkandroidchartapidemo;

import java.util.ArrayList;

import com.example.mlkandroidchartapidemo.R;

import mlk.androidchartapi.MlkLine;
import mlk.androidchartapi.MlkLinesView;
import android.app.Activity;
import android.os.Bundle;

public class LineExampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_example);
        
        MlkLinesView chart = (MlkLinesView) findViewById(R.id.lineChart);
        
        
        ArrayList<MlkLine> lines = new ArrayList<MlkLine>();
		
        float[] values2 = {0.1F, 7.2F, 3.3F, 5.4F, 1.5F, 6.6F, 2.7F, 4.8F};
		lines.add(new MlkLine(values2));
		
        float[] values = {1, 4, 2, 3, 5, 7, 6};
		int lineColor = 0xFF0000FF;
        int gradientTopColor = 0xFF0000FF;
		int gradientBottomColor = 0x000000FF;
		MlkLine line = new MlkLine(values);
		line.setLineColor(lineColor);
		line.setGradientColorsAreaFill(gradientTopColor, gradientBottomColor);
		lines.add(line);
        
		chart.setLines(lines);
    }

    
}
