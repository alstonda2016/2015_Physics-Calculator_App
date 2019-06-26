package com.example.david.physbun;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class ActTeRF extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_te_rf);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_te_r, menu);
        return true;
    }

    public void btnClearTERF (View v) {

        EditText txtT = (EditText) findViewById(R.id.editText15);
        EditText txtR = (EditText) findViewById(R.id.editText17);
        EditText txtF = (EditText) findViewById(R.id.editText16);

        txtT.setText("");
        txtR.setText("");
        txtF.setText("");

        txtF.setTextColor(Color.rgb(255, 255, 255));
        txtR.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));


        TextView txT = (TextView) findViewById(R.id.textView68);
        TextView txR = (TextView) findViewById(R.id.textView69);
        TextView txF = (TextView) findViewById(R.id.textView70);


    }

   public void btnEntertone (View v){

       EditText txtT = (EditText) findViewById(R.id.editText15);
       EditText txtR = (EditText) findViewById(R.id.editText17);
       EditText txtF = (EditText) findViewById(R.id.editText16);

       txtT.setTextColor(Color.rgb(255, 255, 255));
       txtR.setTextColor(Color.rgb(255, 255, 255));
       txtF.setTextColor(Color.rgb(255, 255, 255));

       TextView txT = (TextView) findViewById(R.id.textView68);
       TextView txR = (TextView) findViewById(R.id.textView69);
       TextView txF = (TextView) findViewById(R.id.textView70);



       if( txtT.getText().length() == 0 &&  txtR.getText().length() == 0 &&  txtF.getText().length() == 0) {
           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter two numbers to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();
       }

       else if(txtF.getText().length() == 0 && txtT.getText().length() == 0){
           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter two numbers to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();


       }

       else if(txtR.getText().length() == 0 && txtT.getText().length() == 0){
           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter two numbers to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();
       }


       else if(txtF.getText().length() == 0 && txtR.getText().length() == 0){

           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter two numbers to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();
       }

       else if (txtT.getText().length() == 0){

           float decR =  Float.parseFloat(txtR.getText().toString());
           float decF =  Float.parseFloat(txtF.getText().toString());

           float decT = decF * decR;
           String strT = String.valueOf(decT);
           txtT.setText(strT);
           txtT.setTextColor(Color.rgb(102, 204, 255));

       }


       else if (txtR.getText().length() == 0){
           float decT =  Float.parseFloat(txtT.getText().toString());
           float decF =  Float.parseFloat(txtF.getText().toString());

           float decR = decT/ decF;
           String strR = String.valueOf(decR);
           txtR.setText(strR);
           txtR.setTextColor(Color.rgb(102, 204, 255));

       }


       else if(txtF.getText().length() == 0){
           float decR =  Float.parseFloat(txtR.getText().toString());
           float decT =  Float.parseFloat(txtT.getText().toString());

           float decF = decT/ decR;
           String strF = String.valueOf(decF);
           txtF.setText(strF);
           txtF.setTextColor(Color.rgb(102, 204, 255));


       }

       else{
           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter two numbers to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();
       }

   }
}
