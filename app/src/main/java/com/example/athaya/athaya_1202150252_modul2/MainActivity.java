package com.example.athaya.athaya_1202150252_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Untuk memunculkan toast
        Toast.makeText(getApplicationContext(), "ATHAYA_1202150252", Toast.LENGTH_SHORT ).show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                //untuk pindah tampilan
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);

            }
        },      //untuk mengatur lamanya splash
                3000L); //3000 L = 3 detik

}
}
