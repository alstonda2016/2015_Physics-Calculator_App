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


public class ActVevat extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_vevat);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_vevat, menu);
        return true;
    }


    public void btnClearVEVAT(View v) {

        EditText txtV = (EditText) findViewById(R.id.editText7);
        EditText txtV0 = (EditText) findViewById(R.id.editText8);
        EditText txtA = (EditText) findViewById(R.id.editText9);
        EditText txtT = (EditText) findViewById(R.id.editText10);


        txtA.setText("");
        txtT.setText("");
        txtV.setText("");
        txtV0.setText("");

        txtV.setTextColor(Color.rgb(255, 255, 255));
        txtV0.setTextColor(Color.rgb(255, 255, 255));
        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txV = (TextView) findViewById(R.id.textView71);
        TextView txV0 = (TextView) findViewById(R.id.textView72);
        TextView txA = (TextView) findViewById(R.id.textView73);
        TextView txT = (TextView) findViewById(R.id.textView74);



    }
    public void btnEnterb(View v) {

        EditText txtV = (EditText) findViewById(R.id.editText7);
        EditText txtV0 = (EditText) findViewById(R.id.editText8);
        EditText txtA = (EditText) findViewById(R.id.editText9);
        EditText txtT = (EditText) findViewById(R.id.editText10);

        txtV.setTextColor(Color.rgb(255, 255, 255));
        txtV0.setTextColor(Color.rgb(255, 255, 255));
        txtA.setTextColor(Color.rgb(255, 255, 255));
        txtT.setTextColor(Color.rgb(255, 255, 255));

        TextView txV = (TextView) findViewById(R.id.textView71);
        TextView txV0 = (TextView) findViewById(R.id.textView72);
        TextView txA = (TextView) findViewById(R.id.textView73);
        TextView txT = (TextView) findViewById(R.id.textView74);



        if (txtV0.getText().length() == 0 && txtV.getText().length() == 0 && txtT.getText().length() == 0 && txtA.getText().length() == 0) {

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
        } else if (txtV0.getText().length() == 0 && txtV.getText().length() == 0 && txtT.getText().length() == 0) {
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
        else if (txtV.getText().length() == 0 && txtT.getText().length() == 0 && txtA.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        } else if (txtV0.getText().length() == 0 && txtT.getText().length() == 0 && txtA.getText().length() == 0) {
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

        else if (txtV0.getText().length() == 0 && txtV.getText().length() == 0 && txtA.getText().length() == 0){
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

        else if ( txtV0.getText().length() == 0 && txtV.getText().length() == 0   ){
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

        else if ( txtV0.getText().length() == 0 && txtA.getText().length() == 0   ){
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

        else if ( txtV0.getText().length() == 0 && txtT.getText().length() == 0   ){
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

        else if ( txtV.getText().length() == 0 && txtT.getText().length() == 0   ){
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

        else if ( txtV.getText().length() == 0 && txtA.getText().length() == 0   ){
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

        else if ( txtT.getText().length() == 0 && txtA.getText().length() == 0   ){
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

        else if (txtT.getText().length() == 0 ){
            float decV = Float.parseFloat(txtV.getText().toString());
            float decA = Float.parseFloat(txtA.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decT = (decV - decV0)/decA;
            String strT = String.valueOf(decT);
            txtT.setText(strT);
            txtT.setTextColor(Color.rgb(102, 204, 255));

        }

        else if (txtV.getText().length() == 0 ){
            float decT = Float.parseFloat(txtT.getText().toString());
            float decA = Float.parseFloat(txtA.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decV = decV0 + (decA * decT);
            String strV = String.valueOf(decV);
            txtV.setText(strV);
            txtV.setTextColor(Color.rgb(102, 204, 255));


        }

        else if (txtA.getText().length() == 0 ){
            float decV = Float.parseFloat(txtV.getText().toString());
            float decT = Float.parseFloat(txtT.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decA = (decV - decV0)/ decT;
            String strA = String.valueOf(decA);
            txtA.setText(strA);
            txtA.setTextColor(Color.rgb(102, 204, 255));

        }

        else if (txtV0.getText().length() == 0 ){
            float decV = Float.parseFloat(txtV.getText().toString());
            float decA = Float.parseFloat(txtA.getText().toString());
            float decT = Float.parseFloat(txtT.getText().toString());

            float decV0 = decV - (decA * decT);
            String strV0 = String.valueOf(decV0);
            txtV0.setText(strV0);
            txtV0.setTextColor(Color.rgb(102, 204, 255));


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
