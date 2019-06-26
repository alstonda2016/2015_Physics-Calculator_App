package com.example.david.physbun;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;




public class ActXeVT extends ActionBarActivity {
    int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_xe_vt);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_xe_vt, menu);
        return true;

    }

    public void btnClearLM1(View v) {

        EditText txtX = (EditText) findViewById(R.id.editText);
        EditText txtV = (EditText) findViewById(R.id.editText2);
        EditText txtT = (EditText) findViewById(R.id.editText3);


        txtT.setText("");
        txtX.setText("");
        txtV.setText("");

        txtT.setTextColor(Color.rgb(255, 255, 255));
        txtX.setTextColor(Color.rgb(255, 255, 255));
        txtV.setTextColor(Color.rgb(255, 255, 255));

        TextView txX = (TextView) findViewById(R.id.textView78);
        TextView txV = (TextView) findViewById(R.id.textView79);
        TextView txT = (TextView) findViewById(R.id.textView80);


    }


        public void btnEnterLm1(View v){

            EditText txtX = (EditText) findViewById(R.id.editText);
            EditText txtV = (EditText) findViewById(R.id.editText2);
            EditText txtT = (EditText) findViewById(R.id.editText3);
            EditText txtTest = (EditText) findViewById(R.id.editText4);

            txtT.setTextColor(Color.rgb(255, 255, 255));
            txtX.setTextColor(Color.rgb(255, 255, 255));
            txtV.setTextColor(Color.rgb(255, 255, 255));


            TextView txX = (TextView) findViewById(R.id.textView78);
            TextView txV = (TextView) findViewById(R.id.textView79);
            TextView txT = (TextView) findViewById(R.id.textView80);







            //fix what happens when there is nothing entered


            if (txtX.getText().length() == 0 && txtV.getText().length() == 0 && txtT.getText().length() == 0 ) {

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
            }

            else if (txtX.getText().length() == 0 && txtT.getText().length() == 0) {
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
            else  if (txtV.getText().length() == 0 && txtT.getText().length() == 0) {
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
            else if (txtX.getText().length() == 0 && txtV.getText().length() == 0)

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

            }



            else if (txtX.getText().length() == 0)

                    {

                        float decV = Float.parseFloat(txtV.getText().toString());
                        float decT = Float.parseFloat(txtT.getText().toString());

                        float decX = decT * decV;
                        String strX = String.valueOf(decX);
                        txtX.setText(strX);
                        txtX.setTextColor(Color.rgb(102, 204, 255));


                    }






                   else if (txtV.getText().length() == 0){
                        float decX = Float.parseFloat(txtX.getText().toString());
                        float decT = Float.parseFloat(txtT.getText().toString());

                        float decV = decX / decT;
                        String strV = String.valueOf(decV);
                        txtV.setText(strV);
                        txtV.setTextColor(Color.rgb(102, 204, 255));


                    }

                    else if (txtT.getText().length() == 0){
                        float decV = Float.parseFloat(txtV.getText().toString());
                        float decX = Float.parseFloat(txtX.getText().toString());

                        float decT = decX/ decV;
                        String strT = String.valueOf(decT);
                        txtT.setText(strT);
                        txtT.setTextColor(Color.rgb(102, 204, 255));



                    }


                    else {
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






          //  int decX = Integer.parseInt(txtX.getText(). toString());
          //  int decV = Integer.parseInt(txtV.getText(). toString());
           // int decT = Integer.parseInt(txtT.getText().toString());







