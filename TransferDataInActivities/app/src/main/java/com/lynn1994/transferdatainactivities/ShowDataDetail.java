package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowDataDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data_detail);
        // Setting textView showing information
        setText();
    }

    /**
     * This method for showing information in textView
     */
    private void setText() {
        TextView txtShowDataDetail = (TextView) findViewById(R.id.txtShowDataDetail);

    }
}
