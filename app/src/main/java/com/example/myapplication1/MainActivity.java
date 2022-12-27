package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.lang.annotation.Target;

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
    public static int MainDMG;
    public static int MainFDMG;
    public static int MainBDMG;
    public static int MainCDMG;
    public static int MainBrake;
    public static int MainAD;
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
        MainLevel =Integer.parseInt(Level.getText().toString());
        MainAtt =Integer.parseInt(Att.getText().toString());
        MainAD =Integer.parseInt(AD.getText().toString());
        MainDMG =Integer.parseInt(DMG.getText().toString());
        MainBDMG =Integer.parseInt(BDMG.getText().toString());
        MainCDMG =Integer.parseInt(CDMG.getText().toString());
        MainFDMG =Integer.parseInt(FDMG.getText().toString());
        MainBrake =Integer.parseInt(Brake.getText().toString());
        MainMain =Integer.parseInt(Main.getText().toString());
        MainSecond =Integer.parseInt(Second.getText().toString());

        Button B = (Button) findViewById(R.id.change);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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