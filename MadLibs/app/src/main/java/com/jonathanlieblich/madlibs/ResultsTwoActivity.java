package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsTwoActivity extends AppCompatActivity {
    private TextView mResult;
    private Button mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_two);
        Intent entered = new Intent(getIntent());
        mResult = (TextView) findViewById(R.id.result);

        String adj1 = entered.getStringExtra("ADJ1");
        String adj2 = entered.getStringExtra("ADJ2");
        String noun1 = entered.getStringExtra("NOUN1");
        String noun2 = entered.getStringExtra("NOUN2");
        String animal = entered.getStringExtra("ANIMAL");
        String game = entered.getStringExtra("GAME");

        String result = "A vacation is when you take a trip to some " + adj1 + " place with"
                + "your " + adj2 + " family. Usually, you go to some place that is near a " + noun1
                + "or up on a " + noun2 + ". A good vacation place is one where you can ride "
                + animal + " or play " + game + ".";

        mResult.setText(result);

        mBackButton = (Button) findViewById(R.id.goBack);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
