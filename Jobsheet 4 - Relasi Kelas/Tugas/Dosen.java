package Pertemuan4.Tugas;

public class Dosen {
    private String nip, nama;
    private MataKuliah mk;
    public Dosen() {

    }

    public Dosen(String nip, String nama, MataKuliah mk){
        this.nip=nip;
        this.nama=nama;
        this.mk=mk;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setMk(MataKuliah mk) {
        this.mk = mk;
    }
    public MataKuliah getMk() {
        return mk;
    }
}
