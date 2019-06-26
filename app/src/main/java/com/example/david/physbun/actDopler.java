package com.example.david.physbun;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class actDopler extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dopler);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_dopler, menu);
        return true;
    }

    public void actDopCMM(View v){
        startActivity(new Intent(getApplicationContext(), ActDopMM.class));

    }
    public void actDopCPP(View v){
        startActivity(new Intent(getApplicationContext(), actDopPP.class));

    }

    public void actDopcPM(View v){
        startActivity(new Intent(getApplicationContext(), actDopPM.class));

    }
    public void actDopcMP(View v){
        startActivity(new Intent(getApplicationContext(), actDopMP.class));

    }
}
