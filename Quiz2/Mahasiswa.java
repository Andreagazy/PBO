package Quiz2;

public class Mahasiswa {
    public String nim, nama;
    public double nilai;
    // Konstruktor
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Menghitung ipk berdasarkan nilai
    public double hitung_ipk() {
        return nilai/100;
    }


    // oMenambahkan parameter nilai_sks untuk memberikan bobot pada nilai
    public double hitung_ipk(int nilai_sks) {
        return (hitung_ipk()*nilai_sks)/nilai_sks;
    }

}
