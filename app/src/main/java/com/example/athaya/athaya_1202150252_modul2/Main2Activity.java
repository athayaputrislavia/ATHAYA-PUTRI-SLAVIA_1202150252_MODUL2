package com.example.athaya.athaya_1202150252_modul2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //untuk mendeklarasikan radio group
    RadioGroup radio;

    //untuk mendeklarasikan radio button
    RadioButton Dine,Take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //untuk mendapatkan id dari radio button dine in
        Dine = findViewById(R.id.button1);
        //untuk mendapatkan id dari radio button take away
        Take = findViewById(R.id.button2);
        //untuk mencari id dari radio group
        radio = findViewById(R.id.radioGroup);
    }

    public void button(View view) {
        int selecteditem = radio.getCheckedRadioButtonId();
        Dine = findViewById(R.id.button1);
        Take = findViewById(R.id.button2);
        radio = findViewById(R.id.radioGroup);

        //untuk mengatur radio button
        if (selecteditem == Dine.getId()){
            Intent keluar = new Intent(Main2Activity.this,Main4Activity.class);
            startActivity(keluar);
            Toast.makeText(Main2Activity.this,"Dine In",Toast.LENGTH_SHORT).show();

        }else if (selecteditem == Take.getId()) {
            Intent keluar = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(keluar);
            Toast.makeText(Main2Activity.this,"Take Away",Toast.LENGTH_SHORT).show();
        }
    }
}
