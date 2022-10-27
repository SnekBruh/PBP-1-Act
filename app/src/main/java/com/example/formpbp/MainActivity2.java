package com.example.formpbp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nama, ttl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = findViewById(R.id.tabnama);
        ttl = findViewById(R.id.tabttl);

        Intent intent = getIntent();

        String namaUsr = intent.getStringExtra("namaUsr");
        String ttlUsr = intent.getStringExtra("ttlUsr");

        nama.setText(namaUsr);
        ttl.setText(ttlUsr);
    }
}