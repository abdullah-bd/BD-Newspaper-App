package com.spark.ab.newspaper;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class PlayWITHnumbers_Activity extends AppCompatActivity {
    EditText numberEditText;
    Button guessButton;
    TextView score,HScore;
    int c=0,hsc=9999;
    int randomNumber ,userGuessNumber ;
    SharedPreferences mPrefs ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_withnumbers_);

        HScore = findViewById(R.id.hsc);

        mPrefs= getSharedPreferences("HS1", 0);

        String mString = mPrefs.getString("HS1", "0");
        int temp=Integer.parseInt(mString);
        if (temp>0) {
            hsc =temp;
            HScore.setText("High Score="+hsc+" tries");
        }

        numberEditText = findViewById(R.id.numberET);
        score = findViewById(R.id.sc1);

        Random rand = new Random();
        randomNumber = rand.nextInt(10);
        guessButton = findViewById(R.id.submittv);
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st=String.valueOf(numberEditText.getText());
                if (!st.isEmpty()) {
                    userGuessNumber = Integer.parseInt(st);
                    if (randomNumber > userGuessNumber) {
                        Toast.makeText(PlayWITHnumbers_Activity.this, "Enter a higher number", Toast.LENGTH_SHORT).show();
                        c++;

                    } else if (randomNumber < userGuessNumber) {
                        Toast.makeText(PlayWITHnumbers_Activity.this, "Enter a lower number", Toast.LENGTH_SHORT).show();
                        c++;
                    } else {
                        c++;
                        Toast.makeText(PlayWITHnumbers_Activity.this, "Congratulation! YOU OWN!! \n"+"Won by "+c+" tires.", Toast.LENGTH_SHORT).show();
                        Random rand = new Random();
                        randomNumber = rand.nextInt(10);
                        if (hsc>c){
                            hsc=c;
                            HScore.setText("High Score="+hsc+" tries");
                            SharedPreferences.Editor mEditor = mPrefs.edit();
                            mEditor.putString("HS1", String.valueOf(c)).commit();
                        }
                        c=0;
                    }
                }else {
                    Toast.makeText( PlayWITHnumbers_Activity.this, "Enter valid number!!", Toast.LENGTH_SHORT).show();
                }

                score.setText("Tried "+c+" times");
            }
        });


    }
}
