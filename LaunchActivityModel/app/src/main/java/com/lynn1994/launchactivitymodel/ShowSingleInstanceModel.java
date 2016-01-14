package com.lynn1994.launchactivitymodel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowSingleInstanceModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_single_instance_model);
        // Setting button
        setButton();
        // Showing detail in textView
        setText();
    }

    private void setButton() {
        findViewById(R.id.btnStartMainActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowSingleInstanceModel.this, MainActivity.class));
            }
        });
        findViewById(R.id.btnStartShowSingleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowSingleInstanceModel.this, ShowSingleInstanceModel.class));
            }
        });
    }

    private void setText() {
        TextView textView = (TextView) findViewById(R.id.txtShowDetail);
        textView.setText(String.format("TaskID: %d \n\nCurrent Activity Detail: %s", getTaskId(), toString()));
    }
}
