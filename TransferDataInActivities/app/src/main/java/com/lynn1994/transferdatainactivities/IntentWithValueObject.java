package com.lynn1994.transferdatainactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentWithValueObject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_with_value_object);
        setButton();
    }

    private void setButton() {
        // Sending object with Serializable method
        findViewById(R.id.btnSendWithSerializable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithValueObject.this, ShowSerializableData.class);
                User user = new User("Lynn", 22);
                intent.putExtra(Constants.DATA, user);
                startActivity(intent);
            }
        });
        // Sending object with Parcelable
        findViewById(R.id.btnSendWithParcelable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentWithValueObject.this, ShowParcelableData.class);
                User2 user = new User2("Lynn", 22);
                intent.putExtra(Constants.DATA, user);
                startActivity(intent);
            }
        });
    }
}
