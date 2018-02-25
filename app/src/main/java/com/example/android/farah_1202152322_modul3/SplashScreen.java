package com.example.android.farah_1202152322_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent p = new Intent(SplashScreen.this, LoginActivity.class); //untuk lanjut ke activity login
                startActivity(p);
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
