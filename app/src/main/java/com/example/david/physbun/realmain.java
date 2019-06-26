package com.example.david.physbun;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;




import com.android.vending.billing.IInAppBillingService;
import com.ebookfrenzy.inappbilling.util.util.IabHelper;
import com.ebookfrenzy.inappbilling.util.util.IabResult;
import com.ebookfrenzy.inappbilling.util.util.Inventory;
import com.ebookfrenzy.inappbilling.util.util.Purchase;


import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class realmain extends ActionBarActivity {


    private static final String TAG =
            "com.ebookfrenzy.inappbilling";
    IabHelper mHelper;
    static final String ITEM_SKU = "com.example.buttonclick";
   // static final String ITEM_SKU = "android.test.purchased";



    private Button clickButton;
    private Button buyButton;


    int idName = 0;

    IInAppBillingService mService;

    ServiceConnection mServiceConn = new ServiceConnection() {
        @Override
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
        }

        @Override
        public void onServiceConnected(ComponentName name,
                                       IBinder service) {
            mService = IInAppBillingService.Stub.asInterface(service);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realmain);
        Intent serviceIntent =
                new Intent("com.android.vending.billing.InAppBillingService.BIND");
        serviceIntent.setPackage("com.android.vending");
        bindService(serviceIntent, mServiceConn, Context.BIND_AUTO_CREATE);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        SharedPreferences prefs = getSharedPreferences("purchase", MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        // if (restoredText != null) {
        String name = prefs.getString("name", "No name defined");
        idName = prefs.getInt("status", 0); //0 is the default value.
        // }




        if(idName == 1){

            buyButton = (Button) findViewById(R.id.buyButton);
            clickButton = (Button) findViewById(R.id.clickButton);


            clickButton.setVisibility(View.VISIBLE);
            buyButton.setVisibility(View.INVISIBLE);

        }
        else {

            buyButton = (Button) findViewById(R.id.buyButton);
            clickButton = (Button) findViewById(R.id.clickButton);

            clickButton.setVisibility(View.INVISIBLE);
            buyButton.setVisibility(View.VISIBLE);

        }







        String base64EncodedPublicKey =
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh/F/GtzRtt5ft7qJ9pMm+FJUb6ivQo5ZFK2PVdrEExY1z5zWOe4ZBp/mGUTORNYJe0nCv9SISX+gpIyiN1Q86f2sR1FnbKzTk5kv0NMByQ6uJLXRIVqY22mevGb7OdcPBcbd4xePaVf9uKxl9IXe7McFje9KUc8M14ICqJKl6RCq+0vIZo5GveDskCPC9MDnwi78eK2TTb8KwzxnZMkaq4xEeNtW53IZO96tdJKCEEMlkdt4LIj2YnM93kHO5ObAnLHrzUBWG0m+k3FB6b1SM/PftV654lNxZUTk8xc6yfQhsYfe9VYGqWqkzwb0k5Rzarxt4xUkSi+KMdjuQL/KLQIDAQAB\n";

        mHelper = new IabHelper(this, base64EncodedPublicKey);

        mHelper.startSetup(new
                                   IabHelper.OnIabSetupFinishedListener() {
                                       public void onIabSetupFinished(IabResult result) {
                                           if (!result.isSuccess()) {
                                               Log.d(TAG, "In-app Billing setup failed: " +
                                                       result);
                                           } else {
                                               Log.d(TAG, "In-app Billing is set up OK");
                                           }
                                       }
                                   });
    }







    public void buttonClicked (View view)
    {
        startActivity(new Intent(getApplicationContext(), quiz1.class));

    }



    public void buttonOnClick(View v) {

        startActivity(new Intent(getApplicationContext(), Convertact.class));

    }

    public void openquiz(View v) {

        startActivity(new Intent(getApplicationContext(), quiz1.class));

    }

    public void actLinear(View v){

        startActivity(new Intent(getApplicationContext(),actLinear.class));
    }

    public void actTorque(View v) {

        startActivity(new Intent(getApplicationContext(), actTorque.class));
    }

    public void actGrav(View v){
        startActivity(new Intent(getApplicationContext(), actGrav.class));

    }

    public void actWork(View v){
        startActivity(new Intent(getApplicationContext(), actWork.class));

    }

    public void actOthers(View v){
        startActivity(new Intent(getApplicationContext(), actOthers.class));

    }

    public void actDop(View v){
        startActivity(new Intent(getApplicationContext(), actDopler.class));

    }

    public void actKinetic(View v){
        startActivity(new Intent(getApplicationContext(), actKinetic.class));

    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void Page(View v) {

        goToUrl("https://play.google.com/store/apps/dev?id=8974934457249123017&hl=en");

    }








    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mService != null) {
            unbindService(mServiceConn);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data)
    {
        if (!mHelper.handleActivityResult(requestCode,
                resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }



    public void buyClick(View view) {
        mHelper.launchPurchaseFlow(this, ITEM_SKU, 10001,
                mPurchaseFinishedListener, "mypurchasetoken");
    }

    IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener
            = new IabHelper.OnIabPurchaseFinishedListener() {
        public void onIabPurchaseFinished(IabResult result,
                                          Purchase purchase)
        {
            if (result.isFailure()) {
                // Handle error

                return;
            }
            else if (purchase.getSku().equals(ITEM_SKU)) {
                consumeItem();
                buyButton.setVisibility(View.INVISIBLE);
            }

        }
    };



    public void consumeItem() {
        mHelper.queryInventoryAsync(mReceivedInventoryListener);
    }

    IabHelper.QueryInventoryFinishedListener mReceivedInventoryListener
            = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult result,
                                             Inventory inventory) {

            if (result.isFailure()) {
                if (inventory.hasPurchase(ITEM_SKU)) {

                    mHelper.consumeAsync(inventory.getPurchase(ITEM_SKU), null);

                    buyButton = (Button) findViewById(R.id.buyButton);
                    clickButton = (Button) findViewById(R.id.clickButton);


                    clickButton.setVisibility(View.VISIBLE);
                    buyButton.setVisibility(View.INVISIBLE);

                    SharedPreferences.Editor editor = getSharedPreferences("purchase", MODE_PRIVATE).edit();
                    editor.putString("name", "Elena");

                    editor.putInt("status", 1);


                    editor.apply();

                }
                // Handle failure
            } else {
                mHelper.consumeAsync(inventory.getPurchase(ITEM_SKU),
                        mConsumeFinishedListener);
            }
        }
    };


   /* public void buttonClicked (View view)
    {
        clickButton.setEnabled(false);
        buyButton.setEnabled(true);
    }
    */

    IabHelper.OnConsumeFinishedListener mConsumeFinishedListener =
            new IabHelper.OnConsumeFinishedListener() {
                public void onConsumeFinished(Purchase purchase,
                                              IabResult result) {

                    if (result.isSuccess()) {
                        clickButton.setVisibility(View.VISIBLE);

                        SharedPreferences.Editor editor = getSharedPreferences("purchase", MODE_PRIVATE).edit();
                        editor.putString("name", "Elena");

                        editor.putInt("status", 1);


                        editor.apply();




                    } else {
                        // handle error
                    }
                }
            };




    IabHelper.QueryInventoryFinishedListener mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {

        public void onQueryInventoryFinished(IabResult result, Inventory inventory) {



            if (inventory.hasPurchase(ITEM_SKU)) {

                mHelper.consumeAsync(inventory.getPurchase(ITEM_SKU), null);

                buyButton = (Button) findViewById(R.id.buyButton);
                clickButton = (Button) findViewById(R.id.clickButton);


                clickButton.setVisibility(View.VISIBLE);
                buyButton.setVisibility(View.INVISIBLE);

                SharedPreferences.Editor editor = getSharedPreferences("purchase", MODE_PRIVATE).edit();
                editor.putString("name", "Elena");

                editor.putInt("status", 1);


                editor.apply();

            }
        }
    };





}
