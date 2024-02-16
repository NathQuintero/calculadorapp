package com.nathquintero.calculadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSumar;
        Button btnRestar;
        Button btnMultiplicar;
        Button btnDividir;

        EditText etNum1, etNum2;
        TextView tvResultado;

        btnSumar= findViewById(R.id.button);
        btnRestar= findViewById(R.id.button2);
        btnMultiplicar= findViewById(R.id.button3);
        btnDividir= findViewById(R.id.button4);

        etNum1= findViewById(R.id.editTextNumberDecimal);
        etNum2= findViewById(R.id.editTextNumberDecimal2);
        tvResultado= findViewById(R.id.textView);
    }

    public void clickSumar(View view){
        Toast.makeText(this, "no quiero sumar", Toast.LENGTH_SHORT).show();
    }
}
