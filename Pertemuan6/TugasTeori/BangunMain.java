package Pertemuan6.TugasTeori;

public class BangunMain {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lgn = new Lingkaran();
        Segitiga sgt = new Segitiga();

        pp.panjang = 24;
        pp.lebar = 12;
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());
        System.out.println("Luas Persegi Panjang\t: " + pp.luas());
        
        System.out.println();

        lgn.r=20;
        System.out.println("Keliling Lingkaran\t: " + lgn.keliling());
        System.out.println("Luas Lingkaran \t\t: " + lgn.luas());
        
        System.out.println();

        sgt.alas=28;
        sgt.tinggi=8;
        System.out.println("Keliling Segitiga\t: " + sgt.keliling());
        System.out.println("Luas Segitiga \t\t: " + sgt.luas());

    }
}
