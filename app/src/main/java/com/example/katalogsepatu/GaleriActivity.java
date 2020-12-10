package com.example.katalogsepatu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.katalogsepatu.model.Sepatu;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    List<Sepatu> sepatus;
    int indeksTampil = 0;
    String JenisSepatu;
    Button  btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJenis,txNama,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoSepatu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_sepatu);
        Intent intent = getIntent();
        JenisSepatu = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        sepatus = DataProvider.getSepatusByTipe(this,JenisSepatu);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> sepatuPertama());
        btnTerakhir.setOnClickListener(view -> sepatuTerakhir());
        btnSebelumnya.setOnClickListener(view -> sepatuSebelumnya());
        btnBerikutnya.setOnClickListener(view -> sepatuBerikutnya());


        txJenis = findViewById(R.id.txJenis);
        txNama = findViewById(R.id.txNama);
        txAsal= findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoSepatu = findViewById(R.id.gambarSepatu);

        txJudul = findViewById(R.id.txJudul);
        if(JenisSepatu.equalsIgnoreCase("Sepatu_kantor")){
            txJudul.setText(" Jenis Sepatu Kantor");
        }else if(JenisSepatu.equalsIgnoreCase("Sepatu_pesta")){
            txJudul.setText("Jenis Sepatu Pesta");
        }else if(JenisSepatu.equalsIgnoreCase("Sepatu_sport")){
            txJudul.setText("Jenis Sepatu Sport");
        }
    }


    private void tampilkanProfil() {
        Sepatu k = sepatus.get(indeksTampil);
        Log.d("SEPATU_KANTOR","Menampilkan sepatu_kantor"+k.getjenis());
        txJenis.setText(k.getjenis());
        txNama.setText(k.getnama());
        txAsal.setText(k.getasal());
        txDeskripsi.setText(k.getdeskripsi());
        ivFotoSepatu.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void sepatuPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void sepatuTerakhir() {
        int posAkhir = sepatus.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void sepatuBerikutnya() {
        if (indeksTampil == sepatus.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void sepatuSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
