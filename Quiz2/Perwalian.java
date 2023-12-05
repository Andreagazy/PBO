package Quiz2;

import java.util.ArrayList;

public class Perwalian {
    // Atribut menggunakan arraylist
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<MataKuliah> daftarMataKuliah;
    int jumlah_sks;
    // 
    public Perwalian() {
        daftarMahasiswa = new ArrayList<>();
        daftarMataKuliah = new ArrayList<>();
    }
    // Fungsi Penambahan mahasiswa menggunakan method yang dimiliki oleh arraylist yaitu add
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }
    
    // Fungsi Penambahan Mata Kuliah menggunakan method yang dimiliki oleh arraylist yaitu add
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
        jumlah_sks+=mataKuliah.sks;
    }

    // Fungsi Untuk Print all data Mahasiswa Beserta 
    public void printAll(){
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("=============== Data Perwalian ===============");
            System.out.println("NIM : "+ daftarMahasiswa.get(i).nim);
            System.out.println("Nama : "+ daftarMahasiswa.get(i).nama);
            System.out.println("Nilai : "+ daftarMahasiswa.get(i).nilai);
            // Tanpa Parameter
            System.out.println("IPK : "+ daftarMahasiswa.get(i).hitung_ipk());
            // Menggunakan Parameter
            System.out.println("IPK Menggunakan Fungsi Berparameter : "+ daftarMahasiswa.get(i).hitung_ipk(jumlah_sks));
            for (int j = 0; j < daftarMataKuliah.size(); j++) {
                System.out.println("================================================");
                System.out.println("Mata Kuliah : " + daftarMataKuliah.get(j).nama_matakuliah);
                System.out.println("SKS : " + daftarMataKuliah.get(j).sks);
                System.out.println("Nilai Mahasiswa : " + daftarMataKuliah.get(j).nilai_mahasiswa);
                // Tanpa Parameter
                System.out.println("Bobot : " + daftarMataKuliah.get(j).hitung_bobot());
                // Menggunakan Fungsi Berparameter
                System.out.println("Bobot Menggunakan Fungsi Berparameter : " + daftarMataKuliah.get(j).hitung_bobot(daftarMahasiswa.get(i).hitung_ipk()));
            }
            System.out.println("================================================");
        }
    }
}
