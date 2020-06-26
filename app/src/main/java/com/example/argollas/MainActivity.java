package com.example.argollas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView splashView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splash = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intentSplash = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(intentSplash);
                    finish();

                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        };
    splash.start();

    }
}
