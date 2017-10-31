package com.ypnors.bmi6;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void bmi(View view){
    EditText edWeight=(EditText)findViewById(R.id.ed_weight);
    EditText edHeight=(EditText)findViewById(R.id.ed_height);
    float weight=Float.parseFloat(edWeight.getText().toString());
    float height=Float.parseFloat(edHeight.getText().toString());
    float bmi=weight/(height*height);
    new AlertDialog.Builder(this)
            .setMessage("youe bmi"+bmi)
            .setPositiveButton("ok",null)
            .show();
}
}
