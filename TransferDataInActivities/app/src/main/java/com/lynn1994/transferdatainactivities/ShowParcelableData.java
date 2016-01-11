package com.lynn1994.transferdatainactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Lynn on 2016/1/11.
 */
public class ShowParcelableData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data_detail);
        // Setting textView showing information
        try {
            setText();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method for showing information in textView
     */
    private void setText() {
        TextView txtShowDataDetail = (TextView) findViewById(R.id.txtShowDataDetail);
        User2 user2 = getIntent().getParcelableExtra(Constants.DATA);
        if (user2 != null) {
            txtShowDataDetail.setText(String.format("User2 information(Name:%s,Age:%d)", user2.getName(), user2.getAge()));
        }
    }

}
