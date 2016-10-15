package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mGame1Start;
    private Button mGame2Start;
    private Button mGame3Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Main menu with a start button and a background picture
        //Start button with intent leading to EnterWordsActivity
        mGame1Start = (Button) findViewById(R.id.start);
        mGame2Start = (Button) findViewById(R.id.start2);
        mGame3Start = (Button) findViewById(R.id.start3);

        mGame1Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWordEntry = new Intent(MainActivity.this, EnterWordsActivity.class);
                startActivity(toWordEntry);
            }
        });

        mGame2Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWordEntry2 = new Intent(MainActivity.this, WordsTwoActivity.class);
                startActivity(toWordEntry2);
            }
        });

        mGame3Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWordEntry3 = new Intent(MainActivity.this, WordsThreeActivity.class);
                startActivity(toWordEntry3);
            }
        });
    }
}
