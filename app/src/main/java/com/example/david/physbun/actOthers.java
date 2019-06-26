package com.example.david.physbun;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class actOthers extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_others);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_others, menu);
        return true;
    }

    public void actFUF(View v) {
        startActivity(new Intent(getApplicationContext(), actFUF.class));
    }
    public void actJEFT(View v) {
        startActivity(new Intent(getApplicationContext(), actJeFT.class));
    }
    public void actPEMV(View v) {
        startActivity(new Intent(getApplicationContext(), actPEMV.class));
    }
    public void actFEMA(View v) {
        startActivity(new Intent(getApplicationContext(), actFEMA.class));
    }

    public void actPMVV(View v) {
        startActivity(new Intent(getApplicationContext(), actPMVV.class));
    }

    public void actUKX(View v) {
        startActivity(new Intent(getApplicationContext(), actUKX.class));
    }
}
