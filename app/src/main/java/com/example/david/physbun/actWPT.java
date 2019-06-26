package com.example.david.physbun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class actWPT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_wpt);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_wpt, menu);
        return true;
    }

    public void btnClearWPT (View v) {

        EditText txtW = (EditText) findViewById(R.id.editText31);
        EditText txtF = (EditText) findViewById(R.id.editText32);
        EditText txtD = (EditText) findViewById(R.id.editText33);

        txtD.setText("");
        txtF.setText("");
        txtW.setText("");

        txtD.setTextColor(Color.rgb(255, 255, 255));
        txtF.setTextColor(Color.rgb(255, 255, 255));
        txtW.setTextColor(Color.rgb(255, 255, 255));

        TextView txW = (TextView) findViewById(R.id.textView75);
        TextView txF = (TextView) findViewById(R.id.textView76);
        TextView txD = (TextView) findViewById(R.id.textView77);


    }

    public void btnEnterWPT (View v) {

        EditText txtW = (EditText) findViewById(R.id.editText31);
        EditText txtF = (EditText) findViewById(R.id.editText32);
        EditText txtD = (EditText) findViewById(R.id.editText33);

        txtW.setTextColor(Color.rgb(255, 255, 255));
        txtF.setTextColor(Color.rgb(255, 255, 255));
        txtD.setTextColor(Color.rgb(255, 255, 255));

        TextView txW = (TextView) findViewById(R.id.textView75);
        TextView txF = (TextView) findViewById(R.id.textView76);
        TextView txD = (TextView) findViewById(R.id.textView77);




        if (txtW.getText().length() == 0 && txtF.getText().length() == 0 && txtF.getText().length() == 0 ){

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


        else if (txtW.getText().length() == 0 && txtD.getText().length() == 0 ){
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

        else if(txtF.getText().length() == 0 && txtW.getText().length() == 0){

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

       else if(txtD.getText().length() == 0 && txtF.getText().length() == 0){
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

        else if(txtD.getText().length() == 0){
            float decW =  Float.parseFloat(txtW.getText().toString());
            float decF =  Float.parseFloat(txtF.getText().toString());

            float decD = decW/ decF;

            String strD = String.valueOf(decD);
            txtD.setText(strD);
            txtD.setTextColor(Color.rgb(102, 204, 255));

        }

        else if(txtF.getText().length() == 0){
            float decW =  Float.parseFloat(txtW.getText().toString());
            float decD =  Float.parseFloat(txtD.getText().toString());

            float decF = decW/ decD;

            String strF = String.valueOf(decF);
            txtF.setText(strF);
            txtF.setTextColor(Color.rgb(102, 204, 255));

        }

       else if(txtW.getText().length() == 0){
            float decD =  Float.parseFloat(txtD.getText().toString());
            float decF =  Float.parseFloat(txtF.getText().toString());

            float decW = decD * decF;

            String strW = String.valueOf(decW);
            txtW.setText(strW);
            txtW.setTextColor(Color.rgb(102, 204, 255));


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

        alertDialog.show();}
    }
}
