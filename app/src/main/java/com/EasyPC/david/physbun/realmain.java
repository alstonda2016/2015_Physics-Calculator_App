package com.EasyPC.david.physbun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.david.physbun.Convertact;
import com.example.david.physbun.R;
import com.example.david.physbun.actDopler;
import com.example.david.physbun.actGrav;
import com.example.david.physbun.actKinetic;
import com.example.david.physbun.actLinear;
import com.example.david.physbun.actOthers;
import com.example.david.physbun.actTorque;
import com.example.david.physbun.actWork;
import com.example.david.physbun.quiz1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class realmain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realmain);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }



    public void buttonOnClick(View v) {

        startActivity(new Intent(getApplicationContext(), Convertact.class));

    }

    public void actLinear(View v){

        startActivity(new Intent(getApplicationContext(),actLinear.class));
    }

    public void actTorque(View v) {

        startActivity(new Intent(getApplicationContext(), actTorque.class));
    }

    public void actGrav(View v){
        startActivity(new Intent(getApplicationContext(), actGrav.class));

    }

    public void actWork(View v){
        startActivity(new Intent(getApplicationContext(), actWork.class));

    }

    public void actOthers(View v){
        startActivity(new Intent(getApplicationContext(), actOthers.class));

    }
    public void q1(View v){
        startActivity(new Intent(getApplicationContext(), quiz1.class));

    }

    public void actDop(View v){
        startActivity(new Intent(getApplicationContext(), actDopler.class));

    }

    public void actKinetic(View v){
        startActivity(new Intent(getApplicationContext(), actKinetic.class));

    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void Page(View v) {

        goToUrl("https://play.google.com/store/apps/dev?id=8974934457249123017&hl=en");

    }




}
