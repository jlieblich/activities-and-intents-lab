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
        String verb = entered.getStringExtra("VERB");
        String noun = entered.getStringExtra("NOUN");
        String animal = entered.getStringExtra("ANIMAL");
        String game = entered.getStringExtra("GAME");

        String result = "One of the most " + adj1 + " aspects of " + game + " is being able to "
                + verb + " the " + noun + ". Only three cases of this have been documented, "
                + "one of which involved the " + adj2 + " use of a " + animal + ".";

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
