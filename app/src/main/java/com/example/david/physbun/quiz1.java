package com.example.david.physbun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quiz1 extends AppCompatActivity {


    int[] scores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] qs = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int score = 0;
    int locat = 0;
    double solution = 0;
    double solution2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        for (int i = 0; i <= 9; i++) {
            int tim = 0;
            while (tim == 0) {

                int bob = (int) (32 * Math.random()) + 1;

                for (int b = 0; b <= i; b++) {
                    if (bob == qs[b]) {
                        tim = 0;
                        break;

                    } else if ((b == i)) {
                        qs[i] = bob;
                        tim = 1;

                    }


                }
            }


        }


        EditText txtL = (EditText) findViewById(R.id.editText86);














    }

    public void  start(View view) {

        EditText txtL = (EditText) findViewById(R.id.editText86);
        Button btny = (Button) findViewById(R.id.button94);


        btny.setVisibility(View.VISIBLE);
        txtL.setVisibility(View.VISIBLE);


        Button btnl = (Button) findViewById(R.id.button95);
        btnl.setVisibility(View.INVISIBLE);


        int gob = 0;
        while(gob == 0){

            TextView txtM = (TextView) findViewById(R.id.textView87);
            int x = (int) (20 * Math.random()) + 1;
            int t = (int) (13 * Math.random()) + 1;
            int r3 = (int) (5 * Math.random()) + 1;
            String[] anl = { "cat", "dog", "car", "bike", "ball", "truck" };
            solution = x/t;
            solution2 = x/t;


            TextView txtU = (TextView) findViewById(R.id.textView88);
            txtU.setText("m/s");


            txtM.setText("What is the velocity of a "+anl[r3] +" if it travels "+ x+" m in "+t+" seconds?");
            if(solution > -1){gob++;}

        }

        // int  indexi = qs[locat];

        //solvecheck(indexi);




    }

    public void   realsonve(View view) {

        int  indexi = qs[locat];


        EditText txtL = (EditText) findViewById(R.id.editText86);


        if(        txtL.getText().toString().equals("")){
        }
        else{        solvecheck(indexi);
        }

        //no negatives
        //
        //
        //
        //
        //
        //
        //



    }


    public void   solvecheck(int indexer) {

        int bob = indexer;


        if (indexer == 0) {

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);

                int V = (int) (90 * Math.random()) + 50;
                int t = (int) (10 * Math.random()) + 1;
                int a = (int) (5 * Math.random()) + 1;
                solution = V - (t * a);
                solution2 = V - (t * a);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("If a skateboard is accelerated to a speed of " + V +" m/s in " + t + " seconds" +
                        " while accelerating at " + a+ " m/s², what was the board’s initial velocity?\n");
                if(solution > -1){gob++;}




            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }
        else if(indexer == 1){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int Vf = (int) (30 * Math.random()) + 10;

                int d = (int) (15 * Math.random()) + 1;
                solution = ((Vf * Vf) )/(2 * d);
                solution2 = ((Vf * Vf) )/(2 * d);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A car accelerates uniformly from rest to a speed of "+ Vf+ " m/s " +
                        "over a distance of "+ d + " m. What is the acceleration of the car?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");



            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }







        }
        else if(indexer == 2){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int Vf = (int) (30 * Math.random()) + 10;

                int d = (int) (15 * Math.random()) + 1;
                solution = ((Vf * Vf) )/(2 * d);
                solution2 = ((Vf * Vf) )/(2 * d);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A motorbike accelerates uniformly from rest to a velocity of "+ Vf +
                        " over a distance of " +d+" m. What is the acceleration of the bike?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }


        }
        else if(indexer == 3){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int m = (int) (500 * Math.random()) + 100;
                int a = (int) (30 * Math.random()) + 1;
                solution = m * a;
                solution2 = m * a;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("N");


                txtM.setText("What net force is needed to accelerate a " + m+ " kg mass at " + a +" m/s²");
                if(solution > -1){gob++;}

            }

            txtL.setText("");



            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }



        }
        else if(indexer == 4){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (500 * Math.random()) + 300;
                int M = (int) (40 * Math.random()) + 1;
                solution = F/M;
                solution2 = F/M;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A "+ M+" kg box is pushed with a force of "+ F+" N. What is the acceleration of the box?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");



            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }
        else if(indexer == 5){
            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (500000 * Math.random()) + 100000;

                solution = F/10;
                solution2 = F/ (9.81);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("kg");


                txtM.setText("What is the mass of a "+ F +" N boat?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        //////
        //
        //
        //
        //
        //
        //
        ///////
        else if(indexer == 6){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int v = (int) (80 * Math.random()) + 30;
                int t = (int) (15 * Math.random()) + 5;
                solution = v/t;
                solution2 = v/t;




                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");

                txtM.setText("A plane starts from rest and hits a speed of "+v+" m/s in "+t+" seconds. What is the acceleration of the plane during this time?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }

        //
        ///
        ////
        ////
        ///
        ///
        ///
        //
        //
        else if(indexer == 7){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int V = (int) (150 * Math.random()) + 80;
                int x = (int) (2000 * Math.random()) + 1000;
                solution = (V*V) / (2 * x);
                solution2 = (V*V) / (2 * x);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A plane takes off at " +V+" m/s. What is the minimum acceleration needed for " +
                        "the plane to take off before reaching the end of the "+ x+" m runway?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }
        else if(indexer == 8){

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (20 * Math.random()) + 5;
                int r2 = (int) (500 * Math.random()) + 175;
                solution = ( F * Math.cos(21)) /(r2/10);
                solution2 = ( F * Math.cos(21)) /(r2/9.8);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A box with a force of "+ r2+" N accelerates on a frictionless surface while being pulled " +
                        "by a force of "+F+" N at an angle of 21°. What is the horizontal acceleration of the box?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 9){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (500 * Math.random()) + 100;
                double x = (int) (.04 * Math.random()) + .01;
                solution = F/x;
                solution2 = F/x;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("N/m");


                txtM.setText("The spring in a scale stretches to " + x + " m when a" +
                        " box that weighs "+ F + " N is placed on it. What is the spring constant?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 10){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int K = (int) (80 * Math.random()) + 40;
                double X = (int) (.7 * Math.random()) + .1;
                solution = (.5) * K * (X * X);
                solution2 = (.5) * K * (X * X);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("J");


                txtM.setText("When a mass is placed on a spring with a spring constant of "+ K +" N/m and " +
                        "the spring is compressed "+ X+" m, how much energy is stored in the spring?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 11){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int K = (int) (30 * Math.random()) + 6;
                double X =  (.5 * Math.random()) + .1;
                solution = .5 * K * (X * X);
                solution2 = .5 * K * (X * X);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("J");


                txtM.setText("A "+K+" N force stretches a spring "+ X+" m." +
                        " What is the potential energy?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 12){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (40 * Math.random()) + 26;
                int D = (int) (10 * Math.random()) + 3;
                solution = F * D;
                solution2 = F * D;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("J");


                txtM.setText("How much work does the force of gravity do on a " + F + " N object falling " + D + " m?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 13){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int F = (int) (440 * Math.random()) + 220;
                int d = (int) (10 * Math.random()) + 5;
                solution = F * d;
                solution2 = F * d;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("J");


                txtM.setText( "A deliveryman carries a "+ F +" N package up the stairs, a displacement of "+ d+" m " +
                        "vertically and 3 m horizontally. How much work does the deliveryman do?"
                );
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 14){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int M = (int) (30 * Math.random()) + 1;
                int F = (int) (440 * Math.random()) + 250;
                int X = (int) (100 * Math.random()) + 80;
                solution = F * M;
                solution2 = F * M;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("J");


                txtM.setText( "What is the distance traveled for a person running at the rate of "+M +" m/s in "+F+" seconds?"
                );
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 15){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int f = (int) (200 * Math.random()) + 150;
                int d = (int) (135 * Math.random()) + 70;
                int t = (int) (60 * Math.random()) + 30;



                solution = (f * d)/t;
                solution2 = (f * d)/t;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("W");


                txtM.setText("A child pushes a wheelbarrow with a horizontal force of " +f +
                        " N. If the child moves it "+d+" m at a constant speed for "+t+" s, what " +
                        "power is created?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 16){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int K = (int) (3000 * Math.random()) + 2000;
                int M= (int) (30 * Math.random()) + 15;
                solution = K/M;
                solution2 = K/M;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                        txtM.setText("A "+M+" kg rocket is vertically shot into the air. It has a kinetic energy of "+K+" J when it runs out of fuel. What additional height will the rocket rise after losing fuel? ");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 17){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int M = (int) (5 * Math.random()) + 1;
                int V2 = (int) (50 * Math.random()) + 10;
                int V1= (int) (5 * Math.random()) + 1;

                solution = (V2-V1)*(M);
                solution2 = (V2-V1)*(M);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("kg/m/s");


                txtM.setText("What is the magnitude of the impulse applied to a "+M+" kg bike to change its velocity from "+V1+" m/s east to "+V2+" m/s  east?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 18){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int v = (int) (75 * Math.random()) + 50;
                int D = (int) (50 * Math.random()) + 20;
                solution = (v*v)/(D/2);
                solution2 = (v*v)/D/2;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A 130,000 kg truck travels at a constant speed of "+v+" m/s around a circular track. The diameter of the track is "+D+" m. What is the truck’s centripetal acceleration?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 19){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int T = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = 10 * T;
                solution2 = 9.8 * T;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("A dropped phone reaches the ground in "+T+" seconds. What was the velocity of the phone when it hits the ground?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 20){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int V= (int) (20 * Math.random()) + 10;
                int T = (int) (3 * Math.random()) + 1;
                solution2 = V + (-10 * T);
                solution = V + (-9.8 * T);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("A ball is thrown vertically at "+V+" m/s. What was the ball’s velocity after "+T+" s?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 21){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int V = (int) (45 * Math.random()) + 1;
                int T = (int) (10 * Math.random()) + 5;
                solution = V*T;
                solution2 = V*T;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                txtM.setText("An animal runs with a speed of "+V+" m/s. How many meters does the animal travel in "+T+" seconds?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 22){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int T = (int) (40 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = (10 * T * T)/2;
                solution2 = (9.8 * T * T)/2;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                txtM.setText("If it takes you about "+T+" s to reach the ground from after jumping off of a platform, what is the height of the platform?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }

        else if(indexer == 23){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int V = (int) (20 * Math.random()) + 9;
                int t = (int) (5 * Math.random()) + 2;
                solution = V + (-10 * t);
                solution2 = V + (-9.8 * t);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("A child throws a pebble straight down at "+V+" m/s. What is the velocity of the pebble at "+t+" s? ");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 24){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int vo = (int) (5 * Math.random()) + 1;
                int t = (int) (5 * Math.random()) + 1;
                int v = (int) (30 * Math.random()) + 10;

                solution = (v - vo)/ t;
                solution2 = (v - vo)/ t;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s²");


                txtM.setText("A car is traveling at "+vo+" m/s when the driver pushes the accelerator. After "+t+" s the car has sped up to "+v+" m/s. What was the car’s acceleration? ");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

        else if(indexer == 25){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int vo = (int) (40 * Math.random()) + 20;
                int a = (int) (9 * Math.random()) + 4;
                int t = (int) (5 * Math.random()) + 1;
                solution =  (vo * t) + ((a* t * t)/2);
                solution2 =  (vo * t) + ((a* t * t)/2);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                txtM.setText("A car traveling at "+vo+" m/s accelerates at "+a+" m/s² for "+t+" seconds. What is the distance traveled during the "+t+" s? ");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 26){
            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int v = (int) (5 * Math.random()) + 1;
                int a = (int) (10 * Math.random()) + 1;
                int t = (int) (45 * Math.random()) + 1;

                solution = v + (a*t);
                solution2 = v + (a*t);

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("The initial velocity of a scooter is "+v+" m/s. What is its velocity if it accelerates at the rate of "+a+" m/s² for "+t+" seconds? ");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }

















        else if(indexer == 27){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int v = (int) (5 * Math.random()) + 1;
                int t = (int) (5 * Math.random()) + 1;
                solution = v*t;
                solution2 = v*t;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                txtM.setText("A dog runs through a tube at "+v +" m/s. How long is the tube if the dog exits in "+t+" seconds?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 28){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (15 * Math.random()) + 5;
                int r2 = (int) (7 * Math.random()) + 3;
                solution = r1 * r2;
                solution2 = r1 * r2;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m");


                txtM.setText("A car is traveling at a velocity of "+r1+" m/s. A dog sticks its head out the window for "+r2+" s. How far does the car travel during the time the dog’s head is out of the window?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 29){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int a = (int) (5 * Math.random()) + 1;
                int x = (int) (300 * Math.random()) + 100;
                solution =  Math.sqrt((2*x)/a);
                solution2 =  Math.sqrt((2*x)/a);


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("s");


                txtM.setText("How long does it take an airplane accelerating on the ground from rest at "+a+" m/s², to travel "+x+" m?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 30){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int a = (int) (10 * Math.random()) + 5;
                int x = (int) (150 * Math.random()) + 90;
                int t = (int) (3 * Math.random()) + 1;
                        solution = (x-((a*t*t)/2))/t;
                solution2 = (x-((a*t*t)/2))/t;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("A car traveling at a mystery velocity accelerates at a rate of "+a+" m/s² as it moves "+x+" m in "+t+" s. What is the mystery velocity?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 31){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int vo = (int) (80 * Math.random()) + 40;
                int v = (int) (38* Math.random()) + 1;
                int a = (int) (5 * Math.random()) + 1;
                solution = (v-vo)/a;
                solution2 = (v-vo)/a;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("s");


                txtM.setText("A car traveling at "+vo+" m/s slows to "+v+" m/s at the rate of "+a+" m/s². How much time passes as this change in speed occurs?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 32){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int a = (int) (5 * Math.random()) + 1;
                int v = (int) (15 * Math.random()) + 5;
                solution = v/a;
                solution2 = v/a;


                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("a");


                txtM.setText("A car accelerates at "+a+" m/s² from rest. How much time does the car take to accelerate to a speed of "+v+" m/s?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 33){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (17 * Math.random()) + 1;

                solution = r1 * 10;
                solution2 = r1 * 9.8;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("m/s");


                txtM.setText("A freely falling phone starts from rest. After "+r1+" seconds, what is the phone’s velocity?");
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 34){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;
                solution2 = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("34");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 35){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("35");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 36){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (((decF < (solution + .15 )) && (decF > (solution - .15)) ||     ((decF < (solution2 + .15 )) && (decF > (solution2 - .15))      )    ))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("36");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 37){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("37");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 38){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("38");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 39){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("39");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 40){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("40");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 41){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("41");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 42){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("42");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 43){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("43");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 44){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("44");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 45){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("45");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 46){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("46");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 47){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("47");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 48){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("48");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 49){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("49");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else if(indexer == 50){



            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("50");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat >(qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }




        }
        else {

            EditText txtL = (EditText) findViewById(R.id.editText86);
            Button btny = (Button) findViewById(R.id.button94);

            float decF =  Float.parseFloat(txtL.getText().toString());
            if((decF == solution || decF == solution2 )|| (decF < (solution + .15 )) && (decF > (solution - .15))){
                score++;

            }

            int gob = 0;
            while(gob == 0){

                TextView txtM = (TextView) findViewById(R.id.textView87);
                int r1 = (int) (5 * Math.random()) + 1;
                int r2 = (int) (5 * Math.random()) + 1;
                solution = r1 * r2;

                TextView txtU = (TextView) findViewById(R.id.textView88);
                txtU.setText("0e");


                txtM.setText(r1 + " x " + r2);
                if(solution > -1){gob++;}

            }

            txtL.setText("");


            locat++;
            if(locat > (qs.length -1)){
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


                SharedPreferences.Editor Hey = sharedPreferences.edit();

                Hey.putInt("place", score);
                Hey.commit();

                this.finish();
                startActivity(new Intent(getApplicationContext(), quizend.class));

            }





        }




    }






}

