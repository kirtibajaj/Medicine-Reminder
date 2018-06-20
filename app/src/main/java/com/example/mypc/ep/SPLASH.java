package com.example.mypc.ep;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SPLASH extends AppCompatActivity {
    Handler handler;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler=new Handler();
        i=(ImageView)findViewById(R.id.image);
        /*Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        i.setVisibility(View.VISIBLE);
        i.startAnimation(a);*/
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent my=new Intent(SPLASH.this,LoginActivity.class);
                startActivity(my);
                finish();
            }
        },1500);
    }
}
