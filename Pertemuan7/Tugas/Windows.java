package Pertemuan7.Tugas;

public class Windows extends Laptop{
    public String fitur;
    public Windows(){

    }
    public Windows(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai, String fitur) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t: " + fitur);
    }
}
