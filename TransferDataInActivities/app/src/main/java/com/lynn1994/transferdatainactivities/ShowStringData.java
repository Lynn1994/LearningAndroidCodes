package com.lynn1994.transferdatainactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Lynn on 2016/1/11.
 */
public class ShowStringData extends AppCompatActivity {

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
        // Getting a array string
        String[] strTemp = getIntent().getStringArrayExtra(Constants.DATA);
        // Getting a string
        String strTemp2 = getIntent().getStringExtra(Constants.DATA);
        if (strTemp != null) {
            // Showing a array string in textView
            for (String str : strTemp) {
                txtShowDataDetail.setText(txtShowDataDetail.getText() + str);
            }
        } else if (strTemp2 != null) {
            // Showing a string in textView
            txtShowDataDetail.setText(strTemp2);
        }
    }
}
