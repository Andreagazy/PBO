package Pertemuan4.Tugas;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim, nama, jurusan, prodi;
    private List <MataKuliah> mk;
    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama, String jurusan,String prodi){
        this.nim=nim;
        this.nama=nama;
        this.jurusan=jurusan;
        this.prodi=prodi;
        this.mk = new ArrayList<>();
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public void tambahMK(MataKuliah ...mk){
        for (int i = 0; i < mk.length; i++) {
            this.mk.add(mk[i]);
            
        }
    }

    public void tampilData(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Prodi : "+prodi);
        mkDiambil();
    }

    public void mkDiambil(){
        System.out.println("Mata Kuliah yang Diambil : ");
        for (int i = 0; i < mk.size(); i++) {
            System.out.println(i+1 +". "+mk.get(i).getNama());
        }
    }
}