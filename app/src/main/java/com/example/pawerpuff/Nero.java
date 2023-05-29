package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nero);

        TextView infoTextView = findViewById(R.id.infoTextView);

        String information = "Name: Nero\nSex: Male\nBreed: German Shepherd\nYears: 2\nBirthday: April2nd";
        infoTextView.setText(information);

    }

    public void Physical(View view) {
        Intent Physical = new Intent(this, Physically.class);
        startActivity(Physical);
    }

    public void Virtually(View view) {
        Intent Virtually = new Intent(this, Virtually.class);
        startActivity(Virtually);
    }

}