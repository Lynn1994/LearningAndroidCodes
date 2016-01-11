package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendBackData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_back_data);
        findViewById(R.id.btnSendBackData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                EditText editText = (EditText) findViewById(R.id.etxInput);
                intent.putExtra(Constants.DATA, editText.getText().toString());
                // Set a result to get
                setResult(1, intent);
                finish();
            }
        });
    }
}
