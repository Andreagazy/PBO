package Pertemuan7.Tugas;

public class Inheritance {
    public static void main(String[] args) {
        Mac mac =  new Mac("Apple", "Apple M1", 3, 16, "Li-Poly", "Touch Bar"); 

        Windows windows = new Windows("HP", "Intel i7", 3, 16, "Li-Ion", "Windows Hello");

        Pc pc = new Pc("Acer", "AMD Ryzen 5", 2, 8, 27);

        mac.tampilMac();
        System.out.println();
        windows.tampilWindows();
        System.out.println();
        pc.tampilPc();
    }
}
