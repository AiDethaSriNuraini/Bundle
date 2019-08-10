package com.example.bundle;

import java.io.Serializable;

public class Pegawai implements Serializable {
    private String nama;
    private String alamat;
    private String noHp;
    private String pekerjaan;
    private String lamaKerja;
    private String asalSekolah;
    private String kompetensi;

    public Pegawai(String nama, String alamat, String noHp, String pekerjaan, String lamaKerja, String asalSekolah, String kompetensi) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.pekerjaan = pekerjaan;
        this.lamaKerja = lamaKerja;
        this.asalSekolah = asalSekolah;
        this.kompetensi = kompetensi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(String lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }
}
