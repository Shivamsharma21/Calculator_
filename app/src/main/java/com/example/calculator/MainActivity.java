package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter =1;
    TextView textView;
   Button plus_btn,minus_btn,multiply_btn,divide_btn,Submit_btn,reset;

   EditText num1,num2;

   int flag = 0;

   public String SumofNumber="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textview);

        plus_btn = findViewById(R.id.button);
        minus_btn = findViewById(R.id.button2);
        multiply_btn= findViewById(R.id.button3);
        divide_btn = findViewById(R.id.button4);
        Submit_btn = findViewById(R.id.submit_button);

        plus_btn.setBackgroundColor(Color.GREEN);
        minus_btn.setBackgroundColor(Color.GRAY);
        multiply_btn.setBackgroundColor(Color.GRAY);
        divide_btn.setBackgroundColor(Color.GRAY);


        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Plus_method();
           //OpenDialog();
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Minus_Method();
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Divide_Method();
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Multiply_Method();
            }
        });


        Submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter == 1){
                    add();
                }
                counter =2;

               Intent intent = new Intent(MainActivity.this,DialogGenrator.class);
                intent.putExtra("Sum",SumofNumber);
                textView.setText(SumofNumber);
                OpenDialog();
               // EnableButtons();
            }
        });

    }
    void Plus_method(){
        //flag =1;
        // DisableButton();
        //flag =0;
            plus_btn.setBackgroundColor(Color.GREEN);
            multiply_btn.setBackgroundColor(Color.GRAY);
            divide_btn.setBackgroundColor(Color.GRAY);
            minus_btn.setBackgroundColor(Color.GRAY);
         if (num1.getText().toString().trim().equalsIgnoreCase("") && num2.getText().toString().trim().equalsIgnoreCase("")){

             num1.setError("Please Enter a number");
             num2.setError("Please Enter a number");


         }else if (num1.getText().toString().trim().equalsIgnoreCase("")){
             num1.setError("Please Enter a number");
         }else if (num2.getText().toString().trim().equalsIgnoreCase("")){
             num2.setError("Please Enter a number");
         }
         else {

             Float number1 = Float.valueOf(num1.getText().toString());
             Float number2 = Float.valueOf(num2.getText().toString());
             Float sum = number1 + number2;

             SumofNumber = String.valueOf(sum);
             textView.setText(SumofNumber);
         }

    }
    void Minus_Method(){



        //flag =2;
      //  DisableButton();
     //   minus_btn.setBackgroundResource(android.R.drawable.btn_default);
        minus_btn.setBackgroundColor(Color.GREEN);
        plus_btn.setBackgroundColor(Color.GRAY);
        multiply_btn.setBackgroundColor(Color.GRAY);
        divide_btn.setBackgroundColor(Color.GRAY);
        //minus_btn.setEnabled(true);


       // flag =0;
        if (num1.getText().toString().trim().equalsIgnoreCase("") && num2.getText().toString().trim().equalsIgnoreCase("")){

            num1.setError("Please Enter a number");
            num2.setError("Please Enter a number");


        }else if (num1.getText().toString().trim().equalsIgnoreCase("")){
            num1.setError("Please Enter a number");
        }else if (num2.getText().toString().trim().equalsIgnoreCase("")){
            num2.setError("Please Enter a number");
        }
        else {

            Float number1 = Float.valueOf(num1.getText().toString());
            Float number2 = Float.valueOf(num2.getText().toString());
            Float sum = number1 - number2;

            SumofNumber = String.valueOf(sum);
            textView.setText(SumofNumber);
        }


    }
    void Divide_Method(){

      //  flag =4;
      //  DisableButton();
       // flag =0;


       // divide_btn.setBackgroundResource(android.R.drawable.btn_default);

        plus_btn.setBackgroundColor(Color.GRAY);
        minus_btn.setBackgroundColor(Color.GRAY);
        multiply_btn.setBackgroundColor(Color.GRAY);
        divide_btn.setBackgroundColor(Color.GREEN);

        if (num1.getText().toString().trim().equalsIgnoreCase("") && num2.getText().toString().trim().equalsIgnoreCase("")){

            num1.setError("Please Enter a number");
            num2.setError("Please Enter a number");


        }else if (num1.getText().toString().trim().equalsIgnoreCase("")){
            num1.setError("Please Enter a number");
        }else if (num2.getText().toString().trim().equalsIgnoreCase("")){
            num2.setError("Please Enter a number");
        }
        else {

            Float number1 = Float.valueOf(num1.getText().toString());
            Float number2 = Float.valueOf(num2.getText().toString());
            Float sum = number1 / number2;

            SumofNumber = String.valueOf(sum);
            textView.setText(SumofNumber);
        }


    }
    void Multiply_Method(){
      //  flag = 3;
       // DisableButton();
        //flag =0;
        plus_btn.setBackgroundColor(Color.GRAY);
        minus_btn.setBackgroundColor(Color.GRAY);
        divide_btn.setBackgroundColor(Color.GRAY);

        multiply_btn.setBackgroundColor(Color.GREEN);
       // multiply_btn.setBackgroundResource(android.R.drawable.btn_default);

        if (num1.getText().toString().trim().equalsIgnoreCase("") && num2.getText().toString().trim().equalsIgnoreCase("")){

            num1.setError("Please Enter a number");
            num2.setError("Please Enter a number");


        }else if (num1.getText().toString().trim().equalsIgnoreCase("")){
            num1.setError("Please Enter a number");
        }else if (num2.getText().toString().trim().equalsIgnoreCase("")){
            num2.setError("Please Enter a number");
        }
        else {

            Float number1 = Float.valueOf(num1.getText().toString());
            Float number2 = Float.valueOf(num2.getText().toString());
            Float sum = number1 * number2;

            SumofNumber = String.valueOf(sum);
            textView.setText(SumofNumber);
        }

    }

    void DisableButton(){

        if (flag ==1) {
        ////   plus
            minus_btn.setEnabled(false);
            minus_btn.setBackgroundColor(Color.GRAY);


            multiply_btn.setEnabled(false);
            multiply_btn.setBackgroundColor(Color.GRAY);

            divide_btn.setEnabled(false);
            divide_btn.setBackgroundColor(Color.GRAY);

        }
        else if (flag ==2){
        ////  minus
            plus_btn.setEnabled(false);
            plus_btn.setBackgroundColor(Color.GRAY);

            multiply_btn.setEnabled(false);
            multiply_btn.setBackgroundColor(Color.GRAY);

            divide_btn.setEnabled(false);
            divide_btn.setBackgroundColor(Color.GRAY);

        }
        else if (flag ==3){
            ///  multiply

            plus_btn.setEnabled(false);
            plus_btn.setBackgroundColor(Color.GRAY);

            divide_btn.setEnabled(false);
            divide_btn.setBackgroundColor(Color.GRAY);

            minus_btn.setEnabled(false);
            minus_btn.setBackgroundColor(Color.GRAY);

        }else{
            ///divide
            plus_btn.setEnabled(false);
            plus_btn.setBackgroundColor(Color.GRAY);

            multiply_btn.setEnabled(false);
            multiply_btn.setBackgroundColor(Color.GRAY);

            minus_btn.setEnabled(false);
            minus_btn.setBackgroundColor(Color.GRAY);

        }



    }

