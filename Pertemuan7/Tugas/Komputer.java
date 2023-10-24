package Pertemuan7.Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer(){

    }
    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilData() {
        System.out.println("Merk\t\t\t: " + merk);
        System.out.println("Jenis Prosesor\t\t: " + jnsProsesor);
        System.out.println("Kecepatan Prosesor\t: " + kecProsesor + " GHz");
        System.out.println("Ukuran Memory\t\t: " + sizeMemory + " GB");
    }
}
