package com.lynn1994.transferdatainactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowBundleData extends AppCompatActivity {

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
        // Getting a Bundle with first method
        Bundle bundle = getIntent().getBundleExtra(Constants.DATA);
        // Getting a Bundle with second method
        Bundle bundle2 = getIntent().getExtras();
        if (bundle != null) {
            // Showing a bundle data in textView
            txtShowDataDetail.setText(String.format(" Name = %s \n Age = %d", bundle.getString(Constants.NAME), bundle.getInt(Constants.AGE)));
            txtShowDataDetail.setText(txtShowDataDetail.getText() +
                    "\n Show default string " + String.format("\n Name = %s \n Age = %d \n DefaultString = %s", bundle.getString(Constants.NAME), bundle.getInt(Constants.AGE),
                    bundle.getString(Constants.DEFAULT_STRING, "I am Default string,if the bundle has this value,I will be replaced by it!")));
        } else if (bundle2 != null) {
            txtShowDataDetail.setText(String.format(" Name = %s \n Age = %d", bundle2.getString(Constants.NAME), bundle2.getInt(Constants.AGE)));
            txtShowDataDetail.setText(txtShowDataDetail.getText() +
                    "\n Show default string " + String.format("\n Name = %s \n Age = %d \n DefaultString = %s", bundle2.getString(Constants.NAME), bundle2.getInt(Constants.AGE),
                    bundle2.getString(Constants.DEFAULT_STRING), "I am Default string,if the bundle has this value,I will replaced by it!"));
        }
    }
}
