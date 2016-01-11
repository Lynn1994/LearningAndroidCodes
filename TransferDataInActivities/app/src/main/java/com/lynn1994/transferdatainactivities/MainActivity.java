package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setting button on click listener
        setButton();
    }

    /**
     * This method for setting button on click listener
     */
    private void setButton() {
        findViewById(R.id.btnToIntentWithSimpleData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Defined a Intent for skiping to another activity
                Intent intent = new Intent(MainActivity.this, IntentWithSimpleData.class);
                // Start activity
                startActivity(intent);
            }
        });
        findViewById(R.id.btnToIntentWithBundleData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Defined a Intent for skiping to another activity
                Intent intent = new Intent(MainActivity.this, IntentWithBundleData.class);
                // Start activity
                startActivity(intent);
            }
        });
        findViewById(R.id.btnToIntentWithValueObject).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Defined a Intent for skiping to another activity
                Intent intent = new Intent(MainActivity.this, IntentWithValueObject.class);
                // Start activity
                startActivity(intent);
            }
        });
        findViewById(R.id.btnGetDataFromNextActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Defined a Intent for skiping to another activity
                Intent intent = new Intent(MainActivity.this, SendBackData.class);
                // Start activity with result
                // First parameter is a intent ,second parameter is a result flag
                startActivityForResult(intent, 1);
            }
        });
    }
    /**
     * This method for getting revert value from activity
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView txtView = (TextView) findViewById(R.id.txtShowTurnBackData);
        txtView.setText("返回的内容是：" + data.getStringExtra(Constants.DATA));
    }
}
