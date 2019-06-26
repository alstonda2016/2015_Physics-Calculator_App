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


public class AeVT extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ae_vt);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ae_vt, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnClearAEVT (View v) {

        EditText txtV = (EditText) findViewById(R.id.editText4);
        EditText txtA = (EditText) findViewById(R.id.editText5);
        EditText txtT = (EditText) findViewById(R.id.editText6);

        txtA.setText("");
        txtT.setText("");
        txtV.setText("");

        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));

        TextView txV = (TextView) findViewById(R.id.textView81);
        TextView txA = (TextView) findViewById(R.id.textView82);
        TextView txT = (TextView) findViewById(R.id.textView83);


    }
    public void btnEnter (View v) {

        EditText txtV = (EditText) findViewById(R.id.editText4);
        EditText txtA = (EditText) findViewById(R.id.editText5);
        EditText txtT = (EditText) findViewById(R.id.editText6);

        txtV.setTextColor(Color.rgb(255, 255, 255));
        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txV = (TextView) findViewById(R.id.textView81);
        TextView txA = (TextView) findViewById(R.id.textView82);
        TextView txT = (TextView) findViewById(R.id.textView83);




        if (txtA.getText().length() == 0 && txtV.getText().length() == 0 && txtT.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
            //
        } else if (txtA.getText().length() == 0 && txtT.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtV.getText().length() == 0 && txtT.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtA.getText().length() == 0 && txtV.getText().length() == 0)

        {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter two numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtA.getText().length() == 0)

        {

            float decV = Float.parseFloat(txtV.getText().toString());
            float decT = Float.parseFloat(txtT.getText().toString());

            float decA = decV/ decT;
            String strX = String.valueOf(decA);
            txtA.setText(strX);
            txtA.setTextColor(Color.rgb(102, 204, 255));


        } else if (txtV.getText().length() == 0) {
            float decA = Float.parseFloat(txtA.getText().toString());
            float decT = Float.parseFloat(txtT.getText().toString());

            float decV = decA * decT;
            String strV = String.valueOf(decV);
            txtV.setText(strV);
            txtV.setTextColor(Color.rgb(102, 204, 255));
        }

        else if (txtT.getText().length() == 0) {
            float decV = Float.parseFloat(txtV.getText().toString());
            float decA = Float.parseFloat(txtA.getText().toString());

            float decT = decV / decA;
            String strT = String.valueOf(decT);
            txtT.setText(strT);
            txtA.setTextColor(Color.rgb(102, 204, 255));


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
