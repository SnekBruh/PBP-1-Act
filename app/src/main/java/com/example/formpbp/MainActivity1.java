package com.example.formpbp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {

    private EditText nama, tptglLhr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = findViewById(R.id.nama);
        tptglLhr = findViewById(R.id.tptglLhr);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(v -> {
            String namaUsr = nama.getText().toString();
            String ttlUsr = tptglLhr.getText().toString();

            Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
            intent.putExtra("namaUsr",namaUsr);
            intent.putExtra("ttlUsr",ttlUsr);
            startActivity(intent);
        });

    }
}