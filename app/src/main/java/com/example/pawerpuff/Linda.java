package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Linda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linda);

        TextView infoTextView = findViewById(R.id.infoTextView);

        String information = "Name: Linda\nSex: Female\nBreed: unknown\nYears: 3\nBirthday: June13th";
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