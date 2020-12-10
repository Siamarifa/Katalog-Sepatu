package com.example.katalogsepatu;

import android.content.Context;

import com.example.katalogsepatu.model.Sepatu;
import com.example.katalogsepatu.model.Sepatu_kantor;
import com.example.katalogsepatu.model.Sepatu_pesta;
import com.example.katalogsepatu.model.Sepatu_sport;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Sepatu> Sepatus = new ArrayList<>();

    private static List<Sepatu_kantor> initDataSepatu_kantor(Context ctx) {
        List<Sepatu_kantor> sepatu_kantors = new ArrayList<>();
        sepatu_kantors.add(new Sepatu_kantor("Sepatu Oxford", "Eropa",
                " Kebanyakan orang sudah mengetahui model sepatu oxford karena desainnya yang timeless", R.drawable.sepatu_oxford));
        sepatu_kantors.add(new Sepatu_kantor("Sepatu Wingtip", "Sakura",
                "Sepatu model ini tidak seformal oxford shoes, tapi masih bisa memberikan kesan berkelas bagi penggunanya", R.drawable.sepatu_wingtip));
        sepatu_kantors.add(new Sepatu_kantor("Sepatu Derby", "Eropa",
                " oxford shoes yang sebaiknya hanya dipakai untuk acara formal saja, kali ini ada model derby shoes", R.drawable.sepatu_derby));
        sepatu_kantors.add(new Sepatu_kantor("Sepatu Brogue", "Veatman",
                "Jenis sepatu formal yang satu ini sebenarnya dapat kamu temukan pada oxford dan derby", R.drawable.sepatu_brogue));
        sepatu_kantors.add(new Sepatu_kantor("Sepatu Monk Strap", "Sakura",
                "Perbedaan yang paling mencolok dengan model-model sebelumnya ada pada tali kulit bahu pengikat sepatu yang cukup lebar", R.drawable.sepatu_monkstrap));
        return sepatu_kantors;
    }

    private static List<Sepatu_pesta> initDataSepatu_pesta(Context ctx) {
        List<Sepatu_pesta> sepatu_pestas = new ArrayList<>();
        sepatu_pestas.add(new Sepatu_pesta("Sepatu Sneakers", "Amerika Serikat",
                "Ciri khas sepatu ini adalah sol sepatunya yang flat dan terbuat dari bahan sintetis dan bahan karet yang fleksibel, sementara pada bagian atas sepatunya umumnya terbuat dari material kain kanvas.", R.drawable.sepatu_sneakers));
        sepatu_pestas.add(new Sepatu_pesta("Sepatu Flatshoes", "Mesopotamia",
                " Flatshoes merupakan sepatu yang dianggap paling aman dan sehat sebagai pelindung kaki dibandingkan dengan semua jenis sepatu wanita lainnya ", R.drawable.sepatu_flatshoes));
        sepatu_pestas.add(new Sepatu_pesta("Sepatu Boots", "Bangsa Mongol",
                " Sepatu yang identik dengan karakter koboi ini pada awalnya digunakan untuk melindungi kaki dari air, lumpur, dan salju karena desain sepatunya yang dapat menutupi hingga mata kaki.", R.drawable.sepatu_boots));
        sepatu_pestas.add(new Sepatu_pesta("Sepatu High Heels", "Prancis",
                "Sepatu high heels memiliki keunikan tersendiri pada alasnya yaitu memiliki hak yang lebih tinggi dibandingkan flatshoes ", R.drawable.sepatu_highheels));
        sepatu_pestas.add(new Sepatu_pesta("Sepatu Stiletto Heels", " Prancis ",
                "Sepatu yang merupakan salah satu jenis dari sepatu high heels yang banyak disukai wanita dewasa karena bentuknya yang unik dan dapat memancarkan keanggunan dan keseksian bagi pemakainya ", R.drawable.sepatu_stilettoheels));
        return sepatu_pestas;
    }


    private static List<Sepatu_sport> initDataSepatu_sport(Context ctx) {
        List<Sepatu_sport> sepatu_sports = new ArrayList<>();
        sepatu_sports.add(new Sepatu_sport("Sepatu Training Shoes", "Jepang",
                "Sepatu ini ideal untuk berlari dan olahraga setiap hari namun bisa jadi terlalu rumit untuk perlombaan yang pendek", R.drawable.sepatu_trainingshoes));
        sepatu_sports.add(new Sepatu_sport("Sepatu Football Boots", "Inggris",
                "Sepatu ini didesain untuk membantu para pemain sepakbola berbelok, mengubah tujuan atau arah, mengoper dan menendang", R.drawable.sepatu_footballboots));
        sepatu_sports.add(new Sepatu_sport("Sepatu Futsal", "Asia",
                " Model upper atau atasannya mirip sepatu sepakbola, sementara solnya mirip dengan sepatu badminton atau voli", R.drawable.sepatu_futsal));
        sepatu_sports.add(new Sepatu_sport("Sepatu Tenis", "Amerika Serikat",
                "Sepatu ini berprofil rendah agar kontaknya baik dengan permukaan lapangan, bagian depan dan belakang memiliki bantalan, cengkeraman pada sol yang tepat untuk permukaan lapangan yang berbeda-beda, dan karet yang tahan lama", R.drawable.sepatu_tenis));
        sepatu_sports.add(new Sepatu_sport("Sepatu Basket", "Amerika Serikat",
                "Olahraga basket terdiri dari pergerakan seperti berlari, melompat, dan berganti arah dengan tiba-tiba atau sangat cepat", R.drawable.sepatu_basket));
        return sepatu_sports;
    }

    private static void initAllSepatus(Context ctx) {
        Sepatus.addAll(initDataSepatu_kantor(ctx));
        Sepatus.addAll(initDataSepatu_pesta(ctx));
        Sepatus.addAll(initDataSepatu_sport(ctx));
    }

    public static List<Sepatu> getAllSepatu(Context ctx) {
        if (Sepatus.size() == 0) {
            initAllSepatus(ctx);
        }
        return Sepatus;
    }

    public static List<Sepatu> getSepatusByTipe(Context ctx, String jenis) {
        List<Sepatu> SepatusByType = new ArrayList<>();
        if (Sepatus.size() == 0) {
            initAllSepatus(ctx);
        }
        for (Sepatu h : Sepatus) {
            if (h.getjenis().equals(jenis)) {
                SepatusByType.add(h);
            }
        }
        return SepatusByType;
    }
}
