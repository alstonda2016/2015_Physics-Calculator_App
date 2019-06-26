package com.example.david.physbun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quizhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizhome);
    }


    public void q1(View v){
        startActivity(new Intent(getApplicationContext(), quiz1.class));

    }
    public void q2(View v){
        startActivity(new Intent(getApplicationContext(), quiz2.class));

    }
    public void q3(View v){
        startActivity(new Intent(getApplicationContext(), quiz3.class));

    }
    public void q4(View v){
        startActivity(new Intent(getApplicationContext(), quiz4.class));

    }
    public void q5(View v){
        startActivity(new Intent(getApplicationContext(), quiz5.class));

    }
    public void q6(View v){
        startActivity(new Intent(getApplicationContext(), quiz6.class));

    }
    public void q7(View v){
        startActivity(new Intent(getApplicationContext(), quiz7.class));

    }
    public void q8(View v){
        startActivity(new Intent(getApplicationContext(), quiz8.class));

    }
}
