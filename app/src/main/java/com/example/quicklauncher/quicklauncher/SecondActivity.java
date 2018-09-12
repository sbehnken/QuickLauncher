package com.example.quicklauncher.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.quicklancher.quicklauncher.SOMETHING")) {
            TextView tv = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.quicklancher.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
