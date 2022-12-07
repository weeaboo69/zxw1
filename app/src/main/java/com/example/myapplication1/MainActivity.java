package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("A");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B = (Button) findViewById(R.id.change);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, zzz.class);
                startActivity(intent);
            }
        });
    }
}