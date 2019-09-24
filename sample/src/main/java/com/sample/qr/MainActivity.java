package com.sample.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.loyal.qr.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Util.DEBUG)
            System.out.println("MainActivity");
    }
}
