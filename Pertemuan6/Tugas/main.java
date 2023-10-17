package Pertemuan6.Tugas;

public class main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("22001", "Ardiansyah", "Lamongan");
        Pegawai pegawai2 = new Pegawai("22002", "Dimetrescu", "Nganjuk");

        Dosen dosen1 = new Dosen("22003", "Valeria", "Blitar");
        Dosen dosen2 = new Dosen("22004", "Miranda", "Kediri");
        dosen1.setSKS(20);
        dosen1.getGaji();
        
        dosen2.setSKS(24);
        dosen2.getGaji();
        
        DaftarGaji gaji = new DaftarGaji(10000000);
        gaji.addPegawai(pegawai1,pegawai2,dosen1,dosen2);

        gaji.printSemuaGaji();
    }
}
