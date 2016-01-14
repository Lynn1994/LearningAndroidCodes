package com.lynn1994.launchactivitymodel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowStandardModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_standard_model);
        // Showing detail in textView
        setText();
        // Setting button on click listener
        setButton();
    }

    private void setButton() {
        findViewById(R.id.btnStartShowStandardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowStandardModel.this, ShowStandardModel.class));
            }
        });
        findViewById(R.id.btnStartMainActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowStandardModel.this, MainActivity.class));
            }
        });
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.txtShowDetail);
        textView.setText(String.format("TaskID: %d \n\nCurrent Activity Detail: %s", getTaskId(), toString()));
    }
}
