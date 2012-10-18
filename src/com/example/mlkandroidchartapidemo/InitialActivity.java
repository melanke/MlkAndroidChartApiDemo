package com.example.mlkandroidchartapidemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InitialActivity extends Activity {
    Activity _this = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial);
        
        
        ((Button)findViewById(R.id.barChartExampleButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				_this.startActivity(new Intent(_this, BarExempleActivity.class));
				
			}
		});

        ((Button)findViewById(R.id.linesChartExampleButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				_this.startActivity(new Intent(_this, LineExampleActivity.class));
				
			}
		});
    }

    
}
