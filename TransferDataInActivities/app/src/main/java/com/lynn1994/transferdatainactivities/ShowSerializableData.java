package com.lynn1994.transferdatainactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Lynn on 2016/1/11.
 */
public class ShowSerializableData extends AppCompatActivity {

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
        // Getting a object from intent with Serializable
        User user = (User) getIntent().getSerializableExtra(Constants.DATA);
        if (user != null) {
            txtShowDataDetail.setText(String.format("User information(Name:%s,Age:%d)", user.getName(), user.getAge()));
        }
    }
}
