package com.spark.ab.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bdnews24,banglanews24,report24,DMP,JustN,Palo,itt,sama,juga,kalk,jjd,pwn,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bdnews24 = findViewById(R.id.hsvb1);
        bdnews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, BDnews24.class);
                startActivity(gotoBDnews);
            }
        });
        banglanews24 = findViewById(R.id.hsvb2);
        banglanews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, banglanews24.class);
                startActivity(gotoBDnews);
            }
        });
        report24 = findViewById(R.id.hsvb3);
        report24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, report24.class);
                startActivity(gotoBDnews);
            }
        });

        DMP = findViewById(R.id.hsvb4);
        DMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, DMP_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        JustN = findViewById(R.id.hsvb5);
        JustN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, JUSTn_Activity.class);

                startActivity(gotoBDnews);
            }
        });
        Palo = findViewById(R.id.btn1);
        Palo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, Palo_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        itt = findViewById(R.id.btn2);
        itt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, Ittefaq_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        sama = findViewById(R.id.btn3);
        sama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, Samakal_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        juga = findViewById(R.id.btn5);
        juga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, Jugantor_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        kalk = findViewById(R.id.btn6);
        kalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, KalerK_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        jjd = findViewById(R.id.btn7);
        jjd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, JJD_Activity.class);
                startActivity(gotoBDnews);
            }
        });
        pwn = findViewById(R.id.pwn);
        pwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, PWN.class);

                startActivity(gotoBDnews);
            }
        });
        about = findViewById(R.id.abt);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBDnews = new Intent(MainActivity.this, About_Activity.class);
                startActivity(gotoBDnews);
            }
        });
    }
}
