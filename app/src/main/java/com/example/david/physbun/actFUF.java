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


public class actFUF extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_fuf);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_fu, menu);
        return true;
    }

    public void btnClearFUF(View v) {

        EditText txtFF = (EditText) findViewById(R.id.editText76);
        EditText txtU = (EditText) findViewById(R.id.editText77);
        EditText txtFN = (EditText) findViewById(R.id.editText78);

        txtFF.setText("");
        txtFN.setText("");
        txtU.setText("");

        txtFF.setTextColor(Color.rgb(255, 255, 255));
        txtFN.setTextColor(Color.rgb(255, 255, 255));
        txtU.setTextColor(Color.rgb(255, 255, 255));

        TextView TxFF = (TextView) findViewById(R.id.textView49);
        TextView txU = (TextView) findViewById(R.id.textView50);
        TextView txFN = (TextView) findViewById(R.id.textView51);


    }

    public void btnEnterFUF(View v) {

        EditText txtFF = (EditText) findViewById(R.id.editText76);
        EditText txtU = (EditText) findViewById(R.id.editText77);
        EditText txtFN = (EditText) findViewById(R.id.editText78);

        txtFF.setTextColor(Color.rgb(255, 255, 255));
        txtFN.setTextColor(Color.rgb(255, 255, 255));
        txtU.setTextColor(Color.rgb(255, 255, 255));

        TextView TxFF = (TextView) findViewById(R.id.textView49);
        TextView txU = (TextView) findViewById(R.id.textView50);
        TextView txFN = (TextView) findViewById(R.id.textView51);




        if (txtFF.getText().length() == 0 && txtFN.getText().length() == 0 && txtU.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialog.show();
        } else if (txtFF.getText().length() == 0 && txtFN.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialog.show();
        } else if (txtFF.getText().length() == 0 && txtU.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialog.show();
        } else if (txtU.getText().length() == 0 && txtFN.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialog.show();
        } else if (txtFF.getText().length() == 0) {

            float decFN = Float.parseFloat(txtFN.getText().toString());
            float decU = Float.parseFloat(txtU.getText().toString());

            float decFF = decFN * decU;
            String strFF = String.valueOf(decFF);
            txtFF.setText(strFF);
            txtFF.setTextColor(Color.rgb(102, 204, 255));


        } else if (txtU.getText().length() == 0) {
            float decFN = Float.parseFloat(txtFN.getText().toString());
            float decFF = Float.parseFloat(txtFF.getText().toString());

            float decU = decFF / decFN;
            String strU = String.valueOf(decU);
            txtU.setText(strU);
            txtU.setTextColor(Color.rgb(102, 204, 255));

        } else if (txtFN.getText().length() == 0) {
            float decU = Float.parseFloat(txtU.getText().toString());
            float decFF = Float.parseFloat(txtFF.getText().toString());

            float decFN = decFF / decU;
            String strFN = String.valueOf(decFN);
            txtFN.setText(strFN);
            txtFN.setTextColor(Color.rgb(102, 204, 255));

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