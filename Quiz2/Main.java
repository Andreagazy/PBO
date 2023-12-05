package Quiz2;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek mahasiswa dan mata kuliah
        Mahasiswa mahasiswa1 = new Mahasiswa("Andre", "123454321", 370);
        Mahasiswa mahasiswa2 = new Mahasiswa("Agazy", "678909876", 385);

        MataKuliah mataKuliah1 = new MataKuliah("Basis Data", 4, 85);
        MataKuliah mataKuliah2 = new MataKuliah("Sistem Operasi", 3,79);

        // Simulasi proses perwalian
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);

        perwalian.tambahMataKuliah(mataKuliah1);
        perwalian.tambahMataKuliah(mataKuliah2);

        // Cetak hasil perwalian, termasuk IPK masing-masing mahasiswa dan bobot mata
        // kuliah yang diambil
        perwalian.printAll();
    }
}
