package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowResultActivity extends AppCompatActivity {
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        //Get text entered from EnterWordsActivity and plug them into a TextView with
        //the pre-composed Mad Lib sentence
        Intent entered = new Intent(getIntent());
        mResult = (TextView) findViewById(R.id.result);

        String adj1 = entered.getStringExtra("ADJ1");
        String adj2 = entered.getStringExtra("ADJ2");
        String noun1 = entered.getStringExtra("NOUN1");
        String noun2 = entered.getStringExtra("NOUN2");
        String animal = entered.getStringExtra("ANIMAL");
        String game = entered.getStringExtra("GAME");

        mResult.setText(adj1 + " " + adj2 + " " + noun1 + " " + noun2 + " " + animal + " " + game + ".");
    }
}
