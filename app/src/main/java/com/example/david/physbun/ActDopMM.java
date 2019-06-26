package com.example.david.physbun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ActDopMM extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dop_mm);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_dop_mm, menu);
        return true;
    }

    public void btnClearDopMM(View v) {

        EditText txtF = (EditText) findViewById(R.id.editText49);
        EditText txtFo = (EditText) findViewById(R.id.editText50);
        EditText txtV = (EditText) findViewById(R.id.editText51);
        EditText txtVo = (EditText) findViewById(R.id.editText52);
        EditText txtVs = (EditText) findViewById(R.id.editText53);

        txtF.setText("");
        txtFo.setText("");
        txtV.setText("");
        txtVo.setText("");
        txtVs.setText("");
    }


    public void btnEnterdopmm(View v) {

        EditText txtF = (EditText) findViewById(R.id.editText49);
        EditText txtFo = (EditText) findViewById(R.id.editText50);
        EditText txtV = (EditText) findViewById(R.id.editText51);
        EditText txtVo = (EditText) findViewById(R.id.editText52);
        EditText txtVs = (EditText) findViewById(R.id.editText53);


        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtV.getText().length() == 0 && txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }


        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtV.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }

        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtV.getText().length() == 0 && txtVo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }
        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }
        if (txtVo.getText().length() == 0 && txtFo.getText().length() == 0 && txtV.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }
        if (txtF.getText().length() == 0 && txtVo.getText().length() == 0 && txtV.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }

        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }
        if (txtF.getText().length() == 0 && txtVo.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }
        if (txtF.getText().length() == 0 && txtVs.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }
        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtVo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();

        }
        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();


        }
        if (txtF.getText().length() == 0 && txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtVo.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtV.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtVo.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtV.getText().length() == 0 && txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtF.getText().length() == 0 && txtFo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtF.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtF.getText().length() == 0 && txtVo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtF.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtV.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtVo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtFo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtV.getText().length() == 0 && txtVo.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtV.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }
        if (txtVo.getText().length() == 0 && txtVs.getText().length() == 0) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Enter Four numbers");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialog.show();
        }

        //Enter Final Parts!!!

        if (txtF.getText().length() == 0) {
            float decFo = Float.parseFloat(txtFo.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());
            float decVo = Float.parseFloat(txtVo.getText().toString());
            float decVs = Float.parseFloat(txtVs.getText().toString());

            float decF = 5;
            String strF = String.valueOf(decF);
            txtF.setText(strF);
        }
        if (txtFo.getText().length() == 0) {
            float decF = Float.parseFloat(txtFo.getText().toString());
            float decV = Float.parseFloat(txtV.getText().toString());
            float decVo = Float.parseFloat(txtVo.getText().toString());
            float decVs = Float.parseFloat(txtVs.getText().toString());

            float decFo = (decF * (decV + decVs)) / (decV + decVo);
            String strFo = String.valueOf(decFo);
            txtFo.setText(strFo);
        }
        if (txtV.getText().length() == 0) {
            float decF = Float.parseFloat(txtFo.getText().toString());
            float decFo = Float.parseFloat(txtV.getText().toString());
            float decVo = Float.parseFloat(txtVo.getText().toString());
            float decVs = Float.parseFloat(txtVs.getText().toString());

            float decV = 5;
            String strV = String.valueOf(decV);
            txtV.setText(strV);

        }
        if (txtVo.getText().length() == 0) {
            float decF = Float.parseFloat(txtFo.getText().toString());
            float decFo = Float.parseFloat(txtV.getText().toString());
            float decV = Float.parseFloat(txtVo.getText().toString());
            float decVs = Float.parseFloat(txtVs.getText().toString());

            float decVo = 5;
            String strVo = String.valueOf(decVs);
            txtVo.setText(strVo);

        }
        if (txtVs.getText().length() == 0) {
            float decF = Float.parseFloat(txtFo.getText().toString());
            float decFo = Float.parseFloat(txtV.getText().toString());
            float decV = Float.parseFloat(txtVo.getText().toString());
            float decVo = Float.parseFloat(txtVs.getText().toString());
            //not sure about this one
            //reeeeeeaaaaalllly am not sure, especially about the decVs
            float decVs = 5;
            String strVs = String.valueOf(decVs);
            txtVs.setText(strVs);
        }
    }
}
