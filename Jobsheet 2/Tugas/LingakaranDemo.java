public class LingakaranDemo {
    public static void main(String[] args) {
        Lingkaran lkr1 = new Lingkaran();
        Lingkaran lkr2 = new Lingkaran();
        

        lkr1.phi=3.14;
        lkr1.r= 10;
        System.out.println("Luas Linkaran 1 : "+ lkr1.hitungLuas());
        System.out.println("Keliling Linkaran 1 : "+ lkr1.hitungKeliling());
        
        lkr2.phi=3.14;
        lkr2.r= 25;
        System.out.println("Luas Linkaran 1 : "+ lkr2.hitungLuas());
        System.out.println("Keliling Linkaran 1 : "+ lkr2.hitungKeliling());
        
        

    }
}
