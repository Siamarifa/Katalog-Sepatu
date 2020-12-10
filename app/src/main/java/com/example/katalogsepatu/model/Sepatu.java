package com.example.katalogsepatu.model;

public class Sepatu {
    private String jenis;
    private String nama;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public Sepatu(String jenis, String nama, String asal, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.nama = nama;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }
    public String getjenis() {
        return jenis;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getasal() {
        return asal;
    }

    public void setasal(String asal) {
        this.asal = asal;
    }

    public String getdeskripsi() {
        return deskripsi;
    }

    public void setdeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
