package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentWithBundleData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_with_bundle_data);
        setButton();
    }

    private void setButton() {
        // The first method for sending bundle data
        findViewById(R.id.btnSendABundle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithBundleData.this, ShowBundleData.class);
                // Defined a new bundlw
                Bundle bundle = new Bundle();
                // put data into bundle
                bundle.putString(Constants.NAME, "Lynn");
                bundle.putInt(Constants.AGE, 22);
                // put bundle into intent
                intent.putExtra(Constants.DATA, bundle);
                startActivity(intent);
            }
        });
        // The second method for sending bundle data
        findViewById(R.id.btnSendABundle2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithBundleData.this, ShowBundleData.class);
                // Defined a new bundlw
                Bundle bundle = new Bundle();
                // put data into bundle
                bundle.putString(Constants.NAME, "Lynn");
                bundle.putInt(Constants.AGE, 22);
                bundle.putString(Constants.DEFAULT_STRING, "Is changing!");
                // put bundle into intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
