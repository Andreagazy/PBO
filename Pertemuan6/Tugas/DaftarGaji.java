package Pertemuan6.Tugas;

import java.util.ArrayList;

public class DaftarGaji {
    // public Pegawai[] listPegawai;;
    public ArrayList<Pegawai> listPegawai;
    int gaji;
    public DaftarGaji(int gaji){
        this.gaji=gaji;
        listPegawai = new ArrayList<>();
    }

    public void addPegawai(Pegawai ...p){
        for (int i = 0; i < p.length; i++) {
            p[i].setGaji((this.gaji));
            listPegawai.add(p[i]);
        }
    }

    public void printSemuaGaji(){
        System.out.println("NIP\t||Nama\t\t||Alamat\t||Gaji");
        for (int i = 0; i < listPegawai.size(); i++) {
            System.out.println(listPegawai.get(i).nip + "\t||" + listPegawai.get(i).nama + "\t||" + listPegawai.get(i).alamat + "\t||"+listPegawai.get(i).getGaji() );
        }
    }

}
