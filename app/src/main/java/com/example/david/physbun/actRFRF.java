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


public class actRFRF extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_rfrf);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_rfr, menu);
        return true;
    }

    public void btnClearRFRF (View view) {
        EditText txtR1 = (EditText) findViewById(R.id.editText18);
        EditText txtF1 = (EditText) findViewById(R.id.editText19);
        EditText txtR2 = (EditText) findViewById(R.id.editText20);
        EditText txtF2 = (EditText) findViewById(R.id.editText21);

        txtR1.setText("");
        txtR2.setText("");
        txtF1.setText("");
        txtF2.setText("");

        txtR1.setTextColor(Color.rgb(255, 255, 255));
        txtF1.setTextColor(Color.rgb(255, 255, 255));
        txtR2.setTextColor(Color.rgb(255, 255, 255));
        txtF2.setTextColor(Color.rgb(255, 255, 255));

        TextView txR1 = (TextView) findViewById(R.id.textView64);
        TextView txF1 = (TextView) findViewById(R.id.textView65);
        TextView txR2 = (TextView) findViewById(R.id.textView66);
        TextView txF2 = (TextView) findViewById(R.id.textView67);


    }


    public void btnEnterrfrf (View view){
        EditText txtR1 = (EditText) findViewById(R.id.editText18);
        EditText txtF1 = (EditText) findViewById(R.id.editText19);
        EditText txtR2 = (EditText) findViewById(R.id.editText20);
        EditText txtF2 = (EditText) findViewById(R.id.editText21);

        txtR1.setTextColor(Color.rgb(255, 255, 255));
        txtF1.setTextColor(Color.rgb(255, 255, 255));
        txtR2.setTextColor(Color.rgb(255, 255, 255));
        txtF2.setTextColor(Color.rgb(255, 255, 255));

        TextView txR1 = (TextView) findViewById(R.id.textView64);
        TextView txF1 = (TextView) findViewById(R.id.textView65);
        TextView txR2 = (TextView) findViewById(R.id.textView66);
        TextView txF2 = (TextView) findViewById(R.id.textView67);



        if(txtR1.getText().length() == 0 && txtF1.getText().length() == 0 && txtR2.getText().length() == 0 && txtF2.getText().length() == 0  ) {

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

       else if(txtR1.getText().length() == 0 && txtF1.getText().length() == 0 && txtR2.getText().length() == 0 ){
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
        else if(txtR1.getText().length() == 0 && txtF1.getText().length() == 0 && txtF2.getText().length() == 0){
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

        else if(txtR1.getText().length() == 0 && txtR2.getText().length() == 0 && txtF2.getText().length() == 0){

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

        else if(txtF1.getText().length() == 0 && txtF2.getText().length() == 0 && txtR2.getText().length() == 0){
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

        else if(txtF1.getText().length() == 0 && txtF2.getText().length() == 0){
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

        else if(txtR1.getText().length() == 0 && txtR2.getText().length() == 0){
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


         else if(txtR1.getText().length() == 0 && txtF2.getText().length() == 0 ){
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



        else if(txtR1.getText().length() == 0 && txtF1.getText().length() == 0){
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

        else if(txtR2.getText().length() == 0 && txtF2.getText().length() == 0){
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


        else if(txtF1.getText().length() == 0 && txtR2.getText().length() == 0){
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

        else if(txtF2.getText().length() == 0 && txtR2.getText().length() == 0){
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

        else if ( txtR2.getText().length() == 0 ){

            float decR1 = Float.parseFloat(txtR1.getText().toString());
            float decF1 = Float.parseFloat(txtF1.getText().toString());
            float decF2 = Float.parseFloat(txtF2.getText().toString());

            float decR2 = (decR1 * decF1)/ decF2;
            String strR2 = String.valueOf(decR2);
            txtR2.setText(strR2);
            txtR2.setTextColor(Color.rgb(102, 204, 255));


        }

        else if ( txtR1.getText().length() == 0 ){

            float decR2 = Float.parseFloat(txtR2.getText().toString());
            float decF1 = Float.parseFloat(txtF1.getText().toString());
            float decF2 = Float.parseFloat(txtF2.getText().toString());

            float decR1 = (decR2 * decF2)/ decF1;
            String strR1 = String.valueOf(decR1);
            txtR1.setText(strR1);
            txtR1.setTextColor(Color.rgb(102, 204, 255));




        }


        else if ( txtF2.getText().length() == 0 ){

            float decR1 = Float.parseFloat(txtR1.getText().toString());
            float decF1 = Float.parseFloat(txtF1.getText().toString());
            float decR2 = Float.parseFloat(txtR2.getText().toString());

            float decF2 = (decR1 * decF1)/ decR2;
            String strF2 = String.valueOf(decF2);
            txtF2.setText(strF2);
            txtF2.setTextColor(Color.rgb(102, 204, 255));



        }

        else if ( txtF1.getText().length() == 0 ){

            float decR1 = Float.parseFloat(txtR1.getText().toString());
            float decR2 = Float.parseFloat(txtR2.getText().toString());
            float decF2 = Float.parseFloat(txtF2.getText().toString());

            float decF1 = (decF2 * decR2)/ decR1;
            String strF1 = String.valueOf(decF1);
            txtF1.setText(strF1);
            txtF1.setTextColor(Color.rgb(102, 204, 255));




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

        alertDialog.show();}





    }
}
