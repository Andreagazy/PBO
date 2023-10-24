package Pertemuan7.Tugas;

public class Laptop extends Komputer{
    public String jnsBaterai;

    public Laptop(){

    }

    public Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai\t\t: " + jnsBaterai);
    }

    
}
