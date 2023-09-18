package Tugas.Tugas4;

public class Anggota {//Andreagazy Iza Amerianto
    private String noKtp, nama;
    private int limitPinjaman, jumlahPinjaman;

    Anggota(String noKtp, String nama,int limitPinjaman){
        this.noKtp=noKtp;
        this.nama=nama;
        this.limitPinjaman=limitPinjaman;
        jumlahPinjaman=0;
    }
    public String getNoKtp() {
    return noKtp;
    }
    public String getNama() {
        return nama;
    }
    public int getLimitPinjaman() {
        return limitPinjaman;
    }
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    public void pinjam(int jumlah){
        if (jumlah>limitPinjaman) {
            System.out.println("Maaf, jumlah peminjaman melebihi limit");
        }else{
            jumlahPinjaman+=jumlah;
        }
    }

    public void angsur(int jumlah){
        jumlahPinjaman-=jumlah;
        if (jumlahPinjaman<0) {
            System.out.println("Anda memiliki kembalian "+ Math.abs(jumlahPinjaman));
            jumlahPinjaman=0;
        }
    }
}
