package Pertemuan4.Tugas;

import java.util.ArrayList;
import java.util.List;

public class Kelas {
    private String kode, deskripsi;
    private List <Mahasiswa> mhs;
    private Dosen dosen;

    public Kelas() {

    }

    public Kelas(String kode, String deskripsi, Dosen dosen) {
        this.kode = kode;
        this.deskripsi = deskripsi;
        this.dosen = dosen;
        this.mhs = new ArrayList<>();
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void tambahMHS(Mahasiswa ...mhs){
        for (int i = 0; i < mhs.length; i++) {
            this.mhs.add(mhs[i]);
        }
    }

    public void info(){
        System.out.println("Kelas : " + kode +" - "+ deskripsi);
        System.out.println("Dosen : "+this.dosen.getNama());
        System.out.println("Mata Kuliah : "+this.dosen.getMk().getNama());
        infoMahasiswa();
    }

    public void infoMahasiswa(){
        System.out.println("Daftar Mahasiswa di Kelas ini : ");
        for (int i = 0; i < mhs.size(); i++) {
            System.out.println((i+1)+". "+mhs.get(i).getNama());
        }
    }
}
