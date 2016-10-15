package com.jonathanlieblich.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WordsTwoActivity extends AppCompatActivity {
    private EditText mAdjective1;
    private EditText mAdjective2;
    private EditText mVerb;
    private EditText mNoun;
    private EditText mAnimal;
    private EditText mGame;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_two);

        mAdjective1 = (EditText) findViewById(R.id.adjective1);
        mAdjective2 = (EditText) findViewById(R.id.adjective2);
        mVerb = (EditText) findViewById(R.id.verb);
        mNoun = (EditText) findViewById(R.id.noun);
        mAnimal = (EditText) findViewById(R.id.animal);
        mGame = (EditText) findViewById(R.id.game);
        mSubmit = (Button) findViewById(R.id.submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAdjective1.getText().length() == 0||mAdjective2.getText().length() == 0
                        ||mVerb.getText().length() == 0||mNoun.getText().length() == 0
                        ||mAnimal.getText().length() == 0|| mGame.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please fill all fields",
                            Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Intent finalScreen = new Intent(WordsTwoActivity.this, ResultsTwoActivity.class);

                    finalScreen.putExtra("ADJ1", mAdjective1.getText().toString());
                    finalScreen.putExtra("ADJ2", mAdjective2.getText().toString());
                    finalScreen.putExtra("VERB", mVerb.getText().toString());
                    finalScreen.putExtra("NOUN", mNoun.getText().toString());
                    finalScreen.putExtra("ANIMAL", mAnimal.getText().toString());
                    finalScreen.putExtra("GAME", mGame.getText().toString());

                    startActivity(finalScreen);
                }
            }
        });
    }
}
