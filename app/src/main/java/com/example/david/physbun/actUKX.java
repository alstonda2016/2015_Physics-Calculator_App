package com.example.david.physbun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class actUKX extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_ukx);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_ukx, menu);
        return true;
    }

    //K = Us
    //m = k
    // v = x

    public void btnClearUKX(View v){
        EditText txtK = (EditText) findViewById(R.id.editText83);
        EditText txtM = (EditText) findViewById(R.id.editText84);
        EditText txtV = (EditText) findViewById(R.id.editText85);


        txtK.setText("");
        txtM.setText("");
        txtV.setText("");

        txtK.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255,255,255));
        txtV.setTextColor(Color.rgb(255,255,255));

        TextView txK = (TextView) findViewById(R.id.textView55);
        TextView txM = (TextView) findViewById(R.id.textView56);
        TextView txV = (TextView) findViewById(R.id.textView57);



    }

    public void btnEnterUKX(View v) {
        EditText txtK = (EditText) findViewById(R.id.editText83);
        EditText txtM = (EditText) findViewById(R.id.editText84);
        EditText txtV = (EditText) findViewById(R.id.editText85);

        txtK.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));

        TextView txK = (TextView) findViewById(R.id.textView55);
        TextView txM = (TextView) findViewById(R.id.textView56);
        TextView txV = (TextView) findViewById(R.id.textView57);


        if (txtK.getText().length() == 0 && txtM.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        } else if (txtK.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        } else if (txtK.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        } else if (txtV.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        } else if (txtV.getText().length() == 0) {
            float decM = Float.parseFloat(txtM.getText().toString());
            float decK = Float.parseFloat(txtK.getText().toString());

            float decV = FloatMath.sqrt((2 * decK) / decM);
            String strV = String.valueOf(decV);
            txtV.setText(strV);
            txtV.setTextColor(Color.rgb(102, 204, 255));

        } else if (txtK.getText().length() == 0) {
            float decM = Float.parseFloat(txtM.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());

            float decK = (decM * (decV * decV) / 2);
            String strK = String.valueOf(decK);
            txtK.setText(strK);
            txtK.setTextColor(Color.rgb(102, 204, 255));

        } else if (txtM.getText().length() == 0) {
            float decV = Float.parseFloat(txtV.getText().toString());
            float decK = Float.parseFloat(txtK.getText().toString());

            float decM = (decK * 2) / (decV * decV);
            String strM = String.valueOf(decM);
            txtM.setText(strM);
            txtM.setTextColor(Color.rgb(102, 204, 255));

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
