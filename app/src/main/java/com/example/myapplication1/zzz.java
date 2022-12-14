package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class zzz extends AppCompatActivity {
    private String zzzClass = (MainActivity.MainClass);
    private String zzzTarget = (MainActivity.MainTarget);
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

    private int OGAtt = MainActivity.MainAtt;
    private double OGDMG = (MainActivity.MainDMG)/100;
    private double OGFDMG = (MainActivity.MainFDMG)/100;
    private double OGBDMG = (MainActivity.MainBDMG)/100;
    private double OGCDMG = (MainActivity.MainCDMG)/100;
    private double OGBrake = (MainActivity.MainBrake)/100;
    private double OGAD = (MainActivity.MainAD)/100;
    private int OGMain = MainActivity.MainMain;
    private int OGSecond = MainActivity.MainSecond;
    private double OGRAD;

    private double zzzADP ;
    private double zzzAD ;
    private double zzzDMG ;
    private double zzzFDMG ;
    private double zzzBDMG;
    private double zzzCDMG;
    private double zzzBrake;
    private int zzzMain;
    private int zzzSecond;

    private double newADP;
    private double newAD;
    private double newDMG;
    private double newFDMG;
    private double newBDMG;
    private double newCDMG;
    private double newBrake;
    private int newMain;
    private int newSecond;

    private double weapon;
    private int defense;
    private double zxw1,zxw2;
    double zzz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("B");
        setContentView(R.layout.activity_zzz);

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

                zzzADP =Double.parseDouble(ADP.getText().toString());
                zzzAD =Integer.parseInt(AD.getText().toString());
                zzzDMG =Double.parseDouble(DMG.getText().toString());
                zzzFDMG =Double.parseDouble(FDMG.getText().toString());
                zzzBDMG =Double.parseDouble(BDMG.getText().toString());
                zzzCDMG =Double.parseDouble(CDMG.getText().toString());
                zzzBrake =Double.parseDouble(Brake.getText().toString());
                zzzMain =Integer.parseInt(Main.getText().toString());
                zzzSecond =Integer.parseInt(Second.getText().toString());
                switch (zzzClass)//?????????
                {
                    case "??????" : weapon = 1.3; break;
                    case "?????????" : weapon = 1.35; break;
                }

                switch (zzzTarget)//?????????
                {
                    case "?????????" : defense = 25;break;
                    case "??????(??????)" : defense = 30;break;
                }

                OGRAD = OGAtt/((4*OGMain+OGSecond)*(1+OGAD)*(1+OGDMG)*(1+OGFDMG)*(0.01)*(weapon));

                newADP = ((MainActivity.MainAD)+zzzADP)/100;
                newAD = OGRAD+zzzAD;
                newDMG = ((MainActivity.MainDMG)+zzzDMG)/100;
                newFDMG = ((MainActivity.MainFDMG)+zzzFDMG)/100;
                newBDMG = ((MainActivity.MainBDMG)+zzzBDMG)/100;
                newCDMG = ((MainActivity.MainCDMG)+zzzCDMG)/100;
                newBrake = ((MainActivity.MainBrake)+zzzBrake)/100;
                newMain = (MainActivity.MainMain)+zzzMain;
                newSecond = (MainActivity.MainSecond)+zzzSecond;

                zxw1 = (((4*OGMain+OGSecond)*(OGRAD*(1+OGAD))*(1+OGDMG+OGBDMG)*(1+OGFDMG)*(0.01)*(weapon))*(1+OGCDMG))*((1-(defense/100))*(1-OGBrake));
                zxw2 = (((4*newMain+newSecond)*(newAD*(1+newADP))*(1+newDMG+newBDMG)*(1+newFDMG)*(0.01)*(weapon))*(1+newCDMG))*((1-(defense/100))*(1-newBrake));
                zzz = ((zxw2-zxw1)/zxw1)*100;
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