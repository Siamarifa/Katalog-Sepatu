package com.example.katalogsepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSepatu_kantor,btnSepatu_pesta,btnSepatu_sport;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnSepatu_kantor = findViewById(R.id.btn_buka_profil_Sepatu_kantor);
        btnSepatu_pesta= findViewById(R.id.btn_buka_profil_Sepatu_pesta);
        btnSepatu_sport = findViewById(R.id.btn_buka_profil_Sepatu_sport);
        btnSepatu_kantor.setOnClickListener(view -> bukaGaleri("Sepatu_kantor"));
        btnSepatu_pesta.setOnClickListener(view -> bukaGaleri("Sepatu_pesta"));
        btnSepatu_sport.setOnClickListener(view -> bukaGaleri("Sepatu_sport"));
    }

    private void bukaGaleri(String JenisSepatu) {
        Log.d("MAIN","Buka activity sepatu_kantor");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, JenisSepatu);
        startActivity(intent);
    }
}