package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mGameStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Main menu with a start button and a background picture
        //Start button with intent leading to EnterWordsActivity
        mGameStart = (Button) findViewById(R.id.start);

        mGameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWordEntry = new Intent(MainActivity.this, EnterWordsActivity.class);
                startActivity(toWordEntry);
            }
        });
    }
}
