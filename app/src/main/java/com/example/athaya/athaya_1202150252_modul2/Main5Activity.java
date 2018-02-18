package com.example.athaya.athaya_1202150252_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private RecyclerView Rview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> menu;
    private ArrayList<String> Harga;
    private ArrayList<Integer> gambar;
    private TextView x, y;

    //menu makanan
    private String[] makanan = {"Bakso", "Coto Makassar", "Donat", "Dorayaki", "Ekkado", "Hotdog",
            "Rendang", "Sate", "Sushi", "Tempe"};
    //harga
    private String[] harga = {"Rp. 15.000", "Rp. 25.000", "Rp. 5.000", "Rp. 10.000", "Rp. 5.000",
            "Rp. 15.000", "Rp. 30.000", "Rp. 15.000", "Rp. 15.000", "Rp. 5.000"};
    //gambar
    private int[] Gambar = {R.drawable.bakso, R.drawable.coto, R.drawable.donat,
            R.drawable.dorayaki, R.drawable.ekkado, R.drawable.hotdog, R.drawable.rendang, R.drawable.sate,
            R.drawable.sushi, R.drawable.tempe};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //untuk mengambil data
        menu = new ArrayList<>();
        Harga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        Rview = (RecyclerView) findViewById(R.id.recycler_view);
        Rview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        Rview.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(menu, Harga, gambar);
        Rview.setAdapter(adapter);
    }


    private void DaftarItem() {
        for (int z = 0; z < makanan.length; z++) {
            menu.add(makanan[z]);
            Harga.add(harga[z]);
            gambar.add(Gambar[z]);
        }
    }
}

