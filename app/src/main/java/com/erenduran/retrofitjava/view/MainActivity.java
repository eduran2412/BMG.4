package com.erenduran.retrofitjava.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.erenduran.retrofitjava.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         // api oluşturuldu
        //https://api.nomics.com/v1/prices?key=09b342bbcce01a8f095f65ba8f174f2a

    }
}