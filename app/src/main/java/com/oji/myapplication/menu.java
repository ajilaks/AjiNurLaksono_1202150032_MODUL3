package com.oji.myapplication;

/**
 * Created by OJI on 16/02/2018.
 */

public class menu {
    private int gambar ;
    private String nama, harga, komposisi;
    public menu(int gambar, String nama, String komposisi, String harga ) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }
    public String getKomposisi() {
        return komposisi;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


}
