package com.cameron.smartbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

public class RepCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep_counter);
    }

    public void run() throws IOException {
        String msg = System.in.read();
        TextView textView = (TextView) findViewById(R.id.repCount);
        textView.setText(msg);

    }
}

