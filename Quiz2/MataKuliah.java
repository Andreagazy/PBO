package Quiz2;

public class MataKuliah {
    public String nama_matakuliah;
    public int sks;
    public double nilai_mahasiswa;

    // Konstruktor 
    public MataKuliah(String nama_matakuliah, int sks, double nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    // Hitung bobot berdasarkan nilai mahasiswa
    public double hitung_bobot() {
        if (nilai_mahasiswa > 80) {
            return 4 * sks;
        } else if (nilai_mahasiswa > 73 && nilai_mahasiswa <= 80) {
            return 3.5 * sks;
        } else if (nilai_mahasiswa > 65 && nilai_mahasiswa <= 73) {
            return 3 * sks;
        } else if (nilai_mahasiswa > 60 && nilai_mahasiswa <= 65) {
            return 2.5 * sks;
        } else if (nilai_mahasiswa > 50 && nilai_mahasiswa <= 60) {
            return 2 * sks;
        } else if (nilai_mahasiswa > 39 && nilai_mahasiswa <= 50) {
            return 1 * sks;
        } else {
            return 0;
        }
    }


    // Overlaod fungsi dan menambahkan parameter bobot mahasiswa
    public double hitung_bobot(double bobot_mahasiswa) {
        return bobot_mahasiswa/100*sks;
    }
}
