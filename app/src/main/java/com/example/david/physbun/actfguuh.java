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

import static java.lang.Math.sqrt;



public class actfguuh extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actfguuh);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actfguuh, menu);
        return true;
    }

    public void btnClearFGUUH(View v){
        EditText txtM1 = (EditText) findViewById(R.id.editText24);
        EditText txtM2 = (EditText) findViewById(R.id.editText25);
        EditText txtD = (EditText) findViewById(R.id.editText26);
        EditText txtFg = (EditText) findViewById(R.id.editText27);

        txtD.setText("");
        txtFg.setText("");
        txtM1.setText("");
        txtM2.setText("");

        txtD.setTextColor(Color.rgb(255, 255, 255));
        txtFg.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));

        TextView TxM1 = (TextView) findViewById(R.id.textView45);
        TextView txM2 = (TextView) findViewById(R.id.textView46);
        TextView txD = (TextView) findViewById(R.id.textView47);
        TextView txFG = (TextView) findViewById(R.id.textView48);


    }

    public void btnEnterUnivg(View v){

        EditText txtM1 = (EditText) findViewById(R.id.editText24);
        EditText txtM2 = (EditText) findViewById(R.id.editText25);
        EditText txtD = (EditText) findViewById(R.id.editText26);
        EditText txtFg = (EditText) findViewById(R.id.editText27);

        txtD.setTextColor(Color.rgb(255, 255, 255));
        txtFg.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));

        TextView TxM1 = (TextView) findViewById(R.id.textView45);
        TextView txM2 = (TextView) findViewById(R.id.textView46);
        TextView txD = (TextView) findViewById(R.id.textView47);
        TextView txFG = (TextView) findViewById(R.id.textView48);



        //do all the if stuff

        if(txtM1.getText().length() == 0 && txtM2.getText().length() == 0 && txtD.getText().length() == 0 && txtFg.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //



        }

        else if(txtM1.getText().length() == 0 && txtM2.getText().length() == 0 && txtFg.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //


        }

        else if(txtM1.getText().length() == 0 && txtFg.getText().length() == 0 && txtD.getText().length() == 0){

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //
        }

        else if(txtM1.getText().length() == 0 && txtM2.getText().length() == 0 && txtD.getText().length() == 0){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //


        }

        else if( txtM2.getText().length() == 0 && txtD.getText().length() == 0 && txtFg.getText().length() == 0  ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }

        else if(txtD.getText().length() == 0 && txtM1.getText().length() == 0 ){

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }

        else if(txtM2.getText().length() == 0 && txtM1.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }

        else if(txtFg.getText().length() == 0 && txtM1.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }

        else if(txtM2.getText().length() == 0 && txtD.getText().length() == 0){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }

        else if(txtM2.getText().length() == 0  && txtFg.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }


        else if(txtFg.getText().length() == 0  && txtD.getText().length() == 0 ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }


        else if( txtFg.getText().length() == 0 ){
            float decD = Float.parseFloat(txtD.getText().toString());
            float decM1 = Float.parseFloat(txtM1.getText().toString());
            float decM2 = Float.parseFloat(txtM2.getText().toString());


            double decFg = ( ((6.67259)* 1E-11) * decM1 * decM2)/ (decD * decD);
            String strFg = String.valueOf(decFg);
            txtFg.setText(strFg);
            txtFg.setTextColor(Color.rgb(102, 204, 255));


            }

        else if( txtD.getText().length() == 0 ){
            float decFg= Float.parseFloat(txtFg.getText().toString());
            float decM1 = Float.parseFloat(txtM1.getText().toString());
            float decM2 = Float.parseFloat(txtM2.getText().toString());

            double decD = sqrt( (((6.67259)* 1E-11 )* decM1 * decM2)/decFg );
            String strD = String.valueOf(decD);
            txtD.setText(strD);
            txtD.setTextColor(Color.rgb(102, 204, 255));

        }

        else if(txtM1.getText().length() == 0){
            float decFg= Float.parseFloat(txtFg.getText().toString());
            float decD = Float.parseFloat(txtD.getText().toString());
            float decM2 = Float.parseFloat(txtM2.getText().toString());

            double decM1 = (( decD * decD)* decFg)/(((6.67259)* 1E-11 ) * decM2 );
            String strM1 = String.valueOf(decM1);
            txtM1.setText(strM1);
            txtM1.setTextColor(Color.rgb(102, 204, 255));

        }



        else if (txtM2.getText().length() == 0){
            float decFg= Float.parseFloat(txtFg.getText().toString());
            float decD = Float.parseFloat(txtD.getText().toString());
            float decM1 = Float.parseFloat(txtM1.getText().toString());

            double decM2 = (( decD * decD)* decFg)/(((6.67259)* 1E-11 ) * decM1 );
            String strM2 = String.valueOf(decM2);
            txtM2.setText(strM2);
            txtM2.setTextColor(Color.rgb(102, 204, 255));
            txM2.setVisibility(View.VISIBLE);
        }

        else{

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }





        }

    }


