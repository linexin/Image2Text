package com.linex.image2textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getColor(R.color.theme_bg));
        setContentView(R.layout.activity_splash_screen);

       Objects.requireNonNull(getSupportActionBar()).hide();

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(SplashScreen.this, MainActivity.class));
               finish();
           }
       }, 3000);
    }

}