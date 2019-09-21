package com.ko.lab2koshieping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText etCheckInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Validate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etCheckInput = findViewById(R.id.editText9);
    }

    public void previousPage(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String userInput = etCheckInput.getText().toString();

        String c1 = sp.getString("input1", null);
        String c2 = sp.getString("input2", null);
        String c3 = sp.getString("input3", null);
        String c4 = sp.getString("input4", null);
        String c5 = sp.getString("input5", null);
        String c6 = sp.getString("input6", null);
        String c7 = sp.getString("input7", null);
        String c8= sp.getString("input8", null);

        if(userInput.equals(c1) || userInput.equals(c2) || userInput.equals(c3) || userInput.equals(c4) || userInput.equals(c5)
                || userInput.equals(c6) || userInput.equals(c7) || userInput.equals(c8)){

            Toast.makeText(this,"Course is Offered in UST!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Course is not Offered in UST!", Toast.LENGTH_LONG).show();
        }
    }
}
