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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class actPMVV extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pmvv);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_pmvv, menu);
        return true;
    }


    public void btnClearpmvv (View V ){

        EditText txtM = (EditText) findViewById(R.id.editText80);
        EditText txtP = (EditText) findViewById(R.id.editText79);
        EditText txtV = (EditText) findViewById(R.id.editText81);
        EditText txtVO = (EditText) findViewById(R.id.editText82);

        txtM.setText("");
        txtP.setText("");
        txtV.setText("");
        txtVO.setText("");

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtVO.setTextColor(Color.rgb(255, 255, 255));




    }

    public void btnEnterpmvv (View v) {

        EditText txtM = (EditText) findViewById(R.id.editText80);
        EditText txtP = (EditText) findViewById(R.id.editText79);
        EditText txtV = (EditText) findViewById(R.id.editText81);
        EditText txtVO = (EditText) findViewById(R.id.editText82);

        txtP.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtVO.setTextColor(Color.rgb(255, 255, 255));

        if (txtM.getText().length() == 0 && txtP.getText().length() == 0 && txtV.getText().length() == 0 && txtVO.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if (txtP.getText().length() == 0 && txtM.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }
        else if (txtP.getText().length() == 0 && txtM.getText().length() == 0 && txtVO.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }
        else if (txtVO.getText().length() == 0 && txtV.getText().length() == 0 && txtP.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }
        else if (txtV.getText().length() == 0 && txtVO.getText().length() == 0 && txtM.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtP.getText().length() == 0 && txtM.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtP.getText().length() == 0 && txtV.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtP.getText().length() == 0 && txtVO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtM.getText().length() == 0 && txtV.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtM.getText().length() == 0 && txtVO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtV.getText().length() == 0 && txtVO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if (txtP.getText().length() == 0 ){
            float decM = Float.parseFloat(txtM.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());
            float decV0 = Float.parseFloat(txtVO.getText().toString());

            float decP = decM * (decV - decV0);
            String strP = String.valueOf(decP);
            txtP.setText(strP);
            txtP.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtM.getText().length() == 0 ){
            float decP = Float.parseFloat(txtP.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());
            float decV0 = Float.parseFloat(txtVO.getText().toString());

            float decM = decP/ (decV - decV0) ;
            String strM = String.valueOf(decM);
            txtM.setText(strM);
            txtM.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtVO.getText().length() == 0 ){
            float decM = Float.parseFloat(txtM.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());
            float decP = Float.parseFloat(txtP.getText().toString());

            float decVO = - ((decP - (decM * decV))/decM) ;
            String strT = String.valueOf(decVO);
            txtVO.setText(strT);
            txtVO.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtV.getText().length() == 0 ){
            float decM = Float.parseFloat(txtM.getText().toString());
            float decP = Float.parseFloat(txtP.getText().toString());
            float decV0 = Float.parseFloat(txtVO.getText().toString());

            float decV =  (decP + (decM * decV0))/decM  ;
            String strT = String.valueOf(decV);
            txtV.setText(strT);
            txtV.setTextColor(Color.rgb(102,204,255));

        }

        else{
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();

        }


    }
}
