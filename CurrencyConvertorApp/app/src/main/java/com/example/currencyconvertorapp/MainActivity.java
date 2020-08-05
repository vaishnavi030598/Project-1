package com.example.currencyconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConversionFunction(View view){
        EditText Edit=(EditText) findViewById(R.id.inputEditText);
        String Amount=Edit.getText().toString();
        double rupAmountInDouble=Double.parseDouble(Amount);
        double amountInDollars=rupAmountInDouble*70;
        String amountInDollars2Dec=String.format("%.2f",amountInDollars);
        Toast.makeText(this, "Rps"+Amount+" is $"+amountInDollars2Dec, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}