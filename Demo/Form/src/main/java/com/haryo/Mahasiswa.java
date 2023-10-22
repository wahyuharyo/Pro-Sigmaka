package com.haryo;

public class Mahasiswa {
	private String nama;
    private String nim;
    private String tglLahir;
//    private MyDate tglLahir;
    private String alamat;
    
    public Mahasiswa(String nama, String nim, String tglLahir, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
    }

    // ===== GETTER =====

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getTglLahir() {
        return tglLahir;
    }
    
    public String getAlamat() {
    	return alamat;
    }


    // ===== SETTER =====

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    public void setAlamat(String alamat) {
    	this.alamat = alamat;
    }
    

    // ===== OUTPUT =====
    
    public String toString() {
        return "Nama: " + nama + "\n" + "NIM: " + nim + "\n" + "Tanggal Lahir: " + tglLahir;    
        }
}
