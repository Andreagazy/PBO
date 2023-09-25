package Pertemuan4.Tugas;

public class MataKuliah {
    private String kode, nama;

    public MataKuliah() {

    }
    public MataKuliah(String kode, String nama){
        this.kode=kode;
        this.nama=nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }
    public void infoMK(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama : "+nama);
    }
}
