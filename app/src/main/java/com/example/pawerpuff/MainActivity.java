package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Adopt(View view) {
        Intent goAdopt = new Intent(this, Adopt.class);
        startActivity(goAdopt);
    }

    public void Donate(View view) {
        Intent goDonate = new Intent(this, Donate.class);
        startActivity(goDonate);
    }
}