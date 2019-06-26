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


public class actFgmg extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_fgmg);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_fgmg, menu);
        return true;
    }

    public void btnClearFGMG(View v){
        EditText txtFg = (EditText) findViewById(R.id.editText22);
        EditText txtm = (EditText) findViewById(R.id.editText23);


        txtFg.setText("");
        txtm.setText("");

        txtFg.setTextColor(Color.rgb(255, 255, 255));
        txtm.setTextColor(Color.rgb(255, 255, 255));

        TextView txVFg = (TextView) findViewById(R.id.textView43);
        TextView txVM= (TextView) findViewById(R.id.textView44);

          }



   public void btnEnterfgmf (View view){
       EditText txtFg = (EditText) findViewById(R.id.editText22);
       EditText txtm = (EditText) findViewById(R.id.editText23);

       txtFg.setTextColor(Color.rgb(255, 255, 255));
       txtm.setTextColor(Color.rgb(255, 255, 255));

       TextView txVFg = (TextView) findViewById(R.id.textView43);
       TextView txVM= (TextView) findViewById(R.id.textView44);




       if (txtFg.getText().length() == 0 && txtm.getText().length() == 0 ){
           AlertDialog alertDialog = new AlertDialog.Builder(this).create();
           alertDialog.setTitle("");
           alertDialog.setMessage("Enter one number to solve");
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.cancel();
               }
           });

           alertDialog.show();
           //

       }

      else  if(txtFg.getText().length() == 0){
           float decm = Float.parseFloat(txtm.getText().toString());

           double decFg = decm * 9.8;
           String strFg = String.valueOf(decFg);
           txtFg.setText(strFg);

           txtFg.setTextColor(Color.rgb(102, 204, 255));


       }

      else if(txtm.getText().length() == 0){
           float decFg = Float.parseFloat(txtFg.getText().toString());

           double decm = decFg / 9.8;
           String strm = String.valueOf(decm);
           txtm.setText(strm);
           txtm.setTextColor(Color.rgb(102, 204, 255));




       }
       else{
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
