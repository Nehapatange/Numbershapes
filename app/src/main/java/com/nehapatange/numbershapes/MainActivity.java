package com.nehapatange.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



        class Number{
            int number;

            public boolean isSquare(){

                double squareRoot = Math.sqrt(number);
                if (squareRoot == Math.floor(squareRoot)){
                    return true;

                }
                else{
                    return false;
                }


            }



            public boolean isTriangular(){

                int x=1;
                int triangularNo=1;

                while(triangularNo < number){
                    x++;
                    triangularNo = triangularNo + x;
                }

                if (triangularNo == number){
                    return true;
                }

                else{
                    return false;
                }





            }
        }


    public void testNumber(View view){
        String message = "";

        EditText numberField = (EditText)findViewById(R.id.numberField);


        if (numberField.getText().toString().isEmpty()){
            message = "Please enter a number.";
        }

        else {


            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(numberField.getText().toString());

            if (myNumber.isSquare()){

                if (myNumber.isTriangular()){

                    message= myNumber.number + " is both triangular and square !!";
                }

                else{

                    message = myNumber.number + " is only square and not triangular.";
                }
            }
            else {

                if (myNumber.isTriangular()){

                    message= myNumber.number + " is triangular and not square.";
                }
                else{
                    message = myNumber.number + " is neither triangular nor square";
                }
            }

        }
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
