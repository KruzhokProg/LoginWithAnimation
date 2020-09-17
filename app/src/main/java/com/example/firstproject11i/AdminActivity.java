package com.example.firstproject11i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AdminActivity extends AppCompatActivity {

    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        imgv = findViewById(R.id.imgv_admin);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_scale_animation);
        imgv.startAnimation(animation);
    }
}
