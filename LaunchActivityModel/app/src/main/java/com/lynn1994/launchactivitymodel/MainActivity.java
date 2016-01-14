package com.lynn1994.launchactivitymodel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setting button
        setButton();
        // Showing detail in textView
        setText();
    }

    private void setButton() {
        findViewById(R.id.btnStartShowStandardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowStandardModel.class));
            }
        });
        findViewById(R.id.btnStartShowSingleTopActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowSingleTopModel.class));
            }
        });
        findViewById(R.id.btnStartShowSingleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowSingleInstanceModel.class));
            }
        });
        findViewById(R.id.btnStartShowSingleTaskActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowSingleTaskModel.class));
            }
        });
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.txtShowDetail);
        textView.setText(String.format("TaskID: %d \n\nCurrent Activity Detail: %s", getTaskId(), toString()));
    }
}
