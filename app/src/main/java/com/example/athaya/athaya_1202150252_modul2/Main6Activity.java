package com.example.athaya.athaya_1202150252_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    private TextView a,b,c;
    private ImageView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        a = findViewById(R.id.namaMakanan);
        b = findViewById(R.id.harga);
        c = findViewById(R.id.komposisi);
        d = findViewById(R.id.gambar);


        Intent e = getIntent();
        String menu = e.getStringExtra("judul");
        String harga = e.getStringExtra("harga");
        String komposisi = e.getStringExtra("komposisi");
        Integer Gambar = e.getIntExtra("gambar",0);

        a.setText(menu);
        b.setText(harga);
        c.setText(komposisi);
        d.setImageResource(Gambar);
    }
}
