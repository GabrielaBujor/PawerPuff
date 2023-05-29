package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Adopt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);
    }

    public void onBtn1Click(View view) {
        Intent adoptGhiocel = new Intent(this, Ghiocel.class);
        startActivity(adoptGhiocel);
    }

    public void onBtn2Click(View view) {
        Intent adoptLeo = new Intent(this, Leo.class);
        startActivity(adoptLeo);
    }

    public void onBtn3Click(View view) {
        Intent adoptLinda = new Intent(this, Linda.class);
        startActivity(adoptLinda);
    }

    public void onBtn4Click(View view) {
        Intent adoptLiz = new Intent(this, Liz.class);
        startActivity(adoptLiz);
    }

    public void onBtn5Click(View view) {
        Intent adoptLucky = new Intent(this, Lucky.class);
        startActivity(adoptLucky);
    }

    public void onBtn6Click(View view) {
        Intent adoptMaya = new Intent(this, Maya.class);
        startActivity(adoptMaya);
    }

    public void onBtn7Click(View view) {
        Intent adoptMiky = new Intent(this, Miky.class);
        startActivity(adoptMiky);
    }

    public void onBtn8Click(View view) {
        Intent adoptNero = new Intent(this, Nero.class);
        startActivity(adoptNero);
    }

    public void onBtn9Click(View view) {
        Intent adoptNegro = new Intent(this, Negro.class);
        startActivity(adoptNegro);
    }

    public void onBtn10Click(View view) {
        Intent adoptSascha = new Intent(this, Sascha.class);
        startActivity(adoptSascha);
    }

    public void onBtn11Click(View view) {
        Intent adoptScooby = new Intent(this, Scooby.class);
        startActivity(adoptScooby);
    }

    public void onBtn12Click(View view) {
        Intent adoptToby = new Intent(this, Toby.class);
        startActivity(adoptToby);
    }

    public void onBtn13Click(View view) {
        Intent adoptTundra = new Intent(this, Tundra.class);
        startActivity(adoptTundra);
    }

    public void onBtn14Click(View view) {
        Intent adoptUrsu = new Intent(this, Ursu.class);
        startActivity(adoptUrsu);
    }

    public void onBtn15Click(View view) {
        Intent adoptYogi = new Intent(this, Yogi.class);
        startActivity(adoptYogi);
    }
}