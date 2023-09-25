package Pertemuan4.Tugas;

public class TugasMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("BDL","Basis Data Lanjur" );
        MataKuliah mk2 = new MataKuliah("PBO", "Pemrograman Berbasis Objek");
        MataKuliah mk3 = new MataKuliah("DPW", "Desain dan Pemrograman Web");

        Mahasiswa mhs1 = new Mahasiswa("2241720146","Agzy", "Teknologi Informasi", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("2241720111","Achmad", "Teknologi Informasi", "Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("2241720099","Reza", "Teknologi Informasi", "Teknik Informatika");
        Mahasiswa mhs4 = new Mahasiswa("2241720024","Mira", "Teknologi Informasi", "Teknik Informatika");
        Mahasiswa mhs5 = new Mahasiswa("2241720105","Alice", "Teknologi Informasi", "Teknik Informatika");

        mhs1.tambahMK(mk1,mk2,mk3);
        mhs2.tambahMK(mk1,mk2,mk3);
        mhs3.tambahMK(mk1,mk2,mk3);
        mhs4.tambahMK(mk1,mk2,mk3);
        mhs5.tambahMK(mk1,mk2,mk3);
        
        // mhs1.tampilData();

        Dosen dsn1 = new Dosen("0900123","Mbappesi", mk2);

        Kelas kls1 = new Kelas("LPR01","Lab Pemrograman 1", dsn1);
        kls1.tambahMHS(mhs1,mhs2,mhs3,mhs4,mhs5);
        kls1.info();
    }
}
