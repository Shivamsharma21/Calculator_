package com.example.calculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogGenrator extends AppCompatDialogFragment {

    String Value ="";

    public DialogGenrator(String sumofNumber) {

        Value =sumofNumber;
        Log.d("Value is11 ->>",Value);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(),DialogGenrator.class);
       // Log.d("Value ->>>",value);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Sum is ")
                .setMessage(Value).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
      return builder.create();
    }
}
