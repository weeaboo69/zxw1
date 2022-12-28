package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class zzz extends AppCompatActivity {
    private String zzzClass;
    private String zzzTarget;
    private EditText ADP;
    private EditText AD;
    private EditText DMG;
    private EditText FDMG;
    private EditText BDMG;
    private EditText CDMG;
    private EditText Brake;
    private EditText Second;
    private EditText Main;
    private TextView Answer;
    private int zzzADP;
    private int zzzAD;
    private int zzzDMG;
    private int zzzFDMG;
    private int zzzBDMG;
    private int zzzCDMG;
    private int zzzBrake;
    private int zzzMain;
    private int zzzSecond;
    private int weapon;
    private float defense;
    private int zzz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("B");
        setContentView(R.layout.activity_zzz);

        switch (zzzClass)//填職業
        {
            case "a" : weapon = 1;
        }

        switch (zzzTarget)//填目標
        {
            case "1" : defense = 1;
        }

        Button B = (Button) findViewById(R.id.StartFinal);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Answer = (TextView) findViewById(R.id.Final);
                ADP = (EditText) findViewById(R.id.AddADP);
                AD = (EditText) findViewById(R.id.AddAD);
                DMG = (EditText) findViewById(R.id.AddDMG);
                FDMG = (EditText) findViewById(R.id.AddFDMG);
                BDMG = (EditText) findViewById(R.id.AddBDMG);
                CDMG = (EditText) findViewById(R.id.AddCDMG);
                Brake = (EditText) findViewById(R.id.AddBrake);
                Main = (EditText) findViewById(R.id.AddMain);
                Second = (EditText) findViewById(R.id.AddSecond);
                zzzADP =Integer.parseInt(ADP.getText().toString());
                zzzAD =Integer.parseInt(AD.getText().toString());
                zzzDMG =Integer.parseInt(DMG.getText().toString());
                zzzFDMG =Integer.parseInt(FDMG.getText().toString());
                zzzBDMG =Integer.parseInt(BDMG.getText().toString());
                zzzCDMG =Integer.parseInt(CDMG.getText().toString());
                zzzBrake =Integer.parseInt(Brake.getText().toString());
                zzzMain =Integer.parseInt(Main.getText().toString());
                zzzSecond =Integer.parseInt(Second.getText().toString());

                //填算式

                Answer.setText(zzz);
            }
        });

        Button A = (Button) findViewById(R.id.changeB);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(zzz.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}