package com.example.nalikaapp.model;

public class BestSeller {
    String nama;
    String harga;
    Integer imgurl;

    public BestSeller(String nama, String harga, Integer imgurl) {
        this.nama = nama;
        this.harga = harga;
        this.imgurl = imgurl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Integer getImgurl() {
        return imgurl;
    }

    public void setImgurl(Integer imgurl) {
        this.imgurl = imgurl;
    }
}
