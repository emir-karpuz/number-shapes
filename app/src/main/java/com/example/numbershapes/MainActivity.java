package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void calculateNumber(View view) {

        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        if(numberEditText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Hiç bir değer girilmedi!", Toast.LENGTH_SHORT).show();
        } else {

            NumberShapes numberShapes = new NumberShapes();
            numberShapes.number = Integer.parseInt(numberEditText.getText().toString());

            if (numberShapes.isTriangleNumber(numberShapes.number) && numberShapes.isSquareNumber(numberShapes.number)) {
                Toast.makeText(this, numberShapes.number + " hem kare hem de üçgen sayıdır", Toast.LENGTH_LONG).show();
            } else if (numberShapes.isSquareNumber(numberShapes.number)) {
                Toast.makeText(this, numberShapes.number + " kare sayıdır", Toast.LENGTH_LONG).show();
            } else if (numberShapes.isTriangleNumber(numberShapes.number)) {
                Toast.makeText(this, numberShapes.number + " üçgen sayıdır", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, numberShapes.number + " ikisi de değildir", Toast.LENGTH_LONG).show();
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}