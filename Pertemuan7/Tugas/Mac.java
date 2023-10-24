package Pertemuan7.Tugas;

public class Mac extends Laptop{
    public String security;

    public Mac(){

    }
    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai, String security) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security\t\t: " + security);
    }
}
