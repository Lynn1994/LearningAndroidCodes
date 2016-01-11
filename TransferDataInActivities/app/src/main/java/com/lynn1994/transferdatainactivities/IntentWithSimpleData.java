package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentWithSimpleData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_with_simple_data);
        // Setting button on click listener
        setButton();
    }

    /**
     * This method for setting button on click listener
     */
    private void setButton() {
        findViewById(R.id.btnSendAString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithSimpleData.this, ShowStringData.class);
                // Put a string into intent
                intent.putExtra(Constants.DATA, "This string was sending by intent!");
                startActivity(intent);
            }
        });
        findViewById(R.id.btnSendAArrayString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithSimpleData.this, ShowStringData.class);
                // Put a array string into intent
                String[] strTemp = new String[]{"This array string was sending by intent!", "\nfirst message", "\nsecond message"};
                intent.putExtra(Constants.DATA, strTemp);
                startActivity(intent);
            }
        });
    }
}
