package Tugas.Tugas6;

import java.util.Scanner;

public class TestKoperasi {// Andreagazy Iza Amerianto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check = 't';
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        
        System.out.println("Nama Anggota : "+ donny.getNama());
        System.out.println("Limit Pinjaman : "+donny.getLimitPinjaman());

        do {
            System.out.print("Masukkan pinjaman : ");
            int jmlhPinjam = sc.nextInt();
            sc.nextLine();
            donny.pinjam(jmlhPinjam);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            System.out.println();
            System.out.println("Apakah ingin meminjam lagi?(y/t)");
            check = sc.next().charAt(0);
            sc.nextLine();
        } while (check == 'y' || check == 'Y');
        
        do {
            System.out.print("Masukkan angsuran : ");
            int jmlhAngsur = sc.nextInt();
            sc.nextLine();
            donny.angsur(jmlhAngsur);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            System.out.println();
            System.out.println("Apakah ingin melakukan angsuran lagi?(y/t)");
            check = sc.next().charAt(0);
            sc.nextLine();
        } while (check == 'y' || check == 'Y');

        sc.close();
    }
}
