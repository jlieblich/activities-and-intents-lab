package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.jonathanlieblich.madlibs.R.id.animal;

public class ResultsThreeActivity extends AppCompatActivity {
    private TextView mResult;
    private Button mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_three);
        Intent entered = new Intent(getIntent());
        mResult = (TextView) findViewById(R.id.result);

        String adj1 = entered.getStringExtra("ADJ1");
        String adj2 = entered.getStringExtra("ADJ2");
        String noun1 = entered.getStringExtra("NOUN1");
        String noun2 = entered.getStringExtra("NOUN2");
        String verb = entered.getStringExtra("VERB");
        String celeb = entered.getStringExtra("CELEB");

        String result = "Something often " + verb + " by many is " + celeb + "'s ability to"
                + " find a " + adj1 + " " + noun1 + ". Experts in human behavior attribute this "
                + adj2 + " response to our brain's hard-wired desire for " + noun2 + ".";

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
