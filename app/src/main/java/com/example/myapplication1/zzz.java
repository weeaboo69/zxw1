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

    private int OGLevel = MainActivity.MainLevel;
    private int OGAtt = MainActivity.MainAtt;
    private float OGDMG = (MainActivity.MainDMG)/100;
    private float OGFDMG = (MainActivity.MainFDMG)/100;
    private float OGBDMG = (MainActivity.MainBDMG)/100;
    private float OGCDMG = (MainActivity.MainCDMG)/100;
    private float OGBrake = (MainActivity.MainBrake)/100;
    private float OGAD = (MainActivity.MainAD)/100;
    private int OGMain = MainActivity.MainMain;
    private int OGSecond = MainActivity.MainSecond;
    private double OGRAD;

    private float zzzADP ;
    private float zzzAD ;
    private float zzzDMG ;
    private float zzzFDMG ;
    private float zzzBDMG;
    private float zzzCDMG;
    private float zzzBrake;
    private int zzzMain;
    private int zzzSecond;

    private float newADP = ((MainActivity.MainAD)+zzzADP)/100;
    private double newAD = OGRAD+zzzAD;
    private float newDMG = ((MainActivity.MainDMG)+zzzDMG)/100;
    private float newFDMG = ((MainActivity.MainFDMG)+zzzFDMG)/100;
    private float newBDMG = ((MainActivity.MainBDMG)+zzzBDMG)/100;
    private float newCDMG = ((MainActivity.MainCDMG)+zzzCDMG)/100;
    private float newBrake = ((MainActivity.MainBrake)+zzzBrake)/100;
    private int newMain = (MainActivity.MainMain)+zzzMain;
    private int newSecond = (MainActivity.MainSecond)+zzzSecond;

    private double weapon;
    private int defense;
    private double zxw1,zxw2;
    double zzz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("B");
        setContentView(R.layout.activity_zzz);

        switch (zzzClass)//填職業
        {
            case "箭神" : weapon = 1.3; break;
            case "神射手" : weapon = 1.35; break;
        }

        switch (zzzTarget)//填目標
        {
            case "巴洛古" : defense = 25;break;
            case "炎魔(簡單)" : defense = 30;break;
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
                zzzADP =Float.parseFloat(ADP.getText().toString());
                zzzAD =Integer.parseInt(AD.getText().toString());
                zzzDMG =Float.parseFloat(DMG.getText().toString());
                zzzFDMG =Float.parseFloat(FDMG.getText().toString());
                zzzBDMG =Float.parseFloat(BDMG.getText().toString());
                zzzCDMG =Float.parseFloat(CDMG.getText().toString());
                zzzBrake =Float.parseFloat(Brake.getText().toString());
                zzzMain =Integer.parseInt(Main.getText().toString());
                zzzSecond =Integer.parseInt(Second.getText().toString());

                //填算式 zxw2/zxw1
                OGRAD = (OGAtt/(4*OGMain+OGSecond)*(1+OGAD)*(1+OGDMG)*(1+OGFDMG)*0.01*(weapon));
                zxw1 = ((4*OGMain+OGSecond)*(OGRAD*(1+OGAD))*(1+OGDMG+OGBDMG)*(1+OGFDMG)*0.01*(weapon)*(1+OGCDMG))*(1-((defense)*(1-OGBrake))/100);
                zxw2 = ((4*newMain+newSecond)*(newAD*(1+newADP))*(1+newDMG+newBDMG)*(1+newFDMG)*0.01*(weapon)*(1+newCDMG))*(1-((defense)*(1-newBrake))/100);
                zzz = zxw2/zxw1;
                Answer.setText(Double.toString(zzz));
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