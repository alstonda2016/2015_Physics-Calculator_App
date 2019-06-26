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


public class actPWT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pwt);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_pwt, menu);
        return true;
    }

    public void btnClearpwt (View v) {

        EditText txtP = (EditText) findViewById(R.id.editText28);
        EditText txtW = (EditText) findViewById(R.id.editText29);
        EditText txtT = (EditText) findViewById(R.id.editText30);

        txtP.setText("");
        txtW.setText("");
        txtT.setText("");

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtW.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txP = (TextView) findViewById(R.id.textView61);
        TextView txW = (TextView) findViewById(R.id.textView62);
        TextView txT = (TextView) findViewById(R.id.textView63);


    }

    public void btnEnterpwt (View v) {

        EditText txtP = (EditText) findViewById(R.id.editText28);
        EditText txtW = (EditText) findViewById(R.id.editText29);
        EditText txtT = (EditText) findViewById(R.id.editText30);

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtW.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txP = (TextView) findViewById(R.id.textView61);
        TextView txW = (TextView) findViewById(R.id.textView62);
        TextView txT = (TextView) findViewById(R.id.textView63);




        if(txtT.getText().length() == 0 &&  txtW.getText().length() == 0 && txtP.getText().length() == 0 ){
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

        else if(txtT.getText().length() == 0 && txtP.getText().length() == 0){
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

        else if(txtT.getText().length() == 0 && txtW.getText().length() == 0){
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

        else if(txtW.getText().length() == 0 && txtP.getText().length() == 0){
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


       else  if (txtW.getText().length() == 0){
            float decP =  Float.parseFloat(txtP.getText().toString());
            float decT =  Float.parseFloat(txtT.getText().toString());

            float decW = decP * decT;
            String strW = String.valueOf(decW);
            txtW.setText(strW);

            txtW.setTextColor(Color.rgb(102, 204, 255));



        }

       else if (txtP.getText().length() == 0){
            float decW =  Float.parseFloat(txtW.getText().toString());
            float decT =  Float.parseFloat(txtT.getText().toString());

            float decP = decW / decT;
            String strP = String.valueOf(decP);
            txtP.setText(strP);
            txtP.setTextColor(Color.rgb(102, 204, 255));

        }

        else if (txtT.getText().length() == 0){
            float decP =  Float.parseFloat(txtP.getText().toString());
            float decW =  Float.parseFloat(txtW.getText().toString());

            float decT = decW / decP;
            String strT = String.valueOf(decT);
            txtT.setText(strT);
            txtT.setTextColor(Color.rgb(102, 204, 255));


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
