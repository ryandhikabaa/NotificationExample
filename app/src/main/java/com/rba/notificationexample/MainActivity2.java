package com.rba.notificationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvReceiver = findViewById(R.id.tvReceiver);

        String pesan = getIntent().getStringExtra("pesan");
        tvReceiver.setText(pesan);
    }
}