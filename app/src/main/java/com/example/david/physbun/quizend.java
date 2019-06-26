package com.example.david.physbun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class quizend extends AppCompatActivity {
int data = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizend);


        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        data = sharedPreferences.getInt("place", 0);

        TextView P = (TextView) findViewById(R.id.textView90);



        P.setText("You got a " + (data * 10) + "%");

    }



    public void takeagain (View view)
    {
        startActivity(new Intent(getApplicationContext(), quiz1.class));

    }

    public void homey (View view)
    {
        startActivity(new Intent(getApplicationContext(), realmain.class));

    }
}
