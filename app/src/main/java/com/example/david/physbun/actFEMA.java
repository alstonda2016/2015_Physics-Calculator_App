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


public class actFEMA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_fem);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_fem, menu);
        return true;
    }

    public void btnClearFEMA(View v) {

        EditText txtF = (EditText) findViewById(R.id.editText73);
        EditText txtM = (EditText) findViewById(R.id.editText74);
        EditText txtA = (EditText) findViewById(R.id.editText75);

        txtA.setText("");
        txtF.setText("");
        txtM.setText("");

        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255,255,255));
        txtF.setTextColor(Color.rgb(255,255,255));

        TextView TxVF = (TextView) findViewById(R.id.textView40);
        TextView TxVM = (TextView) findViewById(R.id.textView41);
        TextView TxVA = (TextView) findViewById(R.id.textView42);


    }

    public void btnEnterFEMA(View v) {

        EditText txtF = (EditText) findViewById(R.id.editText73);
        EditText txtM = (EditText) findViewById(R.id.editText74);
        EditText txtA = (EditText) findViewById(R.id.editText75);

        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255,255,255));
        txtF.setTextColor(Color.rgb(255,255,255));

        TextView TxVF = (TextView) findViewById(R.id.textView40);
        TextView TxVM = (TextView) findViewById(R.id.textView41);
        TextView TxVA = (TextView) findViewById(R.id.textView42);



        if (txtA.getText().length() == 0 && txtF.getText().length() == 0 && txtM.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        } else if (txtA.getText().length() == 0 && txtF.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtA.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtF.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtF.getText().length() == 0) {
            float decA = Float.parseFloat(txtA.getText().toString());
            float decM = Float.parseFloat(txtM.getText().toString());

            float decF = decA * decM;
            String strF = String.valueOf(decF);
            txtF.setText(strF);
            txtF.setTextColor(Color.rgb(102, 204, 255));


        } else if (txtM.getText().length() == 0) {
            float decA = Float.parseFloat(txtA.getText().toString());
            float decF = Float.parseFloat(txtF.getText().toString());

            float decM = decF / decA;
            String strM = String.valueOf(decM);
            txtM.setText(strM);
            txtM.setTextColor(Color.rgb(102, 204, 255));


        } else if (txtA.getText().length() == 0) {
            float decF = Float.parseFloat(txtF.getText().toString());
            float decM = Float.parseFloat(txtM.getText().toString());

            float decA = decF / decM;
            String strA = String.valueOf(decA);
            txtA.setText(strA);
            txtA.setTextColor(Color.rgb(102, 204, 255));


        } else {
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
