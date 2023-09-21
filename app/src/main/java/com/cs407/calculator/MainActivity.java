package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = findViewById(R.id.firstNumber);
        final EditText secondNumber = findViewById(R.id.secondNumber);
        final TextView resultText = findViewById(R.id.resultText);

        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double result = num1 + num2;
                resultText.setText("Result: " + result);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double result = num1 - num2;
                resultText.setText("Result: " + result);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                double result = num1 * num2;
                resultText.setText("Result: " + result);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(firstNumber.getText().toString());
                double num2 = Double.parseDouble(secondNumber.getText().toString());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultText.setText("Result: " + result);
                } else {
                    resultText.setText("Cannot divide by zero");
                }
            }
        });
    }
}
