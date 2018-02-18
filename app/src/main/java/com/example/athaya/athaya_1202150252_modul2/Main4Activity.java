package com.example.athaya.athaya_1202150252_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    Spinner meja;
    Button Pilih;
    EditText Nama;
    //String spinn = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        meja = findViewById(R.id.spinner);
        Pilih = findViewById(R.id.pesanan);
        Nama = findViewById(R.id.nama);

        //untuk memanggil array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (meja != null) {
            meja.setAdapter(adapter);
        }
    }



    public void pilih(View view) {

        String Nomor = meja.getSelectedItem().toString();

        //untuk membuat toast jika nomor meja dipilih & memindahkan ke activity selanjutnya
        if (Nomor.equalsIgnoreCase("Meja 1")){
            Toast.makeText(Main4Activity.this, "Meja 1 telah terpilih",Toast.LENGTH_LONG).show();
            Intent a = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(a);
        } else if (Nomor.equalsIgnoreCase("Meja 2")){
            Toast.makeText(Main4Activity.this, "Meja 2 telah terpilih",Toast.LENGTH_LONG).show();
            Intent a = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(a);
        } else if (Nomor.equalsIgnoreCase("Meja 3")){
            Toast.makeText(Main4Activity.this, "Meja 3 telah terpilih",Toast.LENGTH_LONG).show();
            Intent a = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(a);
        } else if (Nomor.equalsIgnoreCase("Meja 4")){
            Toast.makeText(Main4Activity.this, "Meja 4 telah terpilih",Toast.LENGTH_LONG).show();
            Intent a = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(a);
        } else if (Nomor.equalsIgnoreCase("Meja 5")){
            Toast.makeText(Main4Activity.this, "Meja 5 telah terpilih",Toast.LENGTH_LONG).show();
            Intent a = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(a);
        }
    }
}
