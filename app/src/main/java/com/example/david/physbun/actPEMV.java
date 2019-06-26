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


public class actPEMV extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pemv);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_pemv, menu);
        return true;
    }

    public void btnClearPEMV(View v) {

        EditText txtP = (EditText) findViewById(R.id.editText70);
        EditText txtM = (EditText) findViewById(R.id.editText71);
        EditText txtV = (EditText) findViewById(R.id.editText72);

        txtM.setText("");
        txtP.setText("");
        txtV.setText("");

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));

        TextView txP = (TextView) findViewById(R.id.textView58);
        TextView txM = (TextView) findViewById(R.id.textView59);
        TextView txV = (TextView) findViewById(R.id.textView60);


    }

    public void btnEnterPEMV(View v) {

        EditText txtP = (EditText) findViewById(R.id.editText70);
        EditText txtM = (EditText) findViewById(R.id.editText71);
        EditText txtV = (EditText) findViewById(R.id.editText72);

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));

        TextView txP = (TextView) findViewById(R.id.textView58);
        TextView txM = (TextView) findViewById(R.id.textView59);
        TextView txV = (TextView) findViewById(R.id.textView60);



        if (txtP.getText().length() == 0 && txtV.getText().length() == 0 && txtM.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        } else if (txtP.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        } else if (txtP.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtM.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtP.getText().length() == 0) {
            float decV = Float.parseFloat(txtV.getText().toString());
            float decM = Float.parseFloat(txtM.getText().toString());

            float decP = decM * decV;
            String strP = String.valueOf(decP);
            txtP.setText(strP);
            txtP.setTextColor(Color.rgb(102, 204, 255));

        } else if (txtM.getText().length() == 0) {
            float decV = Float.parseFloat(txtV.getText().toString());
            float decP = Float.parseFloat(txtP.getText().toString());

            float decM = decP / decV;
            String strM = String.valueOf(decM);
            txtM.setText(strM);
            txtM.setTextColor(Color.rgb(102, 204, 255));

        } else if (txtV.getText().length() == 0) {
            float decP = Float.parseFloat(txtP.getText().toString());
            float decM = Float.parseFloat(txtM.getText().toString());

            float decV = decP / decM;
            String strV = String.valueOf(decV);
            txtV.setText(strV);
            txtV.setTextColor(Color.rgb(102, 204, 255));

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
