package com.codekul.vwanm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animate(View vw) {
        Animation anim = AnimationUtils
                .loadAnimation(this, R.anim.rotate);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(MainActivity.this, DashActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        findViewById(R.id.img).startAnimation(anim);
    }
}
