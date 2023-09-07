public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();


        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinola No 1A";
        mhs1.kelas= "1A";
        mhs1.tampilBiodata();


        mhs2.nim=102;
        mhs2.nama="Achmad";
        mhs2.alamat="Jl. Kembang No 20";
        mhs2.kelas= "1F";
        mhs2.tampilBiodata();


        mhs3.nim=103;
        mhs3.nama="Irelda";
        mhs3.alamat="Jl. Chorus No 4D";
        mhs3.kelas= "1C";
        mhs3.tampilBiodata();
    }
}
