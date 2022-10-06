package com.linex.image2textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button captureBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar())
                .setBackgroundDrawable(
                        new ColorDrawable(Color
                                .parseColor("#FF8A65")));





        captureBtn = findViewById(R.id.button);


        captureBtn.setOnClickListener(view -> {

           startActivity(new Intent(MainActivity.this, Activity_Scanner.class));

           finishAffinity();

        });



    }




}