void EnableButtons(){

        plus_btn.setEnabled(true);
        plus_btn.setBackgroundResource(android.R.drawable.btn_default);
        minus_btn.setEnabled(true);
        minus_btn.setBackgroundResource(android.R.drawable.btn_default);
        divide_btn.setEnabled(true);
        divide_btn.setBackgroundResource(android.R.drawable.btn_default);
        multiply_btn.setEnabled(true);
        multiply_btn.setBackgroundResource(android.R.drawable.btn_default);
    }

  void OpenDialog(){
      Log.d("Sum Of Number is ",SumofNumber);
        DialogGenrator dialogGenrator = new DialogGenrator(SumofNumber);
        dialogGenrator.show(getSupportFragmentManager(),"example Dialog");
  }
  void add(){
      if (num1.getText().toString().trim().equalsIgnoreCase("") && num2.getText().toString().trim().equalsIgnoreCase("")){

          num1.setError("Please Enter a number");
          num2.setError("Please Enter a number");


      }else if (num1.getText().toString().trim().equalsIgnoreCase("")){
          num1.setError("Please Enter a number");
      }else if (num2.getText().toString().trim().equalsIgnoreCase("")){
          num2.setError("Please Enter a number");
      }
      else {

          Float number1 = Float.valueOf(num1.getText().toString());
          Float number2 = Float.valueOf(num2.getText().toString());
          Float sum = number1 + number2;

          SumofNumber = String.valueOf(sum);
      }

  }
}
