package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private Spinner sp2;
    private EditText Level;
    private EditText Att;
    private EditText DMG;
    private EditText FDMG;
    private EditText BDMG;
    private EditText CDMG;
    private EditText Brake;
    private EditText AD;
    private EditText Main;
    private EditText Second;
    public static String MainClass;
    public static String MainTarget;
    public static int MainLevel;
    public static int MainAtt;
    public static double MainDMG;
    public static double MainFDMG;
    public static double MainBDMG;
    public static double MainCDMG;
    public static double MainBrake;
    public static double MainAD;
    public static int MainMain;
    public static int MainSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("A");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Level = (EditText) findViewById(R.id.InLevel);
        Att = (EditText) findViewById(R.id.InAtt);
        DMG = (EditText) findViewById(R.id.InDMG);
        BDMG = (EditText) findViewById(R.id.InBDMG);
        FDMG = (EditText) findViewById(R.id.InFDMG);
        CDMG = (EditText) findViewById(R.id.InCDMG);
        AD = (EditText) findViewById(R.id.InAD);
        Brake = (EditText) findViewById(R.id.InBrake);
        Main = (EditText) findViewById(R.id.InMain);
        Second = (EditText) findViewById(R.id.InSecond);

        Button B = (Button) findViewById(R.id.change);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainLevel =Integer.parseInt(Level.getText().toString());
                MainAtt =Integer.parseInt(Att.getText().toString());
                MainAD =Double.parseDouble(AD.getText().toString());
                MainDMG =Double.parseDouble(DMG.getText().toString());
                MainBDMG =Double.parseDouble(BDMG.getText().toString());
                MainCDMG =Double.parseDouble(CDMG.getText().toString());
                MainFDMG =Double.parseDouble(FDMG.getText().toString());
                MainBrake =Double.parseDouble(Brake.getText().toString());
                MainMain =Integer.parseInt(Main.getText().toString());
                MainSecond =Integer.parseInt(Second.getText().toString());
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, zzz.class);
                startActivity(intent);
            }
        });
        sp = (Spinner) findViewById(R.id.InClass);

        // 設定 sp 元件 ItemSelected 事件的 listener
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                MainClass = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        sp2 = (Spinner) findViewById(R.id.InTarget);

        // 設定 sp 元件 ItemSelected 事件的 listener
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                MainTarget = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });


    }
}