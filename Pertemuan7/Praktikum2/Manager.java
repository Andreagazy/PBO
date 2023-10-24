package Pertemuan7.Praktikum2;

public class Manager extends Karyawan{
    public int tunjangan;

    public Manager(){

    }

    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t\t: "+tunjangan);
        System.out.println("Total Gaji\t\t: "+(super.gaji+tunjangan));
    }
}
