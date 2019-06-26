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
import android.widget.RadioGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Convertact extends ActionBarActivity {

    int intcheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertact);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_convertact, menu);
        return true;
    }

    public void btnClearCONVRT(View v) {

        intcheck = 0;

        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));
    }






    public void btnEnterConMCM(View v){

        if (intcheck == 1){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear before solving again");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else {

            intcheck = 1;

            EditText txtM = (EditText) findViewById(R.id.editText64);
            EditText txtCM = (EditText) findViewById(R.id.editText65);

            txtM.setTextColor(Color.rgb(255, 255, 255));
            txtCM.setTextColor(Color.rgb(255, 255, 255));


            if (txtM.getText().length() == 0 && txtCM.getText().length() == 0) {

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            } else if (txtM.getText().length() == 0) {

                float decCM = Float.parseFloat(txtCM.getText().toString());

                float decM = decCM / 100;
                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");
                txtM.setTextColor(Color.rgb(102, 204, 255));

                String strCM = String.valueOf(decCM);
                txtCM.setText(strCM + " cm");


            } else if (txtCM.getText().length() == 0) {

                float decM = Float.parseFloat(txtM.getText().toString());

                float decCM = decM * 100;
                String strCM = String.valueOf(decCM);
                txtCM.setText(strCM + " cm");
                txtCM.setTextColor(Color.rgb(102, 204, 255));

                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");

            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        }


    }

    public void btnEnterConMKM(View v) {

        if (intcheck == 1){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear before solving again");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else {

            intcheck = 1;

            EditText txtM = (EditText) findViewById(R.id.editText56);
            EditText txtKM = (EditText) findViewById(R.id.editText57);

            txtM.setTextColor(Color.rgb(255, 255, 255));
            txtKM.setTextColor(Color.rgb(255, 255, 255));


            if (txtM.getText().length() == 0 && txtKM.getText().length() == 0) {

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            } else if (txtM.getText().length() == 0) {

                float decKM = Float.parseFloat(txtKM.getText().toString());
                //KM = 1000M
                float decM = decKM * 1000;
                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");
                txtM.setTextColor(Color.rgb(102, 204, 255));

                String strKM = String.valueOf(decKM);
                txtKM.setText(strKM + " Km");


            } else if (txtKM.getText().length() == 0) {

                float decM = Float.parseFloat(txtM.getText().toString());

                float decKM = decM / 1000;
                String strKM = String.valueOf(decKM);
                txtKM.setText(strKM + " Km");
                txtKM.setTextColor(Color.rgb(102, 204, 255));

                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        }
    }


    public void btnEnterConMMM(View v) {

        if (intcheck == 1){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear before solving again");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else {

            intcheck = 1;

            EditText txtM = (EditText) findViewById(R.id.editText58);
            EditText txtMM = (EditText) findViewById(R.id.editText59);

            txtM.setTextColor(Color.rgb(255, 255, 255));
            txtMM.setTextColor(Color.rgb(255, 255, 255));


            if (txtM.getText().length() == 0 && txtMM.getText().length() == 0) {

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            } else if (txtM.getText().length() == 0) {

                float decMM = Float.parseFloat(txtMM.getText().toString());
                //KM = 1000M
                float decM = decMM / 1000;
                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");
                txtM.setTextColor(Color.rgb(102, 204, 255));

                String strKM = String.valueOf(decMM);
                txtMM.setText(strKM + " mm");


            } else if (txtMM.getText().length() == 0) {

                float decM = Float.parseFloat(txtM.getText().toString());

                float decMM = decM * 1000;
                String strKM = String.valueOf(decMM);
                txtMM.setText(strKM + " mm");
                txtMM.setTextColor(Color.rgb(102, 204, 255));

                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        }
    }

    public void btnEnterConKgG(View v){

        if (intcheck == 1){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear before solving again");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else {

            intcheck = 1;

            EditText txtG = (EditText) findViewById(R.id.editText62);
            EditText txtKg = (EditText) findViewById(R.id.editText63);

            txtG.setTextColor(Color.rgb(255, 255, 255));
            txtKg.setTextColor(Color.rgb(255, 255, 255));


            if (txtKg.getText().length() == 0 && txtG.getText().length() == 0) {

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            } else if (txtKg.getText().length() == 0) {

                float decG = Float.parseFloat(txtG.getText().toString());
                //KM = 1000M
                float decKg = decG / 1000;
                String strKg = String.valueOf(decKg);
                txtKg.setText(strKg + " Kg");
                txtKg.setTextColor(Color.rgb(102, 204, 255));

                String strG = String.valueOf(decG);
                txtG.setText(strG + " g");


            } else if (txtG.getText().length() == 0) {

                float decKg = Float.parseFloat(txtKg.getText().toString());

                float decG = decKg * 1000;
                String strG = String.valueOf(decG);
                txtG.setText(strG + " g");
                txtG.setTextColor(Color.rgb(102, 204, 255));

                String strKg = String.valueOf(decKg);
                txtKg.setText(strKg + " Kg");

            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        }


    }

    public void btnEnterConMeMi(View v) {

        if (intcheck == 1){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Press clear before solving again");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else {

            intcheck = 1;

            EditText txtM = (EditText) findViewById(R.id.editText60);
            EditText txtMi = (EditText) findViewById(R.id.editText61);

            txtM.setTextColor(Color.rgb(255, 255, 255));
            txtMi.setTextColor(Color.rgb(255, 255, 255));


            if (txtM.getText().length() == 0 && txtMi.getText().length() == 0) {

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            } else if (txtM.getText().length() == 0) {

                float decMi = Float.parseFloat(txtMi.getText().toString());
                //KM = 1000M
                float decM = decMi * 1609;
                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");
                txtM.setTextColor(Color.rgb(102, 204, 255));
                String strMi = String.valueOf(decMi);
                txtMi.setText(strMi + " Mile(s)");

            } else if (txtMi.getText().length() == 0) {

                float decM = Float.parseFloat(txtM.getText().toString());

                float decMi = decM / 1609;
                String strMi = String.valueOf(decMi);
                txtMi.setText(strMi + " Mile(s)");
                txtMi.setTextColor(Color.rgb(102, 204, 255));
                String strM = String.valueOf(decM);
                txtM.setText(strM + " m");


            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("");
                alertDialog.setMessage("Enter one number to solve");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        }
    }

    public void btnVisMSM(View v) {

        intcheck = 0;

        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));



        RadioGroup MCM;
        MCM = (RadioGroup) findViewById(R.id.MCM);
        MCM.setVisibility(View.VISIBLE);

        //everything else
        RadioGroup KMM;
        KMM = (RadioGroup) findViewById(R.id.KMM);
        KMM.setVisibility(View.INVISIBLE);

        RadioGroup MMM;
        MMM = (RadioGroup) findViewById(R.id.MMM);
        MMM.setVisibility(View.INVISIBLE);

        RadioGroup MeMi;
        MeMi = (RadioGroup) findViewById(R.id.MeMi);
        MeMi.setVisibility(View.INVISIBLE);

        RadioGroup KgG;
        KgG = (RadioGroup) findViewById(R.id.KgG);
        KgG.setVisibility(View.INVISIBLE);
    }

    public void btnVisKMM(View v) {

        intcheck = 0;
        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));


        RadioGroup KMM;
        KMM = (RadioGroup) findViewById(R.id.KMM);
        KMM.setVisibility(View.VISIBLE);

        //Everything else
        RadioGroup MCM;
        MCM = (RadioGroup) findViewById(R.id.MCM);
        MCM.setVisibility(View.INVISIBLE);

        RadioGroup MMM;
        MMM = (RadioGroup) findViewById(R.id.MMM);
        MMM.setVisibility(View.INVISIBLE);

        RadioGroup MeMi;
        MeMi = (RadioGroup) findViewById(R.id.MeMi);
        MeMi.setVisibility(View.INVISIBLE);

        RadioGroup KgG;
        KgG = (RadioGroup) findViewById(R.id.KgG);
        KgG.setVisibility(View.INVISIBLE);

    }

    public void btnVisMMM(View v) {

        intcheck = 0;
        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));


        RadioGroup MMM;
        MMM = (RadioGroup) findViewById(R.id.MMM);
        MMM.setVisibility(View.VISIBLE);

        //Everything Else
        RadioGroup MCM;
        MCM = (RadioGroup) findViewById(R.id.MCM);
        MCM.setVisibility(View.INVISIBLE);

        RadioGroup KMM;
        KMM = (RadioGroup) findViewById(R.id.KMM);
        KMM.setVisibility(View.INVISIBLE);

        RadioGroup MeMi;
        MeMi = (RadioGroup) findViewById(R.id.MeMi);
        MeMi.setVisibility(View.INVISIBLE);

        RadioGroup KgG;
        KgG = (RadioGroup) findViewById(R.id.KgG);
        KgG.setVisibility(View.INVISIBLE);
    }

    public void btnVisMeMi(View v) {

        intcheck = 0;
        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));


        RadioGroup MeMi;
        MeMi = (RadioGroup) findViewById(R.id.MeMi);
        MeMi.setVisibility(View.VISIBLE);

        //everything else
        RadioGroup MCM;
        MCM = (RadioGroup) findViewById(R.id.MCM);
        MCM.setVisibility(View.INVISIBLE);

        RadioGroup KMM;
        KMM = (RadioGroup) findViewById(R.id.KMM);
        KMM.setVisibility(View.INVISIBLE);

        RadioGroup MMM;
        MMM = (RadioGroup) findViewById(R.id.MMM);
        MMM.setVisibility(View.INVISIBLE);

        RadioGroup KgG;
        KgG = (RadioGroup) findViewById(R.id.KgG);
        KgG.setVisibility(View.INVISIBLE);
    }

    public void btnVisKgG(View v) {

        intcheck = 0;
        EditText txtM = (EditText) findViewById(R.id.editText64);
        EditText txtCM = (EditText) findViewById(R.id.editText65);
        EditText txtM1 = (EditText) findViewById(R.id.editText56);
        EditText txtKM = (EditText) findViewById(R.id.editText57);
        EditText txtM2 = (EditText) findViewById(R.id.editText58);
        EditText txtMM = (EditText) findViewById(R.id.editText59);
        EditText txtG = (EditText) findViewById(R.id.editText62);
        EditText txtKg = (EditText) findViewById(R.id.editText63);
        EditText txtM3 = (EditText) findViewById(R.id.editText60);
        EditText txtMi = (EditText) findViewById(R.id.editText61);

        txtCM.setText("");
        txtG.setText("");
        txtKg.setText("");
        txtKM.setText("");
        txtM.setText("");
        txtM1.setText("");
        txtM2.setText("");
        txtM3.setText("");
        txtMi.setText("");
        txtMM.setText("");

        txtCM.setTextColor(Color.rgb(255, 255, 255));
        txtG.setTextColor(Color.rgb(255, 255, 255));
        txtKg.setTextColor(Color.rgb(255, 255, 255));
        txtKM.setTextColor(Color.rgb(255, 255, 255));
        txtM.setTextColor(Color.rgb(255, 255, 255));
        txtM1.setTextColor(Color.rgb(255, 255, 255));
        txtM2.setTextColor(Color.rgb(255, 255, 255));
        txtM3.setTextColor(Color.rgb(255, 255, 255));
        txtMi.setTextColor(Color.rgb(255, 255, 255));
        txtMM.setTextColor(Color.rgb(255, 255, 255));



        RadioGroup KgG;
        KgG = (RadioGroup) findViewById(R.id.KgG);
        KgG.setVisibility(View.VISIBLE);

        //everything else
        RadioGroup MCM;
        MCM = (RadioGroup) findViewById(R.id.MCM);
        MCM.setVisibility(View.INVISIBLE);

        RadioGroup KMM;
        KMM = (RadioGroup) findViewById(R.id.KMM);
        KMM.setVisibility(View.INVISIBLE);

        RadioGroup MMM;
        MMM = (RadioGroup) findViewById(R.id.MMM);
        MMM.setVisibility(View.INVISIBLE);

        RadioGroup MeMi;
        MeMi = (RadioGroup) findViewById(R.id.MeMi);
        MeMi.setVisibility(View.INVISIBLE);

    }


    }


