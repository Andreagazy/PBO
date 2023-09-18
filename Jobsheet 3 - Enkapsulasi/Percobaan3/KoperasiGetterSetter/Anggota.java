package Percobaan3.KoperasiGetterSetter;
public class Anggota {//Andreagazy Iza Amerianto
    private String nama, alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public float getSimpanan() {
        return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void pinjam(float uang){
        simpanan -= uang;
    }
}
