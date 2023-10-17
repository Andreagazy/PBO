package Pertemuan6.Tugas;

public class Pegawai {
    public String nip,nama,alamat;
    private int gaji;

    public Pegawai(String nip, String nama, String alamat){
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
    }
    public String getNama() {
        return nama;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public int getGaji() {
        return gaji;
    }
}
