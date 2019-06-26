package com.example.david.physbun;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog;
import android.graphics.Color;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;




public class Act4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act4, menu);
        return true;
    }

    public void btnClearAct4(View v){
        EditText txtX = (EditText) findViewById(R.id.editText11);
        EditText txtV0 = (EditText) findViewById(R.id.editText12);
        EditText txtXO = (EditText) findViewById(R.id.editText14);
        EditText txtT = (EditText) findViewById(R.id.editText13);

        txtX.setText("");
        txtXO.setText("");
        txtV0.setText("");
        txtT.setText("");

        txtX.setTextColor(Color.rgb(255,255,255));
        txtXO.setTextColor(Color.rgb(255,255,255));
        txtV0.setTextColor(Color.rgb(255,255,255));
        txtT.setTextColor(Color.rgb(255,255,255));

        TextView TxVX = (TextView) findViewById(R.id.textView5);
        TextView txVV0 = (TextView) findViewById(R.id.textView6);
        TextView txVT = (TextView) findViewById(R.id.textView7);
        TextView txXO = (TextView) findViewById(R.id.textView8);




    }


    public void btnEnterC(View v) {
        EditText txtX = (EditText) findViewById(R.id.editText11);
        EditText txtV0 = (EditText) findViewById(R.id.editText12);
        EditText txtXO = (EditText) findViewById(R.id.editText14);
        EditText txtT = (EditText) findViewById(R.id.editText13);

        txtX.setTextColor(Color.rgb(255,255,255));
        txtXO.setTextColor(Color.rgb(255,255,255));
        txtV0.setTextColor(Color.rgb(255,255,255));
        txtT.setTextColor(Color.rgb(255,255,255));

        TextView TxVX = (TextView) findViewById(R.id.textView5);
        TextView txVV0 = (TextView) findViewById(R.id.textView6);
        TextView txVA = (TextView) findViewById(R.id.textView8);
        TextView txVT = (TextView) findViewById(R.id.textView7);



        if (txtV0.getText().length() == 0 && txtX.getText().length() == 0 && txtT.getText().length() == 0 && txtXO.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();

        }

            else if (txtV0.getText().length() == 0 && txtX.getText().length() == 0 && txtT.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
            }

        else if (txtV0.getText().length() == 0 && txtX.getText().length() == 0 && txtXO.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if (txtV0.getText().length() == 0 && txtXO.getText().length() == 0 && txtT.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if (txtXO.getText().length() == 0 && txtX.getText().length() == 0 && txtT.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtV0.getText().length() == 0 && txtX.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtX.getText().length() == 0 && txtXO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtX.getText().length() == 0 && txtT.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtV0.getText().length() == 0 && txtT.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if ( txtV0.getText().length() == 0 && txtXO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();;
        }

        else if ( txtT.getText().length() == 0 && txtXO.getText().length() == 0   ){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("");
            alertDialog.setMessage("Enter three numbers to solve");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }});

            alertDialog.show();
        }

        else if (txtT.getText().length() == 0 ){
            float decX = Float.parseFloat(txtX.getText().toString());
            float decXO = Float.parseFloat(txtXO.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decT = (decX - decXO)/decV0 ;
            String strT = String.valueOf(decT);
            txtT.setText(strT);
            txtT.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtX.getText().length() == 0 ){
            float decT = Float.parseFloat(txtT.getText().toString());
            float decA = Float.parseFloat(txtXO.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decX = (decV0 * decT) + decA;
            String strX = String.valueOf(decX);
            txtX.setText(strX);
            txtX.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtV0.getText().length() == 0 ){
            float decT = Float.parseFloat(txtT.getText().toString());
            float decA = Float.parseFloat(txtXO.getText().toString());
            float decX = Float.parseFloat(txtX.getText().toString());

            float decV0 = (decX - decA)/ decT;
            String strV0 = String.valueOf(decV0);
            txtV0.setText(strV0);
            txtV0.setTextColor(Color.rgb(102,204,255));

        }

        else if (txtXO.getText().length() == 0 ){
            float decX = Float.parseFloat(txtX.getText().toString());
            float decT = Float.parseFloat(txtT.getText().toString());
            float decV0 = Float.parseFloat(txtV0.getText().toString());

            float decA = (decX) - (decV0 * decT);
            String strA = String.valueOf(decA);
            txtXO.setText(strA);
            txtXO.setTextColor(Color.rgb(102,204,255));

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
