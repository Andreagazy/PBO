package Pertemuan6.Tugas;

public class Dosen extends Pegawai{

    public int jumlahSKS, TARIF_SKS = 200000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public void setGaji(int gaji){
        super.setGaji(gaji);
    }
    
    public int getGaji(){
        return super.getGaji()+ (jumlahSKS*TARIF_SKS);
    }
    
    
}
