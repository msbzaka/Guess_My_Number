package com.example.user.guessmynumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;
    private Button AnswerButton;
    private EditText AnswerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnswerButton=(Button) findViewById(R.id.check);
        AnswerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x =Integer.parseInt(AnswerText.getText().toString());
                int difference=number-x;
                Log.v("GEN ",difference+"");
                if(difference<=5 && difference >=-5)
                    Toast.makeText(MainActivity.this,"Very Close !",Toast.LENGTH_LONG).show();
                else if(difference <-5)
                    Toast.makeText(MainActivity.this,"Greater !",Toast.LENGTH_LONG).show();
                else if(difference >5)
                    Toast.makeText(MainActivity.this,"Smaller !",Toast.LENGTH_LONG).show();
            }
        });
        AnswerText=(EditText) findViewById(R.id.answer);

        Random rnd=new Random();
        number=rnd.nextInt(1001);
    }
}
