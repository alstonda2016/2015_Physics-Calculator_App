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


public class actJeFT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_je_ft);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_je_ft, menu);
        return true;
    }

    public void btnClearJEFT(View v) {

        EditText txtJ = (EditText) findViewById(R.id.editText67);
        EditText txtF = (EditText) findViewById(R.id.editText68);
        EditText txtT = (EditText) findViewById(R.id.editText69);

        txtF.setText("");
        txtJ.setText("");
        txtT.setText("");

        txtF.setTextColor(Color.rgb(255, 255, 255));
        txtJ.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txJ = (TextView) findViewById(R.id.textView52);
        TextView txF = (TextView) findViewById(R.id.textView53);
        TextView txT = (TextView) findViewById(R.id.textView54);


    }

    public void btnEnterJEFT(View v) {

        EditText txtJ = (EditText) findViewById(R.id.editText67);
        EditText txtF = (EditText) findViewById(R.id.editText68);
        EditText txtT = (EditText) findViewById(R.id.editText69);

        txtF.setTextColor(Color.rgb(255, 255, 255));
        txtJ.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txJ = (TextView) findViewById(R.id.textView52);
        TextView txF = (TextView) findViewById(R.id.textView53);
        TextView txT = (TextView) findViewById(R.id.textView54);



        if (txtJ.getText().length() == 0 && txtF.getText().length() == 0 && txtT.getText().length() == 0) {
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


        else if (txtJ.getText().length() == 0 && txtF.getText().length() == 0) {
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

        else if (txtJ.getText().length() == 0 && txtT.getText().length() == 0) {
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

        else if (txtF.getText().length() == 0 && txtT.getText().length() == 0) {
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

        else if (txtJ.getText().length() == 0){
            float decT = Float.parseFloat(txtT.getText().toString());
            float decF = Float.parseFloat(txtF.getText().toString());

            float decJ = decF * decT;
            String strJ = String.valueOf(decJ);
            txtJ.setText(strJ);
            txtJ.setTextColor(Color.rgb(102, 204, 255));

        }

        else if (txtT.getText().length() == 0){
            float decJ = Float.parseFloat(txtJ.getText().toString());
            float decF = Float.parseFloat(txtF.getText().toString());

            float decT = decJ/ decF;
            String strT = String.valueOf(decT);
            txtT.setText(strT);
            txtT.setTextColor(Color.rgb(102, 204, 255));

        }

        else if (txtF.getText().length() == 0){
            float decT = Float.parseFloat(txtT.getText().toString());
            float decJ = Float.parseFloat(txtJ.getText().toString());

            float decF = decJ/ decT;
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
