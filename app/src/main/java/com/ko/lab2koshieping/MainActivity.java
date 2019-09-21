package com.ko.lab2koshieping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etInput1, etInput2, etInput3, etInput4, etInput5, etInput6, etInput7, etInput8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput1 = findViewById(R.id.editText);
        etInput2 = findViewById(R.id.editText2);
        etInput3 = findViewById(R.id.editText3);
        etInput4 = findViewById(R.id.editText4);
        etInput5 = findViewById(R.id.editText5);
        etInput6 = findViewById(R.id.editText6);
        etInput7 = findViewById(R.id.editText7);
        etInput8 = findViewById(R.id.editText8);
    }

    public void nextPage(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String input1 = etInput1.getText().toString();
        String input2 = etInput2.getText().toString();
        String input3 = etInput3.getText().toString();
        String input4 = etInput4.getText().toString();
        String input5 = etInput5.getText().toString();
        String input6 = etInput6.getText().toString();
        String input7 = etInput7.getText().toString();
        String input8 = etInput8.getText().toString();



        editor.putString("input1", input1);
        editor.putString("input2", input2);
        editor.putString("input3", input3);
        editor.putString("input4", input4);
        editor.putString("input5", input5);
        editor.putString("input6", input6);
        editor.putString("input7", input7);
        editor.putString("input8", input8);
        editor.commit();

        Toast.makeText(this,"Course Saved!", Toast.LENGTH_LONG).show();
    }


}
