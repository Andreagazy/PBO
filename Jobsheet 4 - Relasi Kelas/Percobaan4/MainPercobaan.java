package Pertemuan4.Percobaan4;

public class MainPercobaan {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang budi = new Penumpang("00001", "Budiono");
        Penumpang jack = new Penumpang("00002", "Jackie");

        Gerbong gerbong = new Gerbong("A", 10);

        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(budi, 1);
        gerbong.setPenumpang(jack, 1);
        
        System.out.println(gerbong.info());
    }
}
