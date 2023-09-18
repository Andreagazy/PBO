package Percobaan2.MotorEncapsulation;
public class Motor {//Andreagazy Iza Amerianto
    private int kecepatan = 0, kecepatanMax = 100;//Menambah atribut kecepatanMax
    private boolean kontakOn = false;
    

    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
            if (kecepatan>kecepatanMax) {
                kecepatan=kecepatanMax;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan : " + kecepatan + "\n");
    }
